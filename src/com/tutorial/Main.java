package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;
        FileOutputStream fileOutputStream = null;
        // Membuka file
        file = new FileInputStream("src/nita.txt");

        // Membaca file
        int data = file.read();
        while (data != -1) {
            System.out.print((char) data);
            data = file.read();
        }
        //Menutup file
        file.close();
        // salah satu contoh sekenario pembukaan dan penulisan file

        try {
            file = new FileInputStream("src/nita.txt");
            fileOutputStream = new FileOutputStream("2.txt");
            int buffer = file.read();
            while (buffer != -1) {
                fileOutputStream.write((char) buffer);
                buffer = file.read();
            }
        } finally {
            if (file != null) {
                file.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
        // Yang rerakhir, sekarng tanpa Finally, pakai (try with resources)
        // apa itu?, ini automatis nge - close tanpa pakai finally yang berisi .close(), kita dapat deklarasikan (FileInputStream) di / stelah try-nya

        try (FileInputStream in = new FileInputStream("txt.txt")) {
            fileOutputStream = new FileOutputStream("txt1.txt");

            int buffer2 = in.read();
            while (buffer2 != -1) {
                fileOutputStream.write((char) buffer2);
                buffer2 = in.read();
            }
        }
//        System.out.println(in); in di luar csope tak bisa di print, karena dia auto close yang disebabkan karena apa?

    }
}
