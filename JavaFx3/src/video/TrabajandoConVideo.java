package video;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.*;
import javafx.stage.Stage;

public class TrabajandoConVideo extends Application{
	
	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) {
		
		File f=new File("D:\\Videos\\VideosPrueba\\gameControl.mp4");
		
		Media miMedia=new Media(f.toURI().toString());
	
		MediaPlayer miMediaPlayer=new MediaPlayer(miMedia);
		
		//Empezar la reproduccion en automatico
		miMediaPlayer.setAutoPlay(true);
		
		MediaView miView=new MediaView(miMediaPlayer);
		
		miView.setFitHeight(500);
		
		miView.setFitWidth(750);
		
		StackPane miStack=new StackPane(miView);
		
		Scene miScene=new Scene(miStack);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Video en JavaFx");
		
		primaryStage.show();
	}

}
