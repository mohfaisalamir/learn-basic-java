import java.util.Arrays;

public class string {
        public static void main(String[] args) {

            // membuat string
            String kata = "oi diancok mwatane asuuu";
            char[] huruf= {'h','a','l','l','o'};

            // menampilkan string
            System.out.println(kata+" = "+ Arrays.toString(huruf));

            //mengambil  element dalam string
            System.out.println(huruf[2]);
            System.out.println(kata.charAt(8));

            // mengubah element

            huruf[3]='m';
            System.out.println(huruf);

            // mengubah komponent dari string itu gak bisa, kerena immutable (), salah saty keistimewaannya adalah
            //Immutable merujuk pada sifat objek yang tidak dapat diubah setelah dibuat.
                    // seperti :
            // - kata[0]='m';
            // - kata.charAt(3) = '2';

        }


}
