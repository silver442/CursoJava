package trabajoScene;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrabajoStack extends Application{

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
		Rectangle rec1=new Rectangle(400,400);
		
		rec1.setFill(Color.RED);
		
		Rectangle rec2=new Rectangle(200,200);
		
		rec2.setFill(Color.BLUE);

		Rectangle rec3=new Rectangle(100,100);
		
		rec3.setFill(Color.GREEN);
		
		StackPane miStack=new StackPane(rec1, rec2, rec3);
		
		// cambia la alineacion
		miStack.setAlignment(Pos.TOP_CENTER);
		
		miStack.setPadding(new Insets(60));
		
		miStack.setMargin(rec3, new Insets(25));
		
		Scene laScene=new Scene(miStack, 800,600);
		
		primaryStage.setScene(laScene);
		
		laScene.setFill(Color.YELLOW);
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
