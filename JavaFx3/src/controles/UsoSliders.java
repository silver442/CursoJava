package controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class UsoSliders extends Application {

	public void start(Stage primaryStage) {
		
		VBox sliderBox=fabricaSliders(35);
		VBox sliderBox2=fabricaSliders(7);
		VBox sliderBox3=fabricaSliders(50);
		VBox sliderBox4=fabricaSliders(20);
		VBox sliderBox5=fabricaSliders(75);
		
		HBox miHBox=new HBox(25);
		
		miHBox.getChildren().addAll(sliderBox,sliderBox2,sliderBox3,sliderBox4,sliderBox5);
		
		miHBox.setAlignment(Pos.CENTER);
		
		StackPane root=new StackPane();
		
		root.getChildren().add(miHBox);
		
		Scene miScene=new Scene(root, 350, 200);
		
		primaryStage.setTitle("Slider");
		
		primaryStage.setScene(miScene);
		
		primaryStage.show();
	}
	
	private VBox fabricaSliders(int valorInicial) {
		
		Text miTexto=new Text();

		miTexto.setFont(new Font("sans-serif", 14));
		
		Slider miSlider=new Slider();
		
		miSlider.setOrientation(Orientation.VERTICAL);
		
		miSlider.setPrefHeight(150);
		
		miSlider.setShowTickMarks(true);
		
		miSlider.setMajorTickUnit(10);
		
		miSlider.setMinorTickCount(0);
		
		miSlider.setMax(100);
		
		miSlider.setShowTickLabels(true);
		
		miSlider.setValue(valorInicial);
		
		miSlider.valueProperty().addListener((observable, valorAnterior, nuevoValor)->{
			
			int valor=nuevoValor.intValue();
			
			miTexto.setText(Integer.toString(valor));
			
		});
		
		VBox box=new VBox(10, miSlider, miTexto);
	
		box.setPadding(new Insets(10));
	
		box.setAlignment(Pos.CENTER);
		
		box.setMinWidth(20);
		
		box.setPrefWidth(20);
		
		box.setMaxWidth(20);
		
		return box;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
