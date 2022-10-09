package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane BP = new BorderPane();
        Label L1 = new Label("First view!");
        Button B1 = new Button("To the second view!");
        BP.setTop(L1);
        BP.setCenter(B1);
        Scene scene1 = new Scene(BP);

        VBox Vb1 = new VBox();
        Button B2 = new Button("To the third view!");
        Label L2 = new Label("Second view!");
        Vb1.getChildren().add(B2);
        Vb1.getChildren().add(L2);
        Scene scene2 = new Scene(Vb1);

        GridPane GP = new GridPane();
        Label L3 = new Label("Third view!");
        Button B3 = new Button("To the first view!");
        GP.add(L3, 0, 0);
        GP.add(B3, 1, 1);
        Scene scene3 = new Scene(GP);
        B1.setOnAction(event -> primaryStage.setScene(scene2));
        B2.setOnAction(event -> primaryStage.setScene(scene3));
        B3.setOnAction(event -> primaryStage.setScene(scene1));
        
        
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }

}
