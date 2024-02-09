import java.util.Locale;

public class operasiString {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan Nasi Goreng";
        String kata    = kalimat.substring(5,9).toUpperCase();
        System.out.println(kalimat);
        System.out.println(kalimat.charAt(6));
        System.out.println(kalimat.toLowerCase());
        System.out.println("tai ".repeat(20));
        System.out.println(kalimat.toUpperCase());

        System.out.println(kata);
        String kalimat2 = kata + " Bakwan";
        kata = kata + " coreng";
        System.out.println(kalimat2);
        System.out.println(kata);
        String kalimat3 = kalimat.replace("makan","membersihkan");
        System.out.println(kalimat3);
    }
}
