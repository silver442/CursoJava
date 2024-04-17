package application;

import emergente.VentanaDialogo;
import emergente.VentanaEmergente;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SalirDeAplicacion extends Application {

	
	public void start(Stage primaryStage) {
		
		miStage=primaryStage;
		
		Button botonClick=new Button();
		botonClick.setText("Pulsar");
		botonClick.setOnAction(e->hazmeClick());
		
		Button botonCerrar=new Button();
		botonCerrar.setText("Cerrar");
		botonCerrar.setOnAction(e->botonCerrar());
		
		
		VBox miPane=new VBox(10);
		miPane.getChildren().addAll(botonClick, botonCerrar);
		miPane.setAlignment(Pos.CENTER);
		
		Scene miScene=new Scene(miPane,350,200);
		
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Contador de clicks");
		
		primaryStage.setOnCloseRequest(e->{
			e.consume(); // detiene el evento de cerrar
			botonCerrar();
			
		});
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void hazmeClick() {
		
		contadorDeClicks++;
		
		if(contadorDeClicks==1) VentanaEmergente.mostrar("Has hecho click una vez", "Click!");
		
		else VentanaEmergente.mostrar("Has hecho click " + contadorDeClicks + " veces", "Click!");
		
	}
	
	public void botonCerrar() {
		
		boolean confirmar=false;
		
		confirmar=VentanaDialogo.mostrar("Saliendo...", "¿Estas seguro de salir?");
		
		if(confirmar) {
			
			// irían todas aquellas tareas a realizar antes de cerrar
			
			miStage.close(); // cerrar el stage
			
		}
	}
	
	Stage miStage;
	
	int contadorDeClicks=0;
}
