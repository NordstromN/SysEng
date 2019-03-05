package bouncingBall;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBall extends Application {
	
	public static void main(String [] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		
		Rectangle ellipse = new Rectangle(200, 100, 50, 50);
		ellipse.setStroke(Color.GREEN);
		ellipse.setStrokeWidth(4);
		ellipse.setFill(Color.PINK);
		
		Group objects = new Group();
		objects.getChildren().add(ellipse);
		
		
		Scene scene = new Scene(objects, 400, 400, Color.BEIGE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bouncing Ball");
		primaryStage.show();
		
		PathElement pe1 = new MoveTo(25, 25);
		PathElement pe2 = new LineTo(375, 25);
		PathElement pe3 = new LineTo(375, 375);
		PathElement pe4 = new LineTo(25, 375);
		PathElement pe5 = new LineTo(25, 25);
		Path path = new Path();
		path.getElements().add(pe1);
		path.getElements().add(pe2);
		path.getElements().add(pe3);
		path.getElements().add(pe4);
		path.getElements().add(pe5);
		PathTransition move = new PathTransition(Duration.millis(4500), path, ellipse);
		move.setCycleCount(Animation.INDEFINITE);
		move.play();
	
	
	
	}	
	

}
