package ru.milovanov.task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InputReader inputReader = new InputReader();
        MultipleTable multipleTable = new MultipleTable(inputReader.getSize());
        OutputWriter outputWriter = new OutputWriter(multipleTable.createTable(inputReader.getSize()), inputReader.getSize());
        outputWriter.printTable();

    }
}
