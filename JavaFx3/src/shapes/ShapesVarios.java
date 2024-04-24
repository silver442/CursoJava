package shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapesVarios extends Application{

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
		Group miGrupo =new Group();
		
		for(int i=0;i<600;i+=10) {
			Line lineahor =new Line(i,0,i,600);
			lineahor.setStroke(Color.LIGHTGRAY);
			Line lineavert =new Line(0,i,600,i);
			lineavert.setStroke(Color.LIGHTGRAY);
			miGrupo.getChildren().addAll(lineahor,lineavert);
		}
		
		// Rectángulo 1
			Rectangle recirc=new Rectangle(50,25,100,140);
			recirc.setStroke(Color.BLACK);
			recirc.setFill(null);
			recirc.setStrokeWidth(3); // grosor del trazo
			miGrupo.getChildren().add(recirc);
			
			// Rectangulo esquinas redondeadas
			Rectangle rec2=new Rectangle(250,25,100,140);
			rec2.setStroke(Color.BLUE);
			rec2.setFill(null); // para que no las rellene
			rec2.setStrokeWidth(3); //grosor del trazo
			rec2.setArcWidth(55);
			rec2.setArcHeight(55);
			miGrupo.getChildren().add(rec2);
			
			// Rectangulo esquinas redondeadas
			Rectangle rec3=new Rectangle(450,25,100,140);
			rec3.setStroke(Color.GREEN);
			rec3.setFill(null); // para que no las rellene
			rec3.setStrokeWidth(3); //grosor del trazo
			rec3.setArcWidth(55);
			rec3.setArcHeight(55);
			miGrupo.getChildren().add(rec3);
			
			// Circulo
			Circle circ=new Circle(100,300,75);
			circ.setStroke(Color.RED);
			circ.setFill(null);
			circ.setStrokeWidth(3);
			miGrupo.getChildren().add(circ);
			
			// Ellipse
			Ellipse ellip=new Ellipse(300,300,75, 40);
			ellip.setStroke(Color.YELLOW);
			ellip.setFill(null);
			ellip.setStrokeWidth(3);
			miGrupo.getChildren().add(ellip);
			
			// Ellipse
			Ellipse ellip2=new Ellipse(500,300,40,75);
			ellip2.setStroke(Color.ORANGE);
			ellip2.setFill(null);
			ellip2.setStrokeWidth(3);
			miGrupo.getChildren().add(ellip2);
			
			// Arco abierto
			Arc arc1=new Arc(150,550,100,100,90,90);
			arc1.setType(ArcType.OPEN);
			arc1.setStroke(Color.PINK);
			arc1.setFill(null);
			arc1.setStrokeWidth(3);
			miGrupo.getChildren().add(arc1);
			
			// Arco cerrado
			Arc arc2=new Arc(300,550,100,100,45,90);
			arc2.setType(ArcType.CHORD);
			arc2.setStroke(Color.BROWN);
			arc2.setFill(null);
			arc2.setStrokeWidth(3);
			miGrupo.getChildren().add(arc2);
			
			// Otro arco cerrado
			Arc arc3=new Arc(500,550,100,100,45,90);
			arc3.setType(ArcType.ROUND);
			arc3.setStroke(Color.RED);
			arc3.setFill(null);
			arc3.setStrokeWidth(3);
			miGrupo.getChildren().add(arc3);
			
			Scene miScene=new Scene(miGrupo);
			primaryStage.setScene(miScene);
			primaryStage.setTitle("Figuritas");
			primaryStage.show();
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	

}
