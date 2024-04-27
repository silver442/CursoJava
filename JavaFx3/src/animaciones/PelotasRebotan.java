package animaciones;

import java.util.ArrayList;

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

public class PelotasRebotan extends Application{

	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
	
	public void start(Stage primaryStage) {
		
		Group miGrupo=new Group();
		
		for(int i=0;i<10;i++) pelotas.add(new Pelota(20,600,500,pelotas));
		
		miGrupo.getChildren().addAll(pelotas);
		
		Scene miescena=new Scene(miGrupo, 600,500);
		
		primaryStage.setTitle("Rebotando pelotas");
		
		primaryStage.setScene(miescena);
		
		primaryStage.show();
		
		KeyFrame k=new KeyFrame(Duration.millis(10), e->{
			
			for(Pelota pelota:pelotas) pelota.mover();
			
		});
		
		Timeline t=new Timeline(k);
		
		t.setCycleCount(Timeline.INDEFINITE);
		
		t.play();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	class Pelota extends Circle{
		
		public Pelota(double radio, double campoAncho, double campoAlto, ArrayList<Pelota> pelotas) {
			
			super();
			
			this.radio=radio;
			
			this.campoAlto=campoAlto;
			
			this.campoAncho=campoAncho;
			
			super.setRadius(radio);
			
			super.setCenterX(Math.random()*(campoAncho-this.radio+1));
			
			super.setCenterY(Math.random()*(campoAlto-this.radio+1));
			
			this.x_velocidad=Math.random()*3+1;
			
			this.y_velocidad=Math.random()*3+1;
			
			RadialGradient g=new RadialGradient(0,0,0.40,0.40,0.5,true,CycleMethod.NO_CYCLE, new Stop(0.0,Color.WHITE), new Stop(1.0, Color.RED));
		
			super.setFill(g);
		}
		
		public void mover() {
			
			super.setCenterX(super.getCenterX()+this.x_velocidad);

			super.setCenterY(super.getCenterY()+this.y_velocidad);
		
			// Detectar colisión con borde izquierdo
			
			if(super.getCenterX()<=this.radio) {
				
				super.setCenterX(this.radio);
				
				this.x_velocidad=-this.x_velocidad;
				
			}
			
			//  Detectar colisión con borde derecho
			
			if(super.getCenterX()>=this.campoAncho-this.radio) {
				
				super.setCenterX(this.campoAncho-this.radio);
				
				this.x_velocidad=-this.x_velocidad;
				
			}
			
			// Detectar colisión con borde superior
		
			if(super.getCenterY()<=this.radio) {
				
				super.setCenterY(this.radio);
				
				this.y_velocidad=-this.y_velocidad;
				
			}
			
			// Detectar colisión con borde inferior
		
			if(super.getCenterY()>=this.campoAlto-this.radio) {
				
				super.setCenterY(this.campoAlto-this.radio);
				
				this.y_velocidad=-this.y_velocidad;
				
			}
			
			// Detectar colisiones con otras pelotas
			
			for(Pelota b:pelotas) {
				
				if(b!=this && b.intersects(super.getLayoutBounds())) {
					
					double tempx=this.x_velocidad;
					
					double tempy=this.y_velocidad;
					
					this.x_velocidad=b.x_velocidad;
					
					this.y_velocidad=b.y_velocidad;
					
					b.x_velocidad=tempx;
					
					b.y_velocidad=tempy;
					
					break;
				}
				
				
			}
		
		}
		
		private double radio;
		
		public double x_velocidad;
		
		public double y_velocidad;
		
		private double campoAncho;
		
		private double campoAlto;
		
	}
	
}
