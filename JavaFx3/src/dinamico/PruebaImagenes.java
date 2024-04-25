package dinamico;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PruebaImagenes extends Application{

	public void start(Stage primaryStage) {
		
		// Image img=new Image("file:D:\\Imagenes\\Flores\\Flor1.jpg");
		
		File f=new File("D:\\Imagenes\\Flores\\Flor1.jpg");
		
		Image img=new Image(f.toURI().toString());
		
		ImageView miImagen1=new ImageView(img);
		
		Image img2=new Image("file:D:\\Imagenes\\Flores\\Flor2.jpg");
		
		ImageView miImagen2=new ImageView(img2);
		
		
		miImagen1.setFitWidth(600);
	
		miImagen1.setPreserveRatio(true);
		
		miImagen2.setFitWidth(600);
		
		miImagen2.setPreserveRatio(true);
		
		MotionBlur blur=new MotionBlur();
		
		blur.setRadius(30);
		
		blur.setAngle(170);
		
		// Desenfocar la imagen 2
		miImagen2.setEffect(blur);
		
		HBox paneImagenes=new HBox(miImagen1,miImagen2);
		
		paneImagenes.setPadding(new Insets(10,10,10,10));
		
		paneImagenes.setSpacing(10);
		
		Scene miScene=new Scene(paneImagenes);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
