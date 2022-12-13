package com.example.task_1;
/**
 * the class has a method initialize() that handles a "Sort" button click and reads data from a file
 * with the full path to which is entered in the text field
 * the method openNewScene() calls a window with a message if the file was not found
 * класс имеет   метод initialize()? который обрабатывает щелчок по кнопке "Sort"
 * и читает данные из файла полный путь к которому вписан в текстовое поле
 * метод openNewScene() вызывает окно с сообщением если файл был не найден
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TaskController {
    private String name;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private TextField fileName;

    @FXML
    private Button sortButton;


    @FXML
    void initialize() {
        sortButton.setOnAction(actionEvent -> {
            Sorter sorter = new Sorter();
            SortWriter sortWriter = new SortWriter();
            name = fileName.getText().trim();
            if (name.equals("")) {
                sortButton.getScene().getWindow().hide();
                openNewScene("messege.fxml");
            }
            try {
                File file = new File(name);

                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    sorter.stringList.add(line);
                }
            } catch (FileNotFoundException e) {
                sortButton.getScene().getWindow().hide();
                openNewScene("messege.fxml");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            sorter.setStringList(sorter.stringList);
            sorter.sortData();

        });

    }

    public void openNewScene(String window) {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(window));

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = fxmlLoader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
