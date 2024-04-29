package controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UsoTitledPane extends Application{

	public void start(Stage primaryStage) {
		
		RadioButton tampeq=new RadioButton("Pequeño");
		
		RadioButton tammed=new RadioButton("Mediano");
		
		RadioButton tamgr=new RadioButton("Grande");
		
		ToggleGroup grupoTam=new ToggleGroup();
		
		grupoTam.getToggles().addAll(tampeq,tammed,tamgr);
		
		tammed.setSelected(true);
		
		VBox miBox=new VBox(10);
		
		miBox.setPadding(new Insets(10));
		
		miBox.getChildren().addAll(tampeq,tammed,tamgr);
		
		//----------SEEGUNDO ELEMENTO DE MENÚ--------------
		
		RadioButton fina=new RadioButton("Fina");
		
		RadioButton normal=new RadioButton("Normal");
		
		RadioButton gruesa=new RadioButton("Gruesa");
		
		ToggleGroup grupoMasa=new ToggleGroup();
		
		grupoMasa.getToggles().addAll(fina,normal,gruesa);
		
		gruesa.setSelected(true);
		
		VBox miBox2=new VBox(10);
		
		miBox2.setPadding(new Insets(10));
		
		miBox2.getChildren().addAll(fina,normal,gruesa);
		
		//--------AGREGANDO LOS MENÚS TITLEPANE------------
		
		
		TitledPane tPane=new TitledPane("Tamaño",miBox);
		
		TitledPane tPane2=new TitledPane("Masa",miBox2);
		
		tPane2.setCollapsible(false);
		
		HBox menus=new HBox(50, tPane, tPane2);
		
		menus.setPadding(new Insets(30));
		
		Scene miScene=new Scene(menus,600,400);
	
		primaryStage.setScene(miScene);
		
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
