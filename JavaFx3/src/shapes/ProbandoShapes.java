package shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ProbandoShapes extends Application{

	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated method stub
		
		
		Group miGrupo=new Group();
		
		for(int i=0;i<300;i+=10) {
			
			Line linea1=new Line(i,0,i,300);
			
			linea1.setStroke(Color.BLUE);
			
			Line linea2=new Line(0,i,300,i);
			
			linea2.setStroke(Color.RED);
			
			miGrupo.getChildren().addAll(linea1,linea2);
			
		}
		
		Scene miScene=new Scene(miGrupo);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
