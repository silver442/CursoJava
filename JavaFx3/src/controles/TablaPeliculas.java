package controles;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TablaPeliculas extends Application{

	@Override
	public void start(Stage primaryStage){
	
		Label lblCabecera=new Label("Lista de Películas");
		
		lblCabecera.setFont(new Font("Arial", 20));
		
		tablaPeliculas=new TableView<PeliculasDeTabla>();
		
		tablaPeliculas.setEditable(true);
		
		tablaPeliculas.setItems(cargaDatos());
		
		//---- Columna del titulo-----------
		
		TableColumn<PeliculasDeTabla, String> colTitulo=new TableColumn("Titulo");
		
		//Ancho
		colTitulo.setMinWidth(290);
		
		// eStablecer el valor
		colTitulo.setCellValueFactory(new PropertyValueFactory<PeliculasDeTabla, String>("titulo"));
		
		colTitulo.setCellFactory(TextFieldTableCell.forTableColumn());
		
		colTitulo.setOnEditCommit(e->modificaTitulo(e));
		
		
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
	
		// Construcción del panel inferior
		
		txtTitulo=new TextField();
		
		txtTitulo.setPromptText("Titulo");
		
		txtTitulo.setMinWidth(100);
		
		
		txtAño=new TextField();
		
		txtAño.setPromptText("Año");
		
		txtAño.setMinWidth(100);
		
		
		txtPrecio=new TextField();
		
		txtPrecio.setPromptText("Precio");
		
		txtPrecio.setMinWidth(100);
		
		Button botonAgregar=new Button("Agregar");
		
		botonAgregar.setMinWidth(70);
		
		botonAgregar.setOnAction(e-> agregarPeliculas());
		
		Button botonEliminar=new Button("Eliminar");
		
		botonEliminar.setMinWidth(70);
		
		botonEliminar.setOnAction(e-> eliminarPeliculas());
		
		
		HBox panelAgregar=new HBox();
		
		panelAgregar.setSpacing(7);

		panelAgregar.getChildren().addAll(txtTitulo,txtAño,txtPrecio, botonAgregar, botonEliminar);
		
		
		
		
		// Construcción del pane principal
		
		VBox panePrincipal=new VBox();
		
		panePrincipal.setPadding(new Insets(10,10,10,10));
		
		panePrincipal.getChildren().addAll(lblCabecera, tablaPeliculas, panelAgregar);
		
		// ---Scene y primaryStage----
		
		Scene miScene=new Scene(panePrincipal);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Listado de peliculas");
		
		primaryStage.show();
	
	
	}
	
	private void modificaTitulo(CellEditEvent<PeliculasDeTabla, String> e) {
		// TODO Auto-generated method stub
		
		PeliculasDeTabla p=e.getRowValue();
		
		p.setTitulo(e.getNewValue());

	}

	public ObservableList<PeliculasDeTabla> cargaDatos(){
		
		ObservableList<PeliculasDeTabla> datos=FXCollections.observableArrayList();
		
		datos.add(new PeliculasDeTabla("Heat",1995,29.95));
		
		datos.add(new PeliculasDeTabla("BraveHeart",1995,19.95));
		
		datos.add(new PeliculasDeTabla("Gladiator",2000,29.95));
		
		datos.add(new PeliculasDeTabla("Gran Torino",2008,29.95));
		
		datos.add(new PeliculasDeTabla("El padrino",1972,19.95));
		
		datos.add(new PeliculasDeTabla("Scarface",1983,19.95));
		
		datos.add(new PeliculasDeTabla("El último Samurai",2003,19.95));
		
		datos.add(new PeliculasDeTabla("7 años en el Tíbet",1997,19.95));
		
		datos.add(new PeliculasDeTabla("Tasi Driver",1976,19.95));
		
		datos.add(new PeliculasDeTabla("Collateral",2004,19.95));
		
		return datos;
		
	}
	
	public void agregarPeliculas() {
		
		PeliculasDeTabla peliNueva=new PeliculasDeTabla();
		
		peliNueva.setTitulo(txtTitulo.getText());
		
		peliNueva.setAño(Integer.parseInt(txtAño.getText()));
	
		peliNueva.setPrecio(Double.parseDouble(txtPrecio.getText()));
	
		tablaPeliculas.getItems().add(peliNueva);
	
		txtTitulo.clear();
		
		txtAño.clear();
		
		txtPrecio.clear();
	}
	
	public void eliminarPeliculas() {
		
		ObservableList<PeliculasDeTabla> seleccionados=tablaPeliculas.getSelectionModel().getSelectedItems();
		
		ObservableList<PeliculasDeTabla> peliculas=tablaPeliculas.getItems();
		
		for (PeliculasDeTabla p: seleccionados) {
			
			peliculas.remove(p);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
	TextField txtTitulo, txtAño, txtPrecio;

	TableView<PeliculasDeTabla> tablaPeliculas;
}
