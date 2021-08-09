package ru.milovanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputWriter {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int enterArraySize() throws IOException {
        System.out.println("Введите размер таблицы");
        String sizeArray = reader.readLine();
        return Integer.parseInt(sizeArray);
    }
}
