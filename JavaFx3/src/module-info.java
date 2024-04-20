module JavaFx3 {
	exports layoutPanes;
	exports aplicacionCompleta;
	exports controles;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
