package ru.milovanov.task1;

public class MultipleTable {
    private final int[][] myArray;
    public MultipleTable(int size) {
        myArray = new int[size+1][size+1];
    }
    public int[][] createTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1) {
                    myArray[i][j] = j;
                }
                if (j == 1) {
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
