package com.example.task_1;
/**
 * the class has one method that writes data to a file
 * класс имеет один  метод который записывает данные в файл
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SortWriter {

    public void writeSortFile(List<String> strings) {

        try {
            FileWriter writer = new FileWriter("NewFile.txt");

            for (String line : strings) {
                writer.write(line);
                writer.write(System.getProperty("line.separator"));

            }

            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}