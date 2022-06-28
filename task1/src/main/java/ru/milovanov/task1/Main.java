package ru.milovanov.task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InputWriter inputWriter = new InputWriter();
        MultipleTable multipleTable = new MultipleTable(inputWriter.getSize());
        OutputWriter outputWriter = new OutputWriter();
        outputWriter.printTable(multipleTable);
    }
}
