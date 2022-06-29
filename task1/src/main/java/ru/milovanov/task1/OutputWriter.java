package ru.milovanov.task1;

import java.io.IOException;

public class OutputWriter {
    private final int[][] table;
    private final int size;
    public OutputWriter(int[][] table, int size) throws IOException {
        this.table=table;
        this.size=size;
    }

    public void printTable() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4s", table[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
