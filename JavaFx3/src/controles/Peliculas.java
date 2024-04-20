package controles;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Peliculas extends Application{

	public void start(Stage primaryStage) {
		
		root=new TreeItem<String>();
		
		root.setExpanded(true);
		
		belicas=muestraNodoArbol("Peliculas bélicas", root);
		
		muestraNodoArbol("Salvar al soldado Ryan", belicas);
		
		muestraNodoArbol("La chaqueta metálica", belicas);
		
		muestraNodoArbol("Apocallipse Now", belicas);
		
		familiares=muestraNodoArbol("Para toda la familia", root);
		
		infantiles=muestraNodoArbol("Infantiles", familiares);
		
		muestraNodoArbol("Fantasía", infantiles);
		
		muestraNodoArbol("Toy Story", infantiles);
	
		comedias=muestraNodoArbol("Comedia", familiares);
		
		muestraNodoArbol("No me chilles que no te veo", comedias);
		
		muestraNodoArbol("Los visitantes", familiares);
		
		muestraNodoArbol("E.T", familiares);
		
		dramas= muestraNodoArbol("Drama", root);
		
		muestraNodoArbol("Heat", dramas);
		
		muestraNodoArbol("Bailando con lobos", dramas);
		
		muestraNodoArbol("Gran Torinno", dramas);
		
		miArbol=new TreeView<String>(root);
		
		miArbol.setShowRoot(false);
	
		miArbol.getSelectionModel().selectedItemProperty().addListener((valor, antiguoValor, nuevoValor)->
		seleccionItemArbol(nuevoValor));
		
		/*miArbol.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {

			@Override
			public void changed(ObservableValue valor, Object antiguoValor, Object nuevoValor) {
				// TODO Auto-generated method stub
				
				String mensaje="";
				
				ObservableList<TreeItem<String>> elementosSeleccionados=
						miArbol.getSelectionModel().getSelectedItems();
				
				for(TreeItem elemento:elementosSeleccionados) {
					
					mensaje+=elemento.getValue()+"\n";
					
					muestraNombres.setText(mensaje);
					
					VentanaEmergente.mostrar("La pelicula seleccionada es: \n" + mensaje, "Pelicula seleccionada");
					
				}
				
			}
			
		});*/
		
		muestraNombres=new Label();
		
		
		VBox miPane=new VBox();
		
		miPane.setPadding(new Insets(20,20,20,20));
		
		miPane.getChildren().addAll(miArbol, muestraNombres);

		Scene scene=new Scene(miPane);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Mis películas favoritas");
	
		primaryStage.show();
	
	}
	
	public void seleccionItemArbol(TreeItem<String> item) {
		
		if(item!=null) {
			
			muestraNombres.setText(item.getValue());
		
			VentanaEmergente.mostrar("La pelicula seleccionada es: \n" + item.getValue(), "Película seleccionada");
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public TreeItem<String> muestraNodoArbol(String titulo, TreeItem<String> parent){
		
		TreeItem<String> item=new TreeItem<String>(titulo);
		
		item.setExpanded(true);
		
		parent.getChildren().add(item);
	
		return item;
	}
	
	TreeView<String> miArbol;
	
	Label muestraNombres;
	
	TreeItem<String> root, belicas, familiares, dramas, infantiles, comedias;
}
