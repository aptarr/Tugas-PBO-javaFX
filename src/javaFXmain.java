import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class javaFXmain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button();
        btn.setText("bilang Hallo bang");
        
        Button btn2 = new Button();
        btn2.setText("Coba Bang");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hallo bang");
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Ngapa bang?");
            }
        });
        
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        btn.setLayoutX(100);
        btn2.setLayoutY(200);
        
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("testing testing");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}