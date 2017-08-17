package ru.davidlevy.lesson4.homework;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Settings {
    private static Stage settingsWindow = new Stage();
    private static Pane pane = new Pane();
    // поля:
    public static TextField textUserName = new TextField();

    public Settings() {
        settingsWindow.setTitle("Settings");
        settingsWindow.initOwner(MainClass.mainStage);
        settingsWindow.initModality(Modality.WINDOW_MODAL);
        //**
        // по горизонтали
        VBox vbox = new VBox();
        // по вертикали
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5, 5, 5, 5));
        hbox.setHgrow(vbox, Priority.ALWAYS);
        Label lblUserName = new Label("User name");
        lblUserName.setPadding(new Insets(5, 5, 5, 5));
        //todo textUserName.setText(Controller.param.getUserName());
        hbox.getChildren().addAll(lblUserName, textUserName);
        //
        Button btnSaveSettings = new Button();
        btnSaveSettings.setText("Save");
        btnSaveSettings.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                saveSettings();
            }
        });
        //
        vbox.getChildren().addAll(hbox, btnSaveSettings);
        //
        pane.getChildren().add(vbox);
        //**
        Scene scene = new Scene(pane, MainClass.mainStage.getWidth() / 2, MainClass.mainStage.getHeight() / 2);
        settingsWindow.setScene(scene);
        settingsWindow.centerOnScreen();
    }

    private static void saveSettings() {
        //MainClass.param.saveToXml();
        settingsWindow.close();
    }

    public static void show() {
        settingsWindow.showAndWait();
    }
}
