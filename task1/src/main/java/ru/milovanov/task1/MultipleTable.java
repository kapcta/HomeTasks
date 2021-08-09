package ru.milovanov.task1;

import java.io.IOException;

public class MultipleTable {

    InputWriter writer = new InputWriter();
    private final int sizeArray = writer.enterArraySize();
    private final int[][] myArray = new int[sizeArray+1][sizeArray+1];

    // почему он меня просит создавать консруктор,
    // если не создаю, подчёркивает enterArraySize();
    public MultipleTable() throws IOException {
    }

    public int getSizeArray() {
        return sizeArray;
    }

    public int[][] createTable() {
        for (int i = 0; i <= sizeArray; i++) {
            for (int j = 0; j <= sizeArray; j++) {
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
