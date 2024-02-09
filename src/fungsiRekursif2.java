import java.util.Scanner;

public class fungsiRekursif2 {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukin x di f(x) : ");
            int n = input.nextInt();
            System.out.println(fibonaci2(n));
        }

    }
    public static int fibonaci2(int n){
        if (n==1||n==0){
            return n;
        }

        return fibonaci2(n-1) + fibonaci2(n-2);
    }
}
