package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import emergente.*;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			contador=0;
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Button miBoton=new Button("Haz click!!");
			miBoton.setOnAction(e->clickEnBoton());
			root.setCenter(miBoton);
			
			miTexto.setText("Hicicte click " + contador + " Veces");
			root.setTop(miTexto);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void clickEnBoton() {
	
		boolean resultado = VentanaDialogo.mostrar("Esta es nuestra ventana emergente", "Ojo cuidado");
		
		System.out.println(resultado);
		
	}
	
	private Label miTexto=new Label();
	private int contador;
	
	
}

