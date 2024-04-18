package aplicacionCompleta;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
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
		
		//-------Creación del pane de los pedidos-----------
		
		// Creación del pane del tamaño de las pizzas
		
		Label lblTamano=new Label("Tamaño");
		
		radioPeq=new RadioButton("Pequeña");
		
		radioMed=new RadioButton("Mediana");
		
		radioGran=new RadioButton("Grande");
		
		radioMed.setSelected(true);
		
		ToggleGroup grupoTamano=new ToggleGroup();
		
		radioPeq.setToggleGroup(grupoTamano);
		
		radioMed.setToggleGroup(grupoTamano);
		
		radioGran.setToggleGroup(grupoTamano);
		
		VBox paneTamano=new VBox(lblTamano, radioPeq, radioMed, radioGran);
		
		paneTamano.setSpacing(10);
		
		// Creación del pane de la masa

		Label lblMasa=new Label("Masa");
		
		radioFina=new RadioButton("Fina");
		
		radioNormal=new RadioButton("Normal");

		// Seleccionado por defecto
		radioFina.setSelected(true);
		
		ToggleGroup grupoMasa=new ToggleGroup();
		
		radioFina.setToggleGroup(grupoMasa);
		
		radioNormal.setToggleGroup(grupoMasa);
		
		VBox paneMasa=new VBox(lblMasa, radioFina, radioNormal);
		
		paneMasa.setSpacing(10);
		
		// Creación del pane Ingredientes
		
		Label lblIngredientes=new Label("Ingredientes");
		
		chkPepperoni=new CheckBox("Peperoni");
		
		chkQueso=new CheckBox("Queso");
		
		chkPimiento=new CheckBox("Pimiento");
		
		chkAceitunas=new CheckBox("Aceitunas");
		
		chkCampi=new CheckBox("Champiñon");
		
		chkTomate=new CheckBox("Tomate");
		
		chkAnchoas=new CheckBox("Anchoas");
		
		FlowPane paneIngredientes=new FlowPane(Orientation.VERTICAL,chkPepperoni,chkQueso,chkPimiento,chkAceitunas,chkCampi,chkTomate,chkAnchoas );
		
		paneIngredientes.setPadding(new Insets(10,0,10,0));
		
		paneIngredientes.setHgap(20);
		
		paneIngredientes.setVgap(10);
		
		paneIngredientes.setPrefWrapLength(100);
		
		VBox paneIngredientesVertical=new VBox(lblIngredientes,paneIngredientes);
	
		//----Crear el pane de tamaño, masa e ingredientes
		
		HBox paneOrden=new HBox(50, paneTamano, paneMasa, paneIngredientesVertical);
	
		//-----Crear panel central
		
		VBox paneCentral=new VBox(20,paneCliente,paneOrden);
	
		paneCentral.setPadding(new Insets(0,10,0,10));
		
		//----Creación del panel Inferior------------------
		
		Button btnOk=new Button("OK");
		
		btnOk.setPrefWidth(80);
		
		btnOk.setOnAction(e->btnOk_Click());
		
		Button btnCancel=new Button("Cancelar");
		
		btnCancel.setPrefWidth(80);
		
		btnCancel.setOnAction(e->btnCancel_Click());
		
		Region espacio=new Region();
		
		HBox paneInferior=new HBox(10, espacio, btnOk, btnCancel);
		
		paneInferior.setHgrow(espacio, Priority.ALWAYS);
		
		paneInferior.setPadding(new Insets(20,10,20,10));
		
		//----------Finalizar la Scene---------
		
		BorderPane panePrincipal=new BorderPane();
		
		panePrincipal.setTop(paneSuperior);
		
		panePrincipal.setCenter(paneCentral);
		
		panePrincipal.setBottom(paneInferior);
		
		//----Creación del Scene---
		
		Scene miScene=new Scene(panePrincipal);
	
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Pedidos Pizza");
	
		primaryStage.show();
	}
	
	
	
	private void btnCancel_Click() {
		// TODO Auto-generated method stub
		
		
		miStage.close();
		
	}



	private void btnOk_Click() {
		// TODO Auto-generated method stub
		
		// Creación del String con la información del cliente
		
		String msg="Cliente:\n\n";
		
		msg+="\t" + cuadroNombre.getText() + "\n";
		
		msg+="\t" + cuadroDireccion.getText() + "\n";
		
		msg+="\t" + cuadroTfno.getText() + "\n";
	
		msg+="Has pedido: Tamaño: ";
		
		// Añadir el tamaño
		
		if(radioPeq.isSelected()) msg+=" pequeño";
		
		if(radioMed.isSelected()) msg+=" mediano";
		
		if(radioGran.isSelected()) msg+=" grande";
	
		// Añadir la masa
		
		if(radioFina.isSelected()) msg+=" y masa fina con ";
		
		if(radioNormal.isSelected()) msg+=" y masa Normal con ";
		
		// Añadir los ingredientes
		
		String ingredientes="";
		
		ingredientes=construyeIngredientes(chkPepperoni, ingredientes);
		
		ingredientes=construyeIngredientes(chkQueso, ingredientes);
		
		ingredientes=construyeIngredientes(chkPimiento, ingredientes);
		
		ingredientes=construyeIngredientes(chkAceitunas, ingredientes);
		
		ingredientes=construyeIngredientes(chkCampi, ingredientes);
		
		ingredientes=construyeIngredientes(chkTomate, ingredientes);
		
		ingredientes=construyeIngredientes(chkAnchoas, ingredientes);
		
		if(ingredientes.equals("")) msg+=" sin ingredientes";
		
		else msg+="los siguientes ingredientes:\n" + ingredientes;
		
		// mostrar el mensaje emergente final
		
		VentanaEmergente.mostrar(msg, "Detalles del pedido", 400, 300);
		
		
	}

	public String construyeIngredientes(CheckBox chk, String msg) {
		
		if(chk.isSelected()) {
			
			if(!msg.equals("")) msg+=", ";
			
			msg+=chk.getText();
			
			
			
		}
		
		return msg;
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	Stage miStage;
	
	TextField cuadroNombre, cuadroTfno, cuadroDireccion;
	
	RadioButton radioPeq, radioMed, radioGran;
	
	RadioButton radioFina, radioNormal;
	
	CheckBox chkPepperoni, chkQueso, chkPimiento, chkAceitunas, chkCampi, chkTomate, chkAnchoas;
	
}
