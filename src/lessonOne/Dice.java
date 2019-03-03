package lessonOne;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Dice extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public void start(Stage primaryStage) throws Exception{

		GridPane root = new GridPane();
		
		for(int i=0;i<2;i++) {
		Button butt = new Button("Hode");
		root.add(butt, i, 2);
		butt.setPrefSize(100, 100);
		butt.setOnAction((ActionEvent e) -> rollDoice(e));
		
		}
		
		
		
		Scene scene = new Scene (root);
		scene.getStylesheets().add(getClass().getResource("RollDice.css").toString());
				
		primaryStage.setTitle("Roll the Dice");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	private void rollDoice(ActionEvent e) {
		Button butt = (Button) e.getSource();
		
		double rand = Math.random();
		int intRand = 1+ (int) (6*rand);
		String strRand = Integer.toString(intRand);
		butt.setText(strRand);				
	}
}
