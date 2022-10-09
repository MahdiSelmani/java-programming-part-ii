package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField TF = new TextField();
        Button btn = new Button("Update");
        Label label = new Label();
        VBox v = new VBox();

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                label.setText(TF.getText());
            }
        });

        v.getChildren().add(TF);
        v.getChildren().add(btn);
        v.getChildren().add(label);

        Scene scene = new Scene(v);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
