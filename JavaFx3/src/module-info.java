module JavaFx3 {
	exports layoutPanes;
	exports aplicacionCompleta;
	exports controles;
	exports trabajoScene;
	exports menu;
	exports shapes;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
