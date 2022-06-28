package ru.milovanov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputWriter {
    private int size;
    public InputWriter() throws IOException {
        this.size = enterArraySize();
    }
    public void setSize() throws IOException {
        this.size = enterArraySize();
    }
    public int getSize() {
        return size;
    }
    public int enterArraySize() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите размер таблицы");
            String sizeArray = reader.readLine();
            return Integer.parseInt(sizeArray);
        }


}
