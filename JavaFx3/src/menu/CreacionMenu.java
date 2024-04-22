package menu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CreacionMenu extends Application{

	@Override
	public void start(Stage primaryStage) {
		
		MenuBar menuBar=new MenuBar();
		
		Menu menuArchivo=new Menu("Archivo");
		
		menuBar.getMenus().add(menuArchivo);
		
		MenuItem menuItemNuevo=new MenuItem("Nuevo");
		
		MenuItem menuItemGuardar=new MenuItem("Guardar");
		
		menuArchivo.getItems().add(menuItemNuevo);
		
		menuArchivo.getItems().add(menuItemGuardar);
		
		BorderPane miPane=new BorderPane(null, menuBar, null, null, null);
		
		Scene miScene=new Scene(miPane, 900, 600);
	
		primaryStage.setScene(miScene);
		
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
