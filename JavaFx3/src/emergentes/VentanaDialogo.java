package emergentes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;
public class VentanaDialogo {
	public static boolean mostrar(String mensaje, String titulo) {
	
		botonSiPulsado=false;	
		
		miStage=new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		miStage.setTitle(titulo);
		miStage.setMinWidth(250);
		Label miLabel=new Label(mensaje);
		Button miBotonSi=new Button();
		
		miBotonSi.setText("Sí");
		miBotonSi.setOnAction(e->miBotonSi_clicked());
		
		// Creación Botón No
		
		Button miBotonNo=new Button();
		
		miBotonNo.setText("No");
		miBotonNo.setOnAction(e->miBotonNo_clicked());
		HBox panelBotones=new HBox(20);
		panelBotones.getChildren().addAll(miBotonSi, miBotonNo);
		panelBotones.setAlignment(Pos.CENTER);
		
		VBox panelVertical=new VBox(20);
		
		panelVertical.getChildren().addAll(miLabel, panelBotones);
		panelVertical.setAlignment(Pos.CENTER);
		
		Scene miScene=new Scene(panelVertical);
		miStage.setScene(miScene);
		miStage.showAndWait();
		return botonSiPulsado;
	}
	private static void miBotonNo_clicked() {
		miStage.close();
		botonSiPulsado=false;
	}
	private static void miBotonSi_clicked() {
		miStage.close();
		botonSiPulsado=true;
	}
	private static Stage miStage;
	private static boolean botonSiPulsado;
}
