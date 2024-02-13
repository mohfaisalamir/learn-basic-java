package com.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new FileReader("src/com/Scanner/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        // Scanner itu bisa loh kalo di suruh baca isi file, jadi gini caranya

        Scanner scanner = new Scanner(bufferedReader);
        System.out.println(scanner.next());  // .next() digunakkan untuk membaca dan mencetak disertai default pemisah/delimiter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext()); // hasNext() digunakan untuk mengecek apakah
        // ada kata selanjutnya atau tidak dengan nilai boolean true jika setelah melakukan hasNext() terdapat kata dan
        // jika setelah nya tidak ada kata maka boolean bernilai false


        // sekarang kita berhadapan dimana delimiter nya adalah , (sebenarnya delimiter itu tanda apapun busa, . * dll.)
        FileReader fileInput2 = new FileReader("src/com/Scanner/input1.txt");
        bufferedReader =new BufferedReader(fileInput2);
        bufferedReader.mark(300);

         scanner = new Scanner(bufferedReader);
         scanner.useDelimiter(","); // lucu sih, ini delimiter digunakan untuk // meng enter(spasi kebawah) berdasaekan karakter yang kita inginkan

        while (scanner.hasNext()){  // ingat hasNext() dia bernilai boolean, jika setelanya ada kalimat maka bernilai true, jika tidak maka false
            System.out.println(scanner.next());
        }
        // selain pakai scanner kita juga bisa pakai,
        // tokenNizer ini ngambil sebaris doang
        bufferedReader.reset();
        String string = bufferedReader.readLine();
        System.out.println(string);



        // pengen ngitung karater string
        String itungstring = "saya,memiliki,ibu,dia,bernama,painah,\n" +
                "dia,orang,yang,apatis,terhadap,apapun\n" +
                "dan,sangat,membenci,konflik,\n" +
                "tapi,dia,amat,sangat,mencintai,anaknya\n" +
                "saya,anaknya,saya,berjanji,akan,membangunkan,dia,kos,kosan,10,kamar,untuk,passif,income,di,masa,tuanya.";
        System.out.println(itungstring.length());

        // tanyakan ke AI buka Note
    }
}
