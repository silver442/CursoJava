package layoutPanes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TrabajoLayoutPanes extends Application{

	@Override
	public void start(Stage primaryStage){
		
		Button boton1=new Button("Boton 1");
		Button boton2=new Button("Boton 2");
		Button boton3=new Button("Boton 3");
		Button boton4=new Button("Boton 4");
		Button boton5=new Button("Boton 5");
		Button boton6=new Button("Boton 6");

		Button boton7=new Button("Boton 1");
		Button boton8=new Button("Boton 2");
		Button boton9=new Button("Boton 3");
		Button boton10=new Button("Boton 4");
		Button boton11=new Button("Boton 5");
		Button boton12=new Button("Boton 6");
		
		BorderPane miPane=new BorderPane(boton1,boton2,boton3,boton4,boton5);
		BorderPane.setAlignment(boton2, Pos.CENTER);
		BorderPane.setAlignment(boton3, Pos.CENTER);
		BorderPane.setAlignment(boton4, Pos.CENTER);
		BorderPane.setAlignment(boton5, Pos.CENTER);
		BorderPane.setAlignment(boton6, Pos.CENTER);
		
		
		//miPane.getChildren().addAll(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);
		
		Scene miScene=new Scene(miPane, 400,200);
		primaryStage.setScene(miScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
