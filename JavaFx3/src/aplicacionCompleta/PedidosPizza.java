package aplicacionCompleta;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class PedidosPizza extends Application{

	public void start(Stage primaryStage) {
		
		miStage=primaryStage;
	
		//------------Creación del panel superior-----------
		
		Text txtCabecera=new Text("Pide tu pizza ahora");
		
		txtCabecera.setFont(new Font(20));
		
		HBox paneSuperior=new HBox(txtCabecera);
		
		paneSuperior.setPadding(new Insets(20,10,20,10));
		
		//-----creación del panel datos del cliente------
		
		// Label y TextField del nombre
		
		Label lblNombre=new Label("Nombre: ");
		
		lblNombre.setPrefWidth(100);
		
		cuadroNombre=new TextField();
		
		cuadroNombre.setPrefColumnCount(20);
		
		cuadroNombre.setPromptText("Introduce tu nombre aqui");
	
		HBox paneNombre=new HBox(lblNombre, cuadroNombre);
		
		// Label y TextField del tfno
		
		Label lblTfno=new Label("Teléfono: ");
		
		lblTfno.setPrefWidth(100);
		
		cuadroTfno=new TextField();
		
		cuadroTfno.setPrefColumnCount(20);
		
		cuadroTfno.setPromptText("Introduce tu Tfno aqui");
	
		HBox paneTfno=new HBox(lblTfno, cuadroTfno);
	
		//Label y TextoField de la dirección
		
		Label lblDireccion=new Label("Dirección: ");
		
		lblDireccion.setPrefWidth(100);
		
		cuadroDireccion=new TextField();
		
		cuadroDireccion.setPrefColumnCount(20);
		
		cuadroDireccion.setPromptText("Introduce tu dirección aqui");
	
		HBox paneDireccion=new HBox(lblDireccion, cuadroDireccion);
		
		// creación del panel de datos
		
		VBox paneCliente=new VBox(10, paneNombre, paneTfno, paneDireccion);
		
		
		
	}
	
	public void main(String[] args) {
		launch(args);
	}
	
	
	
	Stage miStage;
	
	TextField cuadroNombre, cuadroTfno, cuadroDireccion;
	
	RadioButton radioPeq, radioMed, radioGran;
	
	RadioButton radioFina, radioNormal;
	
	CheckBox chkPepperoni, chkQueso, chkPimiento, chkAceitunas, chkCampi, chkTomate, chkAnchoas;
	
}
