package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bp = new BorderPane();
        Label North = new Label("NORTH");
        Label South = new Label("SOUTH");
        Label East = new Label("EAST");
        bp.setTop(North);
        bp.setBottom(South);
        bp.setRight(East);
        
        Scene scene = new Scene(bp);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
    }

}
