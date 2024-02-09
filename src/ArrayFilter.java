import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFilter {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,4,5,6,7,8,9,11,22,33,44,55,6,12,3,4,2,33,12,90};
        int[] kelipatan3and6 = filterArray(number);
        printArray(kelipatan3and6);
        int[] multipliedElements = multiplyElement(kelipatan3and6);
        printArray(multipliedElements);
    }

    public static int[] filterArray(int[] input) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 3 == 0 && input[i] % 6 == 0) {
                tempList.add(input[i]);
            }
        }
        int[] result = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }
        return result;
    }

    public static int[] multiplyElement(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= 3;
        }
        return input;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
