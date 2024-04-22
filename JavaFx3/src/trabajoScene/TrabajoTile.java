package trabajoScene;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrabajoTile extends Application{

	@Override
	public void start(Stage primaryStage) {
		
		TilePane miPane=new TilePane();

		// establecer separacion horizontal
		miPane.setHgap(10);
		
		miPane.setVgap(10);
		
		miPane.setPadding(new Insets(10,10,10,10));
		
		for(int i=1;i<13;i++) {
			
			Rectangle r=new Rectangle(100, 100);
			
			r.setFill(Color.rgb(125, 240, 215));
			
			Label etiq=new Label("Cuadrado " + i);
			
			StackPane miStack=new StackPane(r, etiq);
			
			miPane.getChildren().add(miStack);
		}
		
		ScrollPane miScroll=new ScrollPane(miPane);
		
		miScroll.setMaxWidth(450);
		
		miScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
		
		StackPane miStack=new StackPane(miScroll);
		
		Scene laScene=new Scene(miStack, 800,600);
		
		primaryStage.setScene(laScene);
		
		primaryStage.show();
		
		
	}
	
	
	public static void main(String[] args) {

		launch(args);
	}

	

}
