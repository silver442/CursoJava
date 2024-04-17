package layoutPanes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
				
				Label lbPuntos=new Label("Nombre del equipo: ");
				
				lbPuntos.setMinWidth(100);
				
				lbPuntos.setAlignment(Pos.BOTTOM_RIGHT);
				
				// campo de texto (Textfield) de los puntos
				
				txtPuntos =new TextField();
				
				txtPuntos.setMinWidth(200);
				
				txtPuntos.setMaxWidth(200);
				
				txtPuntos.setPromptText("Nombre del equipo");
			
		// Creación del botón
				
		Button btAccion=new Button("Dale");
		
		btAccion.setMinWidth(80);
		
		btAccion.setMaxWidth(80);
		
		btAccion.setOnAction(e->btAccionClick());
				
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	TextField txtEquipo, txtJugador, txtPuntos;
	
}
