package ru.milovanov.task1;

import java.io.IOException;

public class MultipleTable {
    private final int[][] myArray;
    public MultipleTable(int size) throws IOException {
        this.myArray = createTable(size);
    }
    public int[][] createTable(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i == 0) {
                    myArray[i][j] = j;
                }
                if (j == 0) {
                    myArray[i][j] = i;
                } else {
                    myArray[i][j] = i * j;
                }
            }
            myArray[i][0] = i;
        }
        return myArray;
    }
}
