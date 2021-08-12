package com.example.dndrandomcharacter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Random Stat Generator");
            GridPane grid = new GridPane();
            Button generate = new Button();
            generate.setText("Generate Random Character");
            grid.add(generate, 2,2);
            generate.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                PlayerCharacter player = new PlayerCharacter();
                player.generateCharacter();
                System.out.println(player.playerRace.getSubRace() + " "
                                    +player.playerRace.getName());
                System.out.println(player.playerClass.getName());
                System.out.println(player.playerAlignment.getAlignment());
                System.out.println(player.stats.toString());
                }
            });
            PlayerCharacter character = new PlayerCharacter();
            character.generateCharacter();

            Scene scene = new Scene(grid,600,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        };
    }

    public static void main(String[] args) {
        launch(args);
    }

}
