package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;
        // Membuka file
        file =  new FileInputStream("src/Tai.txt");

        // Membaca file
        int data = file.read();
        while (data!=-1){
            System.out.print((char) data);
            data= file.read();
        }
        //Menutup file
        file.close();
    }
}
