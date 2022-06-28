package ru.milovanov.task1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class OutputWriter {
    //Set<Object> result = new HashSet<Object>();
    public OutputWriter() throws IOException {
        ;
    }
    public void printTable(Object object) {

        /*for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.printf("%4s",  object[i][j]+ " ");
            }
            System.out.println("");*/
        //result.addAll((Collection<?>) object);
        System.out.println(object.toString());
    }
}
