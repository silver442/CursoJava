package dinamico;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;

public class TrabajoImagenes extends Application{
	
	public static void main(String[] args){
	
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
	
		TilePane tile=new TilePane();
		
		// estableciendo separacion
		tile.setHgap(20);
		tile.setVgap(20);
		tile.setPadding(new Insets(20));
		
		tile.setPrefColumns(4);
		
		File miDir=new File(RUTA);
		
		File[] misArchivos=miDir.listFiles();
		
		for(File f: misArchivos) {
			
			//System.out.println(f.getName());
			
			Image miImg=new Image(f.toURI().toString(),200,200,true,true);
			
			ImageView miIview=new ImageView(miImg);
			
			Text titulo=new Text(f.getName());
			
			titulo.setFont(new Font("Time New Roman", 16));
			
			Region miRegion=new Region();
			
			VBox miBox=new VBox(10, miIview,miRegion,titulo);
			
			miBox.setAlignment(Pos.CENTER);
			
			tile.getChildren().add(miBox);
			
		}
		
		ScrollPane miScroll=new ScrollPane(tile);
		
		Scene miScene=new Scene(miScroll);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Imagenes de la carpeta " + RUTA);
		
		primaryStage.show();
	}
	
	private final String RUTA = "D:\\Imagenes\\ImagenesProyectoJava";

	
}
