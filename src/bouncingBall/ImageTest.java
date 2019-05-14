package bouncingBall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ImageTest extends Application{
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("image.css").toExternalForm());
	
		primaryStage.setTitle("Wuhu du hure");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
	
	

}
