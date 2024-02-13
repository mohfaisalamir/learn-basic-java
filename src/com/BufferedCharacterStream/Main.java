package com.BufferedCharacterStream;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // membaca file dulu
        FileReader fileReader = new FileReader("src/com/BufferedCharacterStream/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.mark(1);

        // Membaca kedalam String
        String data = bufferedReader.readLine();
        System.out.println(data+ " memsky");
        bufferedReader.reset();


        // membaca kedalan char
        char[] dataChar = new char[900];
        bufferedReader.read(dataChar,9,80);
        System.out.println(Arrays.toString(dataChar));

        //membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        String lenBuff = bufferedReader.readLine();
        System.out.println(lenBuff.length());


        // menulis file
        FileWriter fileOutput = new FileWriter("src/com/BufferedCharacterStream/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);
        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();
        String baris2 = bufferedReader.readLine();
        String baris3 = bufferedReader.readLine();
        bufferedWriter.write(baris1);
        bufferedWriter.newLine(); // newline() buat enter di suatu file lain.
        bufferedWriter.write(baris2);
        bufferedWriter.newLine();
        bufferedWriter.write(baris3);
        System.out.println(baris1.length());
        System.out.println(baris2.length());
        System.out.println(baris3.length());
        bufferedWriter.flush();

        fileReader.close();
        fileOutput.close();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
