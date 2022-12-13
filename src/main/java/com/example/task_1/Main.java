package com.example.task_1;
/**
 * Create a java application that will read data from a source (an in.txt file) and sort it.
 * The data has a tabular structure. Lines are separated by line breaks. Columns are tabs.
 * The data must be sorted and output to the out.txt file.
 * Sorting is done first by the first column of rows,
 * then by the second (if the rows or numbers in the first column are the same), and so on.
 * Data related to the same row in the grid must also be in the same row.
 * At the same time: any number in the column is higher than any non-number, numbers are sorted in ascending order,
 * lines are in lexicographic order.
 *
 * Создайте java-приложение, которое будет считывать данные из источника (файл in.txt) и выполнять их сортировку. Данные имеют табличную структуру. Строки разделены переносом строки. Столбцы – знаком табуляции.
 * Данные необходимо отсортировать и вывести в файл out.txt.
 * Сортировка производится сначала по первой колонке строк, потом по второй (если строки или числа в первой колонке совпадают) и т.д.. Данные относящиеся к одной строке в гриде должны быть также в одной строке.
 * При этом: любое число в колонке выше любого не числа, числа отсортированы по возрастанию, строки в лексикографическом порядке.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("task.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 588, 588);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}