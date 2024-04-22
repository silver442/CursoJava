package layoutPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EjemploAnchor2 extends Application{

	public static void main(String[] args) {
		
		Application.launch(args);
	
	}
	
	public void start(Stage stage) {
		
		Button topButton=new Button("Top");
		AnchorPane.setTopAnchor(topButton, 10.0);
		AnchorPane.setLeftAnchor(topButton, 60.0);
		AnchorPane.setRightAnchor(topButton, 60.0);
		
		Button rightButton=new Button("Right");
		AnchorPane.setTopAnchor(rightButton, 30.0);
		AnchorPane.setRightAnchor(rightButton, 8.0);
		AnchorPane.setBottomAnchor(rightButton, 30.0);
		
		Button bottomButton=new Button("Bottom");
		AnchorPane.setBottomAnchor(bottomButton, 10.0);
		AnchorPane.setLeftAnchor(bottomButton, 60.0);
		AnchorPane.setRightAnchor(bottomButton, 60.0);
		
		Button leftButton=new Button("Left");
		AnchorPane.setTopAnchor(leftButton, 30.0);
		AnchorPane.setLeftAnchor(leftButton, 8.0);
		AnchorPane.setBottomAnchor(leftButton, 30.0);
		
		AnchorPane miAnchor= new AnchorPane(topButton,rightButton,bottomButton,leftButton); 
		
		Scene scene = new Scene(miAnchor, 300, 200);
		stage.setScene(scene);
		
		stage.setTitle("Ejemplo de AnchorPane");
	
		stage.show();
 }
	
}
