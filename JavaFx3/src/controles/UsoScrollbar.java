package controles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UsoScrollbar extends Application{

	public void start(Stage primaryStage) {
		
		// Crear textArea y su configuración
		
		TextArea miTextArea=new TextArea();
		miTextArea.setWrapText(true);
		miTextArea.setPrefSize(300, 200);
		
		
		// Crear el scrollbar y configurar
		ScrollBar miScroll=new ScrollBar();
		miScroll.setOrientation(javafx.geometry.Orientation.VERTICAL);
		miScroll.setMin(0);
		miScroll.setMax(100);
		miScroll.setValue(50);
		
		
		// vinculación del scroll con el textarea
		
		miScroll.valueProperty().addListener((observable, valorAnterior, nuevoValor)->{
						
			miTextArea.setScrollTop(nuevoValor.doubleValue());
			
		});
		
		
		// Crear contenedor y agregar elementos
		
		AnchorPane miAnchor=new AnchorPane();
		
		AnchorPane.setTopAnchor(miTextArea, 10.0);
		AnchorPane.setLeftAnchor(miTextArea, 10.0);
		AnchorPane.setTopAnchor(miScroll, 10.0);
		AnchorPane.setRightAnchor(miScroll, 10.0);
		AnchorPane.setBottomAnchor(miScroll, 10.0);
		
		miAnchor.getChildren().addAll(miTextArea, miScroll);
		
		// Agregar contenedor
		
		Scene miScene=new Scene(miAnchor, 350,250);
		
		primaryStage.setTitle("Trabajo con Scroll");
		primaryStage.setScene(miScene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
