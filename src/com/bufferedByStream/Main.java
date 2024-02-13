package com.bufferedByStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {

        // membaca dari file
        FileInputStream fileInputStream     = new FileInputStream("src/com/bufferedByStream/input.txt");
//        System.out.println(fileInputStream.available());

        // menghitung kecepatan pembacaan file

        long waktuStart, waktuFinnish;
        waktuStart = System.nanoTime();
        System.out.println(fileInputStream.readAllBytes() +" menghitung kecepatan pembacaan file gak pakai buffered");
        waktuFinnish = System.nanoTime();

        long deltaTime = waktuFinnish-waktuStart;
        System.out.println("Waktu pembacaan fileInpuTream in nanoSecod = " + deltaTime +"\n");


        // membaca dari memory
        FileInputStream fileInputStream1 = new FileInputStream("src/com/bufferedByStream/input.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream1);
        // mark
        bufferedInputStream.mark(7000);


        // menghitung kecepatan pembacaan file

        waktuStart = System.nanoTime();
        byte[] newAja = bufferedInputStream.readAllBytes();
        String newString = new String(newAja);
        System.out.println(newString + " menghitung kecepatan pembacaan file pakai buffered");
        waktuFinnish = System.nanoTime();

        long deltaTime1 = waktuFinnish-waktuStart;
        System.out.println("Waktu pembacaan fileInpuTream in nanoSecod = " + deltaTime1);

        // rarsio selisih waktu antara pakai dan tidak pakai buffered
        double rasioSelisihWaktu = ((double) deltaTime/(double) deltaTime1);
        System.out.println("Rarsio selisih waktu antara pakai dan tidak pakai buffered : " +rasioSelisihWaktu);

        //baca ulang
        bufferedInputStream.reset();

        byte[] data = bufferedInputStream.readAllBytes();
        String tai = new String(data);
        System.out.println("ini data hasil mark() dan reset() \n"+ tai);

        // menulis file dengan buffered
        FileInputStream menulisFile = new FileInputStream("src/com/bufferedByStream/input1.txt");
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(menulisFile);

        bufferedInputStream1.mark(0);

        bufferedInputStream1.reset();



        byte[] data1 = bufferedInputStream1.readAllBytes();
        FileOutputStream tai2 = new FileOutputStream("src/com/bufferedByStream/output1.txt");
        tai2.write(data1);
        FileInputStream fileInputStream2 = new FileInputStream("src/com/bufferedByStream/output1.txt");
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream2);
        byte[] bytes = bufferedInputStream2.readAllBytes();
        String string = new String(bytes);
        System.out.println("\n\n read dari file terbari hasil write "+ string);


        tai2.close();
        fileInputStream.close();
    }
}
