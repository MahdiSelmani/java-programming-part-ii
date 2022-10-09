package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label L1 = new Label("What do you call a bear with no teeth?");
        L1.setMinWidth(400);
        L1.setMinHeight(50);
        L1.setAlignment(Pos.CENTER);
        Button B1 = new Button("Joke");
        Button B2 = new Button("Answer");
        Button B3 = new Button("Explanation");
        HBox HB = new HBox(L1,B1,B2,B3);
        VBox VB = new VBox(L1,HB);
        HB.setAlignment(Pos.CENTER);
        
        B1.setOnAction(event->L1.setText("What do you call a bear with no teeth?"));
        B2.setOnAction(event->L1.setText("A gummy bear."));
        B3.setOnAction(event->L1.setText("This is the a explanation  !"));
        
        Scene scene = new Scene(VB);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
