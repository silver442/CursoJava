package controles;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Basket extends Application{

	Jugadores Jordan;
	Jugadores Larry;
	Jugadores Magic;
	
	public void start(Stage primaryStage) {

		equipoEstrellas = new ChoiceBox<Jugadores>();
		
		/*equipoEstrellas.getItems().add(new Jugadores("Michael","Jordan"));
		
		equipoEstrellas.getItems().add(new Jugadores("Larry","Bird"));
		
		equipoEstrellas.getItems().add(new Jugadores("Magic","Johnson"));*/
		
		Jordan=new Jugadores("Michael", "Jordan");
		
		Larry=new Jugadores("Larry", "Bird");
		
		Magic=new Jugadores("Magic", "Johnson");
		
		equipoEstrellas.getItems().addAll(Jordan,Larry,Magic);
				
		equipoEstrellas.setValue(Jordan); // Valor por defecto
		
		//equipoEstrellas.show();
		
		Button elBoton=new Button("Dale");
		
		elBoton.setOnAction(e->funcionJuegos());
		
		BorderPane root=new BorderPane(null, equipoEstrellas, null, elBoton, null);
		
		root.setAlignment(elBoton, Pos.CENTER);
		
		Scene miScene=new Scene(root, 400,400);
		
		equipoEstrellas.setOnAction(e->accionBoton());
		
		root.setAlignment(equipoEstrellas, Pos.CENTER);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
	
	}
	
	public void funcionJuegos() {
		
		//System.out.println(equipoEstrellas.getItems().size());
		
		// Elimina un elemento
		//equipoEstrellas.getItems().remove(Larry);
	
		//Elimina todos los elementos
		equipoEstrellas.getItems().clear();
	}
	
	
	public void accionBoton() {
		
		String mensaje="Has escogido a: \n";
		
		mensaje+=equipoEstrellas.getValue();
	
		VentanaEmergente.mostrar(mensaje, "Tu jugador favorito");
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private ChoiceBox<Jugadores> equipoEstrellas;
}


class Jugadores{
	
	
	
	public Jugadores(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+"      Apellido: "+apellido;
	
	}



	private String nombre;
	
	private String apellido;
	
}