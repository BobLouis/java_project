package application;
	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		// Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.LIGHTSKYBLUE);
//		stage position setting
		stage.setX(50);
		stage.setY(50);
		
		//icon setting but doesn't work
		
		
		
		
		Text text = new Text();
		text.setText("whoa");
		text.setX(100);
		text.setY(100);
		text.setFont(Font.font("Verdana",100));
		text.setFill(Color.DARKOLIVEGREEN);
		
		
		//two dots make line
		Line line = new Line();
		line.setStartX(300);
		line.setStartY(300);
		line.setEndX(300);
		line.setEndY(600);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setOpacity(0.1);  //transparent
		line.setRotate(45);  //clockwise rotate
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.DARKGREEN);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.BLACK);
		rectangle.setRotate(45);
		
		Polygon triangle = new Polygon();

		
		triangle.getPoints().setAll(
				200.0,200.0,
				300.0,300.0,
				200.0,300.0
				);
		triangle.setFill(Color.YELLOW);
		
		
		Circle circle = new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.BLUE);
		
		Image image = new Image("file:/Users/kounuki/eclipse-workspace/HelloFX/src/png.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(400);
		imageView.setY(400);
		
		//full screen setting
//		stage.setFullScreen(true);
//		stage.setFullScreenExitHint("You can't escape unless you press Q");
//		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);	
		root.getChildren().add(imageView);
		stage.setTitle("hello stage");
		stage.getIcons().add(image);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
