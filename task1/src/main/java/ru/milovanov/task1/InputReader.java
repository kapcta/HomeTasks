package ru.milovanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    private int size;
    public InputReader() throws IOException {
        this.size = readSizeFromCommandLine();
    }
    public void setSize() throws IOException {
        this.size = readSizeFromCommandLine();
    }
    public int getSize() {
        return size;
    }
    public int readSizeFromCommandLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер таблицы");
        String sizeArray = reader.readLine();
        return Integer.parseInt(sizeArray);
    }
}
