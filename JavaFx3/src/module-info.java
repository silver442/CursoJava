module JavaFx3 {
	exports layoutPanes;
	exports aplicacionCompleta;
	exports controles;
	exports trabajoScene;
	exports menu;
	exports shapes;
	exports dinamico;
	exports audios;
	exports video;
	exports animaciones;
	
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.media;
	
	
	opens application to javafx.graphics, javafx.fxml;
}
