package animaciones;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TrabajoConAnimaciones extends Application{

	public void start(Stage primaryStage) {
		
		Circle miPelota=new Circle(0,0,20);
		
		Color c=Color.BLUE;
		
		miPelota.setFill(c);
		
		Circle miPelota2=new Circle(0,0,20);
		
		Color c2=Color.RED;
		
		miPelota2.setFill(c2);
		
		Group miGrupo=new Group();
		
		miGrupo.getChildren().add(miPelota);
		
		miGrupo.getChildren().add(miPelota2);
		
		Scene miscene=new Scene(miGrupo, 600,600);
		
		primaryStage.setScene(miscene);
		
		TranslateTransition t=new TranslateTransition(Duration.millis(1500),miPelota);
		
		t.setFromX(miPelota.getRadius());
		
		t.setToX(miscene.getWidth()-miPelota.getRadius());
		
		t.setFromY(miscene.getHeight()/2);
		
		t.setToY(miscene.getHeight()/2);
		
		t.setCycleCount(3);
		
		t.setAutoReverse(true);
		
		//--------Animación pelota 2------------
		TranslateTransition t2=new TranslateTransition(Duration.millis(1500),miPelota2);
		
		t2.setToX(miPelota2.getRadius());
		
		t2.setFromX(miscene.getWidth()-miPelota2.getRadius());
		
		t2.setFromY(miscene.getHeight()/3);
		
		t2.setToY(miscene.getHeight()/3);
		
		t2.setCycleCount(3);
		
		t2.setAutoReverse(true);
		
		//ParallelTransition tp= new ParallelTransition(t,t2);
		
		SequentialTransition tp= new SequentialTransition(t,t2);
		
		
		tp.play();
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

}
