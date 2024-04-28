package tactil;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotandoRectangulo extends Application {

	public void start(Stage primaryStage) {
		
		Group miGrupo=new Group();
		
		Rectangle r=new Rectangle((ANCHO_ESCENA-ANCHO_CUADRADO)/2, (ALTO_ESCENA-ALTO_CUADRADO)/2,ANCHO_CUADRADO,ALTO_CUADRADO);
		
		r.setFill(Color.BLUE);
		
		r.setStroke(Color.RED);
		
		r.setStrokeWidth(2);
		
		r.setOnZoom(e->{
			
			r.setScaleX(r.getScaleX()*e.getZoomFactor());
			r.setScaleY(r.getScaleY()*e.getZoomFactor());
			
			e.consume();
			
		});
		
		r.setOnRotate(e->{
			
			r.setRotate(r.getRotate()+e.getAngle());
			
			e.consume();
			
		});
		
		r.setOnSwipeLeft(e->{
			
			r.setX(0);
			
			e.consume();
			
		});
		

		r.setOnSwipeRight(e->{
			
			r.setX(ANCHO_ESCENA-r.getWidth());
			
			e.consume();
			
		});
		
		r.setOnSwipeUp(e->{
			
			r.setY(0);
			
			e.consume();
			
		});
		
		r.setOnSwipeDown(e->{
			
			r.setY(ALTO_ESCENA-r.getHeight());
			
			e.consume();
			
		});
		
		
		miGrupo.getChildren().add(r);
		
		Scene miScene=new Scene(miGrupo, ANCHO_ESCENA, ALTO_ESCENA);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();	
	}
	
	private final double ANCHO_CUADRADO=200;
	private final double ALTO_CUADRADO=200;
	private final double ANCHO_ESCENA=600;
	private final double ALTO_ESCENA=600;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
