package com.tutorial2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Membuka
        // byte stream ==> FileInputStream
        // file stream ==> FileReader
        FileInputStream byteFileInput    = new FileInputStream("src/com/file/text.txt");
        FileReader      charFileInput    = new FileReader("src/com/file/text.txt");

        FileOutputStream byteFileOutput  = new FileOutputStream("src/com/file/textOutputByte.txt");
        FileWriter      charFileOutput   = new FileWriter("src/com/file/textOutputChar.txt");


        // Membaca
/*        System.out.println((char) charFileInput.read());
        System.out.println((char) charFileInput.read());
        System.out.println((char) charFileInput.read());
        System.out.println((char) charFileInput.read());*/
        // byte file
        System.out.println("\n");
        int buffer = byteFileInput.read();
        while (buffer != -1){
            System.out.print((char)buffer );
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }
        // Char file
        System.out.println("\n");
        buffer = charFileInput.read();
        while (buffer != -1){
            System.out.print((char)buffer );
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // Menutup
        byteFileInput.close();
        charFileInput.close();
        byteFileInput.close();
        charFileOutput.close();
    }
}
