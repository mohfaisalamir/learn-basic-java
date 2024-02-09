import java.util.Scanner;

public class fungsiRekursif {
    public static void main(String[] args) {


        Scanner in  = new Scanner(System.in);
        System.out.println("Masukan Kata : ");
        String input = in.nextLine();
        System.out.println("Masukan Jumlah Kata : ");
        int inputAngka = in.nextInt();
        System.out.println("Terimakasi "+input+", Tercatat");


        misuh(input, inputAngka);
        System.out.println(JumlahMisuh(inputAngka));;
    }
    public static void misuh(String pisuhan,int pingPiro){
        System.out.println("Ojo Ngomong " + pisuhan +" keculaili kurang teko "+ pingPiro + " Kata");
        if(pingPiro==0){
            return;
        }
        pingPiro--;
        misuh(pisuhan,pingPiro);
    }
    public static int JumlahMisuh(int ping){
        if(ping==1){
            return ping;
        }

        return ping * JumlahMisuh(ping-1);
    }
}
