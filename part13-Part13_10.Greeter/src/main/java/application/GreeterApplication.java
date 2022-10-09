package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("Enter your name and start.");
        Label l2 = new Label("Welcome name!");
        TextField TF = new TextField();
        Button B = new Button("Start");

        VBox VB = new VBox();
        VB.getChildren().add(l1);
        VB.getChildren().add(TF);
        VB.getChildren().add(B);

        Scene scene1 = new Scene(VB);
        Scene scene2 = new Scene(l2);

        B.setOnAction(event -> {
            String s = TF.getText();
            l2.setText("Welcome " + s + "!");
            primaryStage.setScene(scene2);
            
        });

        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}
