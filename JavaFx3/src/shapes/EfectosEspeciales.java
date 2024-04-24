package shapes;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.effect.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class EfectosEspeciales extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group g1=new Group();
		
		Rectangle r1=new Rectangle(50,50,100,100);
		r1.setFill(Color.LIGHTGRAY);
		r1.setStroke(Color.BLACK);
		r1.setStrokeWidth(2);
		// Sobra externa
		//DropShadow sombra1=new DropShadow();
	
		// Sombra externa
		InnerShadow sombra1=new InnerShadow();
			
		// Desplazamiento de las sombras
		/*sombra1.setOffsetX(10);
		sombra1.setOffsetY(10);*/
		
		r1.setEffect(sombra1);
		
		g1.getChildren().add(r1);
		
		Scene miScene=new Scene(g1);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
