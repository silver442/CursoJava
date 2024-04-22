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
		
		Menu menuOpciones=new Menu("Opciones");
		
		menuBar.getMenus().add(menuOpciones);
		
		//-----------Menu Items---------------
		
		menuItemNuevo=new MenuItem("Nuevo");
		
		menuItemNuevo.setOnAction(e->accionMenus(e));
		
		menuItemGuardarComo=new MenuItem("Guardar como");
		
		menuItemGuardarComo.setOnAction(e->accionMenus(e));
		
		menuItemGuardar=new MenuItem("Guardar");
		
		menuItemGuardar.setOnAction(e->accionMenus(e));
		
		/*menuArchivo.getItems().add(menuItemNuevo);
		
		menuArchivo.getItems().add(menuItemGuardar);*/
		
		menuArchivo.getItems().addAll(menuItemNuevo, menuItemGuardarComo, menuItemGuardar);
		
		MenuItem menuItemCortar=new MenuItem("Cortar");
		
		menuItemCortar.setOnAction(e->accionMenus(e));
		
		MenuItem menuItemCopiar=new MenuItem("Copiar");
		
		menuItemCopiar.setOnAction(e->accionMenus(e));
		
		menuItemPegar=new MenuItem("Pegar");
		
		menuItemPegar.setOnAction(e->accionMenus(e));
		
		menuItemPegar.setDisable(true);
		
		RadioMenuItem menuItemOp1=new RadioMenuItem("Opción 1");
		
		RadioMenuItem menuItemOp2=new RadioMenuItem("Opción 2");
		
		RadioMenuItem menuItemOp3=new RadioMenuItem("Opción 3");
		
		RadioMenuItem menuItemOp4=new RadioMenuItem("Opción 4");
		
		ToggleGroup opciones=new ToggleGroup();
		
		menuItemOp1.setToggleGroup(opciones);
		
		menuItemOp2.setToggleGroup(opciones);
		
		menuItemOp3.setToggleGroup(opciones);
		
		menuItemOp4.setToggleGroup(opciones);
		
		
		menuItemOp1.setOnAction(e->accionMenus(e));
		
		menuItemOp2.setOnAction(e->accionMenus(e));
		
		menuItemOp3.setOnAction(e->accionMenus(e));
		
		menuItemOp4.setOnAction(e->accionMenus(e));
		
		
		menuOpciones.getItems().addAll(menuItemOp1, menuItemOp2, menuItemOp3, menuItemOp4);
		
		menuEdicion.getItems().add(menuItemCortar);
		
		menuEdicion.getItems().add(menuItemCopiar);
		
		menuEdicion.getItems().add(menuItemPegar);
		
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
		
		//System.out.println("Has pulsado en el menú de: " + item.getText());
	
		//if(item.getText().equals("Guardar como")) item.setText("Guardar");
	
		if(item.getText().equals("Guardar como")) menuItemGuardar.setDisable(true);
	
		if(item.getText().equals("Cortar")) menuItemPegar.setDisable(false  );
		
		if(item.getText().equals("Copiar")) menuItemPegar.setDisable(false  );
		
		/*if(((RadioMenuItem) item).isSelected()==true) System.out.println(item.getText() + " activada");
		else System.out.println(item.getText() + " desactivada");*/
		
		if(e.getSource().getClass().getSimpleName().equals("RadioMenuItem")) {
			
			System.out.println(item.getText() + " activada");
			
		}
		
	}
	
	MenuItem menuItemNuevo;
	MenuItem menuItemGuardarComo, menuItemGuardar, menuItemPegar;
}
