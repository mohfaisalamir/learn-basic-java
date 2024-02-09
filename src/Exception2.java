import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        FileInputStream file = null;

        System.out.println("Pada array berikut : " + Arrays.toString(array));
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nilai Array index ke - ");
            int index = input.nextInt();



            // Exception Handling (Try, Catch, and Finally)
            System.out.println("\n ===== Handling Out of Boun");
            try {
                System.out.printf("adalah %d \n ", array[index]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Ente Bid'ah !!! " + exception);
            }


            //  runtime Error jika File tidak ada
            System.out.println("\n ===== Handling Input output not found");
            try {
                file = new FileInputStream("input.txt");
            } catch (IOException e) {
                System.out.println("File mu raonok " + e);
            }


            // menggabungkan dua error
            System.out.println("\n ===== Menggabungkan dua buah exception");
            try {
                System.out.printf("adalah %d \n ", array[index]);
                file = new FileInputStream("input.txt");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error Gabungan " + e);
            } catch (IOException e) {
                System.err.println(e);
            }


            //Finally
            System.out.println("\n ===== Menambahkan Finally");
            try {
                System.out.printf("adalah %d \n ", array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error Gabungan " + e);
            } finally {
                System.out.println("Finally");
            }

            System.out.println("Akhir darin program");
        }
    }
}

