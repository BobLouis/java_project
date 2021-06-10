module java_final_project {
	requires javafx.controls;
	requires javafx.fxml;
	//requires poi.ooxml;
	
	requires xmlbeans;
	requires poi.ooxml.schemas;
	requires commons.collections4;
	requires poi;
	opens application to javafx.graphics, javafx.fxml;
}
