package application;
	
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			Parent root = loader.load();
			Controller controller = loader.getController();
			Scene scene = new Scene(root);
			//for multiple scene 
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			AnimationTimer timer = new AnimationTimer() {
				@Override
				public void handle(long now) {
					update();
					controller.tick();
				}
			};
			
			timer.start();
			scene.setOnKeyPressed(e -> {
				switch (e.getCode()) {
				case A:
					controller.setVelx(-10);
					break;
				case D:
					controller.setVelx(10);
					break;
				case W:
					controller.jump();
					break;
				
					
				}
			});
			
			scene.setOnKeyReleased(e -> {
				switch (e.getCode()) {
				case A:
					controller.setVelx(0);
					break;
				case D:
					controller.setVelx(0);
					break;
//				case S:
//					controller.setVely(0);
//					break;
//				case W:
//					controller.setVely(0);
//					break;
					
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private void update() {

	}
}
