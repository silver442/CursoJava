package controles;

import java.text.Format;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UsoSelectorColor extends Application{

	public void start(Stage primaryStage) {
		
		ColorPicker cp=new ColorPicker();
		
		VBox miVbox=new VBox(cp);
		
		BorderPane root=new BorderPane();
	
		root.setTop(miVbox);
		
		Scene miScene=new Scene(root, 600, 400);
	
		
		cp.setOnAction(e->{
			
			System.out.println(cp.getValue());
			
			root.setStyle("-fx-background-color: "+ AColorRGB(cp.getValue())+";");
			
		});
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
	}
	
	private String AColorRGB(Color color) {
		
		return String.format("#%02X%02X%02X",
			(int)(color.getRed()*255),
			(int)(color.getGreen()*255),
			(int)(color.getBlue()*255));
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
