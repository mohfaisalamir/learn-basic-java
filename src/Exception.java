import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        while (true){
            int[] array = {0,1,2,3,4,5};

            Scanner input = new Scanner(System.in);
            System.out.print("Masukan index : ");
            int i = input.nextInt();

            System.out.println("=".repeat(30));

            //Exception Handling (try, catch, finaly)
            System.out.println("== handling out of bond ==");
            try {
                System.out.printf("Yang berada di index %d adalah %d \n",i, array[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inputmu klewat wates Cok Jancok : "+e);// bisa di isi pesan default Exception misal e, atau
                // anda bisa isi sendiri seperti ini
            }


            //  runtime  error jika file tidak ada
            System.out.println("== handling IO not found ==");
            FileInputStream file = null;

            try {
                file = new FileInputStream("txt.txt");
            }catch (IOException e){
                System.out.println(e);
            }

            // menggabungkan dua error
            System.out.println("== menggabungkan dua Exceptions ==");
            try {
                System.out.printf("Yang berada di index %d adalah %d \n",i, array[i]);
                FileInputStream file2 = new FileInputStream("txt.txt");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e + "\n kelebihan index");
            }catch (IOException e){
                System.out.println(e + "\n file kosong");
            }
            // Menambahkan finaly
            System.out.println("== menambahkan Finaly ==");
            try {
                System.out.printf("Yang berada di index %d adalah %d \n",i, array[i]);
                FileInputStream file2 = new FileInputStream("txt.txt");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e + "\n kelebihan index");
            }catch (IOException e){
                System.out.println(e + "\n file kosong");
            } finally {
                System.out.println("ini adalah Finaly");
            }
            System.err.println("akhiri program \n");

         }
    }
}
