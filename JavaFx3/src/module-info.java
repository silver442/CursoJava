module JavaFx3 {
	exports layoutPanes;
	exports aplicacionCompleta;
	requires javafx.controls;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
