import java.util.Scanner;

class funsiPersegi {
    public static void main(String[] args) {
        int panjang, lebar;

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Panjangnya (m) : ");
            panjang = input.nextInt();
            System.out.print("Masukan Lebarnya (m)   : ");
            lebar = input.nextInt();
            tampilkanHasil(lebar,panjang);



        }
    }
    static void tampilkanHasil(int lebar,int panjang){
        System.out.println("Gambar Luas dari segi panjang gambar diatas adalah : ");
        gambarLuas(lebar,panjang);
        System.out.println("====".repeat(20));
        System.out.println("Luas dari segi panjang gambar diatas adalah : "+ Luas(lebar,panjang));
        System.out.println("====".repeat(20));

        System.out.println("Keliling dari segi panjang gambar diatas adalah : "+ keliling(lebar,panjang));
        System.out.println("====".repeat(20));

    }
    static void gambarLuas(int x, int y){
        for (int i = 0; i<x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

     static int keliling(int x,int y){
        int Arround = 2*(x+y);
        return Arround;
    }
    static int Luas(int x, int y){
        int Square = x*y;
        int result = x*y;
        return result;
    }
}
