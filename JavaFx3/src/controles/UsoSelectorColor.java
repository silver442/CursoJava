package controles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsoSelectorColor extends Application{

	public void start(Stage primaryStage) {
		
		ColorPicker cp=new ColorPicker();
		
		VBox miVbox=new VBox(cp);
		
		BorderPane root=new BorderPane();
	
		root.setTop(miVbox);
		
		Scene miScene=new Scene(root, 600, 400);
	
		primaryStage.setScene(miScene);
		
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
