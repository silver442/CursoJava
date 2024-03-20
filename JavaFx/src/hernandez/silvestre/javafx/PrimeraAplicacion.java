package hernandez.silvestre.javafx;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class PrimeraAplicacion extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button miBoton=new Button("Click aqui");
		
		miBoton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				System.out.println("Has pulsado el botón");
			}
			
		});
		
		StackPane raiz=new StackPane();
		
		raiz.getChildren().add(miBoton);
		
		Scene miEscena=new Scene(raiz, 500, 300);
		
		primaryStage.setScene(miEscena);
		
		primaryStage.show();
	}

}
