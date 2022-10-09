package buttonandtextfield;


import com.sun.glass.events.MouseEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Button button = new Button("Click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        TextField tf = new TextField("Tape here");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(button);
        fp.getChildren().add(tf);
        Scene view = new Scene(fp);
        primaryStage.setScene(view);
        primaryStage.show();

    }
    
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
