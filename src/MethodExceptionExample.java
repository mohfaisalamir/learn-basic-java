import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodExceptionExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/nita.txt");
        FileInputStream fileInputStream1 = new FileInputStream("txt.txt");

        try {
           FileInputStream fileInputStream2 = fileInputStream1;
        }catch (java.lang.Exception e){
            System.err.println("Raonok suuu "+e.getMessage());
        }
        System.out.println("File ditemukan");
        System.out.println((char)fileInputStream.read());
        System.out.println((char)fileInputStream.read());
        System.out.println((char)fileInputStream.read());
        System.out.println((char)fileInputStream.read());


    }
}
