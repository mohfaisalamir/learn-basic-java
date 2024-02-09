import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        int[] number = {1,2,3,3,4,5,5,6,7,8,6,7,8,9,0,12,11,2,3};
        printArray(number, "Array 1 ");
        int[] number1= {3,2,4,2,4,5,6,500,1,1,1,1,1,1,1,1,1,1,1,1,0 };
        printArray(number1,"Array 2 ");
        int[] result = sumArray(number,number1);
        //panjang Array hasil mengikuti panjang array pertama dalam argumen, dan harus sama atau lebih panjang
        printArray(result,"Hasil : ");
        int[] result2= new int[number1.length+number.length];

//        Arrays.sort(number);
//        Arrays.sort(number1);
        printArray(number,"tai ");
        printArray(number1,"Tai ");
        System.out.println("Dancok " + number[7] );

        // menggabungkan/nyambungin dua buah array
        int [] result1 = new int[number.length + number1.length];
        for (int i = 0; i < number.length; i++) {
            result1[i]= number[i];
        }
        for (int i = 0; i < number1.length; i++) {
            result1[i+ number.length] = number1[i];
        }
        // coba mengurutukan dari kecil ke besar array result1 ==> pakai sort

        Arrays.sort(result1);
        System.out.println("Gabungan Array : "+Arrays.toString(result1));

        // coba mengurutukan dari besar ke  kecil  array result1
        int[] result1Descending = new int[result1.length];
        for (int i = 0; i < result1.length ; i++) {
            result1Descending[i]=result1[(result1.length-1)-i];

        }
        // coba mengurutukan dari besar ke  kecil  array result1
        int buffer;
        for (int i = 0; i < result1.length/2 ; i++) {
            buffer = result1[i];
            result1[i] = result1[(result1.length-1)-i];
            result1[(result1.length-1)-i]=buffer;
        }
        System.out.println("Gabungan Array urut : "+Arrays.toString(result1Descending));
        System.out.println("Gabungan Array urut2: "+Arrays.toString((result1)));
        System.out.println("Panjang Result : "+result1.length+" , Panjang Result descending : "+result1Descending.length);

    }
    private static void printArray(int[] input, String pesan){
        System.out.println(pesan+" = "+Arrays.toString(input));
    }
    private static int[] sumArray(int[] input, int[] input1){
        for (int i = 0; i < input.length; i++) {
            input[i]=input[i]+input1[i];
        }
        return input;
    }
}
