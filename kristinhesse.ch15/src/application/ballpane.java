package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

	
public class ballpane extends Application {
	

	@Override
	public void start(Stage primaryStage) {
		
		
		StackPane pane = new StackPane();
		
		Circle circle = new Circle(25);
	    circle.setStroke(Color.DARKSLATEBLUE);
	    circle.setFill(Color.LIGHTBLUE);
	    pane.getChildren().add(circle);
	    
	    HBox hBox = new HBox();
	    hBox.setSpacing(20);
	    hBox.setAlignment(Pos.BASELINE_CENTER);
	    Button btLeft = new Button("Left");
	    Button btRight = new Button("Right");
	    Button btUp = new Button("Up");
	    Button btDown = new Button("Down");
	    hBox.getChildren().add(btLeft);
	    hBox.getChildren().add(btRight);
	    hBox.getChildren().add(btUp);
	    hBox.getChildren().add(btDown);
	    
	    btLeft.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
	    	public void handle(ActionEvent e) {
	    		
	    		if(circle.getTranslateX() >= -165.00) {
	    			circle.setTranslateX(circle.getTranslateX() - 15);
	    		}
	    		
	    		else {
	    			System.out.println("Sorry, you can not move to the left any further, please press another button");
	    		}
	    		
	    	}
	    });
	    
	    btRight.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
	    	public void handle(ActionEvent e) {
	    		
	    		if(circle.getTranslateX() <= 165.00) {
	    			circle.setTranslateX(circle.getTranslateX() + 15);
	    		}
	    		
	    		else {
	    			System.out.println("Sorry, you can not move to the right any further, please press another button");
	    		}
	    		
	    	}
	    });
	    
	    btUp.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
	    	public void handle(ActionEvent e) {
	    		
	    		if(circle.getTranslateY() >= -150.00) {
	    			circle.setTranslateY(circle.getTranslateY() - 15);
	    		}
	    		else {
	    			System.out.println("Sorry, you can not move to the up any further, please press another button");
	    		}
	    		
	    		
	    	}
	    });
	    
	    btDown.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
	    	public void handle(ActionEvent e) {
	    		
	    		if(circle.getTranslateY() <= 150.00) {
	    			circle.setTranslateY(circle.getTranslateY() + 15);
	    		}
	    		else {
	    			System.out.println("Sorry, you can not move to the down any further, please press another button");
	    		}
	    		
	    	}
	    });
	    
	    BorderPane borderpane = new BorderPane();
	    borderpane.setCenter(pane);
	    borderpane.setBottom(hBox);
	    BorderPane.setAlignment(hBox, Pos.CENTER);
	    
	    Scene scene = new Scene(borderpane, 400, 400);
	    primaryStage.setTitle("ballpane");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	
	    
	}
	 
	

	public static void main(String[] args) {
		launch(args);
	}
}



	

	/*@Override
	public void start(Stage primaryStage) {
		primaryStage.sceneProperty();
	    primaryStage.setTitle("ballpane"); // Set the stage title
	    
		CirclePane circlePane = new CirclePane();
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		
		
		
		
		//StackPane pane = new StackPane();
	    Circle circle = new Circle(15);
	    circle.setStroke(Color.DARKSLATEBLUE);
	    circle.setFill(Color.LIGHTBLUE);
	    pane.getChildren().add(circle);
	    
	    HBox hBox = new HBox();
	    hBox.setSpacing(20);
	    hBox.setAlignment(Pos.BASELINE_CENTER);
	    Button btLeft = new Button("Left");
	    Button btRight = new Button("Right");
	    Button btUp = new Button("Up");
	    Button btDown = new Button("Down");
	    hBox.getChildren().add(btLeft);
	    hBox.getChildren().add(btRight);
	    hBox.getChildren().add(btUp);
	    hBox.getChildren().add(btDown);
	    
	    BorderPane borderpane = new BorderPane();
	    borderpane.setCenter(pane);
	    borderpane.setBottom(hBox);
	    BorderPane.setAlignment(hBox, Pos.CENTER);
	    
	   // btLeft.setOnAction();
	    
	    
	   // Scene scene = new Scene(borderpane);
	    primaryStage.setTitle("ballpane");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    class LeftHandler implements EventHandler<ActionEvent> {
	    	@Override
	    	public void handle (ActionEvent e) {
	    		
	    		
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    double radius = 0;
	    double x = 0;
	    double y = 0;
	    Circle circle = new Circle(x, y, radius); 
	    ((Shape) circle).setFill(Color.TURQUOISE);
	    getChildren().add(Circle);
	    
	    
	    
		
		
		
		
		
	}

	

	



	public void btLeft() {
		// TODO Auto-generated method stub
		
	}







	public static void main(String[] args) {
		launch(args);
	}
	

	

	

}


*/