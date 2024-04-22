package menu;

import javafx.application.Application;
import javafx.event.ActionEvent;
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
		
		Menu menuEdicion=new Menu("Edición");
		
		menuBar.getMenus().add(menuEdicion);
		
		Menu menuVer=new Menu("Ver");
		
		menuBar.getMenus().add(menuVer);
		
		Menu MenuInsertar=new Menu("Insertar");
		
		menuBar.getMenus().add(MenuInsertar);
		
		//-----------Menu Items---------------
		
		menuItemNuevo=new MenuItem("Nuevo");
		
		menuItemNuevo.setOnAction(e->accionMenus(e));
		
		menuItemGuardar=new MenuItem("Guardar");
		
		menuItemGuardar.setOnAction(e->accionMenus(e));
		
		/*menuArchivo.getItems().add(menuItemNuevo);
		
		menuArchivo.getItems().add(menuItemGuardar);*/
		
		menuArchivo.getItems().addAll(menuItemNuevo, menuItemGuardar);
		
		MenuItem menuItemCortar=new MenuItem("Cortar");
		
		menuItemCortar.setOnAction(e->accionMenus(e));
		
		MenuItem menuItemCopiar=new MenuItem("Copiar");
		
		menuEdicion.getItems().add(menuItemCortar);
		
		menuEdicion.getItems().add(menuItemCopiar);
		
		//----------Pane y Scene-----------------
		
		BorderPane miPane=new BorderPane(null, menuBar, null, null, null);
		
		Scene miScene=new Scene(miPane, 900, 600);
	
		primaryStage.setScene(miScene);
		
		primaryStage.show();
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void accionMenus(ActionEvent e) {
		
		/*if(e.getSource()==menuItemNuevo) System.out.println("Has pulsado el boton de Nuevo");
		
		else if(e.getSource()==menuItemGuardar) System.out.println("Has pulsado el boton de Guardar");*/
		
		MenuItem item=(MenuItem)e.getSource();
		
		System.out.println("Has pulsado en el menú de: " + item.getText());
	}
	
	MenuItem menuItemNuevo;
	MenuItem menuItemGuardar;
}
