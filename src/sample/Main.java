package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

    Scene scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Property Investor");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();

    /*
        Button button2 = new Button("scene2");
        Label label2 = new Label("Dette er scene 2");
        button2.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(button2, label2);
        scene2 = new Scene(root,200,200);
        */
    }


    public static void main(String[] args) {
        launch(args);
    }
}
