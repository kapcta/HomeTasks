package ru.milovanov.task1;

public class OutputWriter {
    private final int[][] table;
    private final int size;
    public OutputWriter(int[][] table, int size) {
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
