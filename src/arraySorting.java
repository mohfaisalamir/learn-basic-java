import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args) {
        int[] arr = {19, 3, 7, 4, 8, 3, 99, 3, 2, 0, 5, 8, 4, 2};
        int[] newArr = sorting(arr);
        int[] newArr1= printArrayDuplikat(arr);
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr1));

    }

    public static int[] sorting(int[] aray) {
        for (int i = 0; i < aray.length - 1; i++) {
            for (int j = 0; j < aray.length - i - 1; j++) {
                if (aray[j] > aray[j + 1]) {
                    int buffer = aray[j];
                    aray[j] = aray[j + 1];
                    aray[j + 1] = buffer;
                }

            }

        }
        return aray;
    }

    public static int[] printArrayDuplikat(int[] aray) {
        int[] banyakElement = new int[aray.length];
        for (int i = 0; i < aray.length; i++) {
            for (int j =0 ; j < aray.length; j++) {
                if (aray[i] == aray[j]) {
                    banyakElement[i]++;
                }
            }
        }
        int[] elementDuplikat = new int[aray.length];
        int index = 0;
        for (int i = 0; i < banyakElement.length; i++) {
            if (banyakElement[i]>1){
                elementDuplikat[index]= aray[i];
                index++;
            }

        }
        return elementDuplikat;
    }
}