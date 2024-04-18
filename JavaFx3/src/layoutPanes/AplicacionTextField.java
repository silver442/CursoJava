package layoutPanes;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AplicacionTextField extends Application {

	public void start(Stage primaryStage) {
		
		// Etiqueta del equipo
		
		Label lbEquipo=new Label("Nombre del equipo: ");
		
		lbEquipo.setMinWidth(100);
		
		lbEquipo.setAlignment(Pos.BOTTOM_RIGHT);
		
		// campo de texto (Textfield) del equipo
		
		txtEquipo =new TextField();
		
		txtEquipo.setMinWidth(200);
		
		txtEquipo.setMaxWidth(200);
		
		txtEquipo.setPromptText("Nombre del equipo");
	
		// Etiqueta del Jugador
		
		Label lbJugador=new Label("Nombre del Jugador: ");
		
		lbJugador.setMinWidth(100);
		
		lbJugador.setAlignment(Pos.BOTTOM_RIGHT);
		
		// campo de texto (Textfield) del jugador
		
		txtJugador =new TextField();
		
		txtJugador.setMinWidth(200);
		
		txtJugador.setMaxWidth(200);
		
		txtJugador.setPromptText("Nombre del Jugador");
	
		// Etiqueta de los puntos
		
		Label lbPuntos=new Label("Puntos por partido: ");
		
		lbPuntos.setMinWidth(100);
		
		lbPuntos.setAlignment(Pos.BOTTOM_RIGHT);
		
		// campo de texto (Textfield) de los puntos
		
		txtPuntos =new TextField();
		
		txtPuntos.setMinWidth(200);
		
		txtPuntos.setMaxWidth(200);
		
		txtPuntos.setPromptText("Introduce puntos");
			
		// Creación del botón
				
		Button btAccion=new Button("Dale");
		
		btAccion.setMinWidth(80);
		
		btAccion.setMaxWidth(80);
		
		btAccion.setOnAction(e->btAccionClick());
				
		
		// Creación del Pane del equipo
		
		HBox paneEquipo=new HBox(20, lbEquipo, txtEquipo);
		
		paneEquipo.setPadding(new Insets(10));
		
		// Creación del Pane del Jugador
		
		HBox paneJugador=new HBox(20, lbJugador, txtJugador);
		
		paneJugador.setPadding(new Insets(10));
		
		// Creación del Pane de los puntos
		
		HBox panePuntos=new HBox(20, lbPuntos, txtPuntos);
		
		panePuntos.setPadding(new Insets(10));
		
		// Creación del Pane del botón
		
		HBox paneBoton=new HBox(20, btAccion);
		
		paneBoton.setPadding(new Insets(10));
	
		paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
	
		// Creación del VBox
		
		VBox panelVertical=new VBox(10, paneEquipo, paneJugador,panePuntos,paneBoton);
		
		// Creación de Scene
		
		Scene laScene=new Scene(panelVertical);
		
		primaryStage.setScene(laScene);
		
		primaryStage.setTitle("Datos del jugador");
		
		primaryStage.show();
		
	}
	
	private void btAccionClick() {
		// TODO Auto-generated method stub
		
		String mensaje="";
		
		if(txtEquipo.getText().length()==0) mensaje+="\nEl  nombre del equipo es requerido";
		
		if(txtJugador.getText().length()==0) mensaje+="\nEl  nombre del Jugador es requerido";
		
		if(mensaje.length()==0) {
			
			if(comprobarEntero(txtPuntos, "Debes introducir un valor numérico entero")) {
			
				mensaje="El jugador " + txtJugador.getText() + " que juega en "+ txtEquipo.getText() +
						" anota " + txtPuntos.getText() + " puntos por partido.";
				
				VentanaEmergente.mostrar(mensaje, "Datos del jugador", 300,250);
				
			}
			
			else txtPuntos.requestFocus();
		}
		else {
			
			VentanaEmergente.mostrar(mensaje, "¡Faltan datos!", 300, 250);
		
		}
	}
	
	
	private boolean comprobarEntero(TextField f, String mensaje) {
		
		try {
			
			Integer.parseInt(f.getText());
			
			return true;
			
		}catch(NumberFormatException e) {
			
			VentanaEmergente.mostrar(mensaje, "Error en los datos", 300,250);
			
			return false;
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	TextField txtEquipo, txtJugador, txtPuntos;
	
}
