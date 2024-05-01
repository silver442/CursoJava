package controles;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarraProgreso extends Application{

	public void start(Stage primaryStage) {
		
		//ProgressIndicator reloj_indicador=new ProgressIndicator();
		
		ProgressBar reloj_indicador=new ProgressBar();
		
		
		// Crea Label para mostrar el porcentaje
		
		Label porcentajeLabel=new Label();
		
		// Vincula nuestro ProgressIndicator al label
		
		porcentajeLabel.textProperty().bind(
				
				Bindings.format("%.0f%%", reloj_indicador.progressProperty().multiply(100))
				
				);
		
		
		//StackPane root=new StackPane();
		//root.getChildren().add(reloj_indicador);
		
		VBox root=new VBox(10,reloj_indicador,porcentajeLabel);
		
		root.setAlignment(Pos.CENTER);
		
		
		Scene scene= new Scene(root, 300, 250);
		
		primaryStage.setTitle("Ejemplo de progresos");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		// Simulación de tarea en segundo plano
		
		Task<Void> tarea = new Task<Void>() {
			
			protected Void call() throws Exception{
				
				for(int i=0; i<=100; i++) {
					
					final int progreso=i;
					
					javafx.application.Platform.runLater(()->reloj_indicador.setProgress(progreso/100.0));
				
					Thread.sleep(100);
					
				}
				
				
				return null;
			}
			
			
		};
		
		// Inicia la tarea en segundo plano
		
		Thread miThread=new Thread(tarea);
		
		miThread.start();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
