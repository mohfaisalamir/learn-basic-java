import java.util.Arrays;
import java.util.Scanner;
import java.lang.Exception;

public class MethodException {
    public static void main(String[] args) {
        int[] array = {10,111,280,300,411};
        Scanner input = new Scanner(System.in);

        //tampilkan ke konsol
        System.out.println("Array tjap Tai : "+Arrays.toString(array));
        System.out.print("Masukan Index : ");
        int i= input.nextInt();
        //Exception Biasa
        System.out.println("\nException Biasa "+"=".repeat(30));
           try {
               System.out.printf("data ke %d dari array di atas adalah %d\n\n",i,array[i]);
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Dancok, kon sesat Cok!, delok En iki : "+e.getMessage());
           }

        // Exception didalam fungsi
        System.out.println("\nException didalam fungsi "+"=".repeat(21));
        int data = ambilData(i,array);
        if(data!=0){
            System.out.printf("data ke %d dari array di atas adalah %d\n\n",i,data);
        }

        // Exception throws by Method
        System.out.println("\nException didalam fungsi pakek Throw "+"=".repeat(9));
        int data2=0;
        try {
            data2 = ambilData2(i,array);
        }catch (Exception e){
            System.out.println("Versi THROW "+e.getMessage());
        }
        System.out.printf("data ke %d dari array di atas adalah %d\n\n",i,data2);
        System.out.println("\n\n Akhir dari program");





    }
    public static int ambilData(int index, int[] array){
        int hasil = 0;
        try {
            hasil = array[index];
        }catch (Exception e){
            System.out.println("Doboool, kelebihan index cok cancok, delok en iki! : "+e.getMessage());
        }
        return hasil;
    }
    public static int ambilData2(int index, int[]array)throws Exception{
        int hasil =array[index];
        return hasil;
    }
}
