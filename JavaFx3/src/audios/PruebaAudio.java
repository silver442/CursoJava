package audios;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.*;
import javafx.scene.text.Text;
import javafx.stage.*;

public class PruebaAudio extends Application{

	public void start(Stage primaryStage) {
		
		File miAudio=new File("D:\\Musica\\Glass - Anno Domini Beats.mp3");
		
		Media miMedia=new Media(miAudio.toURI().toString());
		
		MediaPlayer miPlayer=new MediaPlayer(miMedia);
		
		Button botPlayPause=new Button("Play/Paise");
		Button botPause=new Button("Pause");
		Button botStop=new Button("Stop");

		botPlayPause.setOnAction(e->{
	
			if(sonando==false) {
			
				miPlayer.play();
				sonando=true;
				
			}else {
				miPlayer.pause();
				sonando=false;
			}
				
		});
		
		botPause.setOnAction(e->{
					
					miPlayer.pause();
				
				});
				
		botStop.setOnAction(e->{
			
			miPlayer.stop();
		
		});

		
		HBox box=new HBox(20, botPlayPause, botStop);
		
		Scene miScene=new Scene(box);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Trabajanco con audios");

		primaryStage.show();
		
		//miPlayer.play();
		
		
	}
	
	private boolean sonando=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

}
	