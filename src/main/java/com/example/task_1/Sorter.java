package com.example.task_1;
/**
 * This class creates a collection and sorts it with the method sortData()
 * Then it calls a method writeSortFile() that writes data to a file
 * Этот класс создает коллекцию и сортирует ее методом sortData()
 * После чего вызывает метод writeSortFile() который записывает данные в файл
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorter {
    List<String> stringList = new ArrayList<>();

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void sortData() {
        SortWriter sortWriter = new SortWriter();

        Collections.sort(stringList);
        // System.out.println(stringList);
        // To check reading.
        sortWriter.writeSortFile(stringList);

    }
}