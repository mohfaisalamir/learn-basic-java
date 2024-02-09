import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // membuat aray cara 1
        String [] javaDays = new String[5];
        // denngan mengubah/memodifikasi element
        javaDays[0] = "Pahing";
        javaDays[1] = "legi";
        javaDays[2] = "Pon";
        javaDays[3] = "Kliwon";
        javaDays[4] = "Wage";

        String [] arabicMonths = {"Dzulqodah", "Ramadhan","Syawal"};
        int[] number = {1,2,3,4,5,6,7};
        number[0] = 19;

    /*    System.out.println(Arrays.toString(javaDays));
        System.out.println(Arrays.toString(arabicMonths));
        System.out.println(Arrays.toString(number));
        System.out.println(number.length);
        System.out.println(arabicMonths.length);
        System.out.println(javaDays.length);*/


        int [] anka = {1,2,3,4,5,6,7,8,9};
        // mengcopy data array yang ada ke array baru
        int [] bilangan = anka;
        int [] bilangan2= Arrays.copyOf(anka,2); //copy by value
//        System.out.println(Arrays.toString(anka));
//        System.out.println(Arrays.toString(bilangan));
//        System.out.println(Arrays.toString(bilangan2));
//        for (int i=0; i<anka.length; i++){
//            System.out.println("cetak elemnet "+anka[i]+ " index ke "+(i+1));
//        }
        int [][] arrayDuaD = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(arrayDuaD));
        System.out.println(arrayDuaD[2][0]);
        System.out.println();
        // atau
        for (int i=0; i<arrayDuaD.length; i++){
            for (int j = 0; j < arrayDuaD[i].length; j++) {
                System.out.println(arrayDuaD[i][j] + "tai");

            }
            System.out.println();
        }

        // pakai ForEach untuk melakukan pengambilan semua data pada array atau collective ==> tanpa memperhatikan data
        // ForEach
        for(String Javadays: javaDays){
            System.out.println(Javadays);
        }
        for (int[] i: arrayDuaD){
            for (int j:i){
                System.out.println(j);

            }
        }

        /*- membuat Array
- input (nambah element) &
- modify(remove/delete) Array*/
    }
}
