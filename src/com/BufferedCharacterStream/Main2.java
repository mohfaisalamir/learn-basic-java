package com.BufferedCharacterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // Membaca file
        FileReader fileReader = new FileReader("src/com/BufferedCharacterStream/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Menandai posisi saat ini dengan buffer 100 karakter
        bufferedReader.mark(100);

        // Membaca beberapa baris pertama
        System.out.println("Membaca beberapa baris pertama:");
        for (int i = 0; i < 5; i++) {
            System.out.println(bufferedReader.readLine());
        }

        // Mereset ke posisi yang ditandai sebelumnya
        bufferedReader.reset();

        // Membaca kembali dari posisi yang ditandai
        System.out.println("\nMembaca kembali dari posisi yang ditandai:");
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // Menutup buffered reader
        bufferedReader.close();
    }
}
