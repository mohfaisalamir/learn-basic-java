import java.util.Arrays;

public class Array_Multidimensi {
    public static void main(String[] args) {
        System.out.println("Sinau Array MultiDimensi");

        //cara membuat array dua dimensi
//        int[][][][][] array_10 = {{{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}},{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}}},{{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}},{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}}}};
        int[][] array_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] array_b = {
                {3,2,1},
                {1,2,3},
                {0,0,0}
        };
        int[][] array_c = {
                {3,3,3},
                {2,2,2},
                {1,1,1}
        };
//        printArray(array_a);
//        System.out.println();
//        printArray(array_b);
//        System.out.println();

//        int [][][][][] array_11 = new int[10][10][10][10][10];//       printArray(array_10);
//        printArray(array_11);
//        for (int i = 0; i < array_10.length; i++) {
//            for (int j = 0; j < array_10[i].length; j++) {
//                for (int k = 0; k < array_10[i][j].length; k++) {
//                    for (int l = 0; l < array_10[i][j][k].length; l++) {
//                        for (int m = 0; m < array_10[i][j][k][l].length; m++) {
//                            System.out.print(array_10[i][j][k][l][m]+",");
//                        }
//                        System.out.print("   ,   ");
//
//                    }
//                    System.out.println();
//
//                }
//                System.out.println();
//
//            }
//            System.out.println();
//
//        }
//    }
//    public static void printArray(int[][][][][] array){
//        System.out.println(Arrays.deepToString(array));
// penjumlahan array tiga dimensi
//       printArray(sumArray(array_a,array_b));
        System.out.println("==".repeat(20));
       printArray(multiplyMatrix(multiplyMatrix(array_a,array_b),array_c));
    }
//    public static int[][]sumArray(int[][]a,int[][]b) {
//
//        int[][] result = new int[0][];
//        if (a.length == b.length && a[0].length == b[0].length) {
//            System.out.println("Panjang Array sama,\n silakan lanjutkan itung matrix");
//            result = new int[a.length][a[0].length];
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a[0].length; j++) {
//                    result[i][j] = a[i][j] + b[i][j];
//                }
//            }
//
//        }
//        else {
//            System.out.println(" panjang Array tidak sama \n Menjumlahkannya sama dengan mencelakaimu !!!");
//        }
//        return result;
//    }

    public static int[][] multiplyMatrix(int[][] a,int[][] b){
        int[][] hasilKali = new  int[a.length][b[0].length];
        int buffer;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                buffer = 0;
                for (int k = 0; k < a[0].length; k++) {

                    buffer += a[i][k] * b[k][j];
                }
                hasilKali[i][j]=buffer;
            }
        }
        return hasilKali;
    }

    public static void printArray(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print("[");
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]);

                if(j<c[0].length-1){
                    System.out.print(" , ");
                }else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
    }

}
