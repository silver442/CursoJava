package controles;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UsoDataPicker extends Application{

	public void start(Stage primaryStage) {
		
		BorderPane root=new BorderPane();
		
		DatePicker dp=new DatePicker();
		
		root.setCenter(dp);
		
		dp.setOnAction(e->{
			
			LocalDate date=dp.getValue();
			
			System.out.println(date);
		});
		
		Scene miScene=new Scene(root, 600, 400);
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
