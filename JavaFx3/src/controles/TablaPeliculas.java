package controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TablaPeliculas extends Application{

	@Override
	public void start(Stage primaryStage){
	
		Label lblCabecera=new Label("Lista de Películas");
		
		lblCabecera.setFont(new Font("Arial", 20));
		
		TableView<PeliculasDeTabla> tablaPeliculas=new TableView<PeliculasDeTabla>();
		
		//---- Columna del titulo-----------
		
		TableColumn<PeliculasDeTabla, String> colTitulo=new TableColumn("Titulo");
		
		//Ancho
		colTitulo.setMinWidth(290);
		
		// eStablecer el valor
		colTitulo.setCellValueFactory(new PropertyValueFactory<PeliculasDeTabla, String>("titulo"));
		
		//---- Columna del Año-----------
		
		TableColumn<PeliculasDeTabla, Integer> colAño=new TableColumn("Año");
		
		//Ancho
		colAño.setMinWidth(290);
		
		// eStablecer el valor
		colAño.setCellValueFactory(new PropertyValueFactory<PeliculasDeTabla, Integer>("año"));
		
		//---- Columna del precio-----------
		
		TableColumn<PeliculasDeTabla, Double> colPrecio=new TableColumn("Precio");
		
		//Ancho
		colPrecio.setMinWidth(290);
		
		// eStablecer el valor
		colPrecio.setCellValueFactory(new PropertyValueFactory<PeliculasDeTabla, Double>("precio"));
		
		
		//--- AGREGANDO COLUMNAS AL TABLE VIEW--------
		
		tablaPeliculas.getColumns().addAll(colTitulo,colAño,colPrecio);
	
		// Construcción del pane principal
		
		VBox panePrincipal=new VBox();
		
		panePrincipal.setPadding(new Insets(10,10,10,10));
		
		panePrincipal.getChildren().addAll(lblCabecera, tablaPeliculas);
		
		// ---Scene y primaryStage----
		
		Scene miScene=new Scene(panePrincipal);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Listado de peliculas");
		
		primaryStage.show();
	
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
