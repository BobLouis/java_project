import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class tryFX extends Application{
	@Override
	public void start(Stage stage) {
		Label label = new Label("helloworld, javaFx");
		Scene scene = new Scene(new StackPane(label),300,200);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
