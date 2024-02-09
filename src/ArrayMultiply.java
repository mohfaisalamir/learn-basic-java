import java.util.Arrays;

public class ArrayMultiply {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,6,12,18,72,5,66,7,8,9,8,99,132,264};

        int [] arr1 = filterArray(arr);
        int[] arr2 = multiplyElement(arr1);

        print(arr1,arr2);
    }
    public static int[] filterArray(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 3 == 0 && input[i] % 6 == 0) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 3 == 0 && input[i] % 6 == 0) {
                newArray[index] = input[i];
                index++;
            }
        }

        return newArray;
    }

    public static int[] multiplyElement(int[] input) {
        int [] resultMult = new int[input.length];
        for (int i = 0; i < input.length; i++){
            resultMult[i] = input[i] * 3;
        }

        return resultMult;
    }
    public static void print(int[]array1, int []array2){
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}
