package shapes;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class TrabajoConTextos extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
		LinearGradient miDegradado=new LinearGradient(
				0,0,
				0,1,
				true,
				CycleMethod.NO_CYCLE,
				new Stop(0.2, Color.BLUE),
				new Stop(0.8, Color.YELLOW)
				);
		
		Text texto1=new Text(100,250,"Hola alumnos");
	
		texto1.setFont(new Font("Times New Roman", 200));
		
		texto1.setStroke(Color.BLACK);
		
		texto1.setStrokeWidth(3);
		
		texto1.setFill(miDegradado);
		
		Group miGrupo=new Group();
	
		miGrupo.getChildren().add(texto1);
		
		Scene miScene=new Scene(miGrupo);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Tabajo con textos");
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
