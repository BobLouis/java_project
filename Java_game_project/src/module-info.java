module Java_game_project {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
