import java.util.Arrays;

public class ArrayKT {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
//        arrayAngka1[0]=20;
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        arrayAngka2[0] = 300;
        arrayAngka1[0] = 200;
        arrayAngka2=arrayAngka1;
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
        System.out.println("hasil 1==> "+ Arrays.toString(arrayAngka1));
        System.out.println("hasil 2==> "+ Arrays.toString(arrayAngka2));

        ubahElement(arrayAngka1);
        ubahElement(arrayAngka2);
        System.out.println("hasil fungsi 1==> "+ Arrays.toString(arrayAngka1));
        System.out.println("hasil fungsi 2==> "+ Arrays.toString(arrayAngka2));
    }

    // ini method dengan argument berupa Refference, pass by refference (alamat memori) kenpa? karena array
    // memang seperti itu, jika argumen berupa value, itu adalah data primitive (pass by value)

    public static void ubahElement(int[] tai) {
        tai[1] = 9000;
    }
}
