package animaciones;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animaciones_II extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(final Stage primaryStage){
		// TODO Auto-generated method stub
		
		Group miGrupo=new Group();
		
		RadialGradient degradado=new RadialGradient(0,0,0.32,0.32,0.5,true, CycleMethod.NO_CYCLE, new Stop(0.0, Color.WHITE), new Stop(1.0, Color.BLUE));
		
		pelota=new Circle(TAMANO_BOLA,degradado);
		
		pelota.setCenterX(TAMANO_BOLA);
		
		pelota.setCenterY(TAMANO_BOLA);
		
		miGrupo.getChildren().addAll(pelota);
		
		Scene miScene=new Scene(miGrupo, ANCHO, ALTO);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
		
		KeyFrame clave=new KeyFrame(Duration.millis(5), e->{
			
			pelota.setCenterX(pelota.getCenterX()+despl_x);
			
			pelota.setCenterY(pelota.getCenterY()+despl_y);
			
			if(pelota.getCenterX()<=TAMANO_BOLA || pelota.getCenterX()>=ANCHO-TAMANO_BOLA) despl_x=-despl_x;
			
			if(pelota.getCenterY()<=TAMANO_BOLA || pelota.getCenterY()>=ALTO-TAMANO_BOLA) despl_y=-despl_y;
			
		});
		
		Timeline lineaT=new Timeline(clave);
		
		lineaT.setCycleCount(Timeline.INDEFINITE);
		
		lineaT.play();
	}

	private Circle pelota;
	
	private double despl_x=2;
	
	private double despl_y=3;
	
	final private int ANCHO=600;
	
	final private int ALTO=500;
	
	private final int TAMANO_BOLA=40;
	
}
