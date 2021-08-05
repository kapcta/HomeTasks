package ru.milovanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {

        Input input = new Input();
        int sizeArray = input.inputArraySize();
        CreationMultipleTable creationMultipleTable = new CreationMultipleTable();
        int[][] myArray = creationMultipleTable.createTable(sizeArray);
        Output output = new Output();
        output.outPutArray(myArray, sizeArray);

    }

    static class Input {

        public int inputArraySize() throws IOException {

            System.out.println("Enter the sie of array");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        }
    }

    static class CreationMultipleTable {

        public int[][] createTable(int sizeArray) {

            int[][] myArray = new int[sizeArray + 1][sizeArray + 1];
            for (int i = 0; i <= sizeArray; i++) {

                for (int j = 0; j <= sizeArray; j++) {

                    myArray[0][j] = j;
                    myArray[i][j] = i * j;

                }

                myArray[i][0] = i;

            }

            return myArray;

        }
    }

    static class Output {

        public void outPutArray(int[][] array, int sizeArray) {

            for (int i = 0; i <= sizeArray; i++) {

                for (int j = 0; j <= sizeArray; j++) {

                    System.out.printf("%4s",array[i][j] + " ");

                }

                System.out.println("");

            }

        }

    }

}
