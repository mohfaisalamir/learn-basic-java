import java.util.Scanner;
import java.lang.Exception;

public class ExceptionMethod {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        System.out.print("Data Ke - ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        // exception biasa

   /*     try {
            System.out.printf("Indeks ke - %d bernilai %d", i,array[i]);
        }catch (Exception e){
            System.out.println(e);
        }*/

        System.out.println("\n\nAkhir dari program");

        System.out.println("\n Exception pakai method");
        int indexArray = ambilData(i,array);
        System.out.println(indexArray + " === gak tau apaaan");
    }

    // Exception pakai method

    public static int ambilData(int i, int[]array) {
        int result = 0;
        try {
            result = array[i];
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
