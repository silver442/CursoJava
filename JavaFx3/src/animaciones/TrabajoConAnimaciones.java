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
		
		Group miGrupo=new Group();
		
		miGrupo.getChildren().add(miPelota);
		
		Scene miscene=new Scene(miGrupo, 600,600);
		
		primaryStage.setScene(miscene);
		
		TranslateTransition t=new TranslateTransition(Duration.millis(1500),miPelota);
		
		t.setFromX(miPelota.getRadius());
		
		t.setToX(miscene.getWidth()-miPelota.getRadius());
		
		t.setFromY(miscene.getHeight()/2);
		
		t.setToY(miscene.getHeight()/2);
		
		t.setCycleCount(Transition.INDEFINITE);
		
		t.setAutoReverse(true);
		
		t.play();
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

}
