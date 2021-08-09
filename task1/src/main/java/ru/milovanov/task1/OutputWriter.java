package ru.milovanov.task1;

import java.io.IOException;

public class OutputWriter {

    MultipleTable multipleTable = new MultipleTable();

    public OutputWriter() throws IOException {

    }

    public void printTable() {
        for (int i = 0; i <= multipleTable.getSizeArray(); i++) {
            for (int j = 0; j <= multipleTable.getSizeArray(); j++) {
                System.out.printf("%4s", (multipleTable.createTable())[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
