public class forLoop {
    public static void main(String[] args) {
   // looping versi forloop
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i==3){
                continue;
            }
            System.out.println("Cetak angka hingga  "+ i);

        }
        // looping versi do while

        int j = 0;
        while (j<n){
            if (j==4){
                continue;
            }
            j++;
            System.out.println("Cetak j hingga "+j);

        }
        int m = 7;
        // looping bintang segitiga forloop
        for (int l = 0; l <= m ; l++){
            for (int k = m ; k>=l ;k-- ){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
