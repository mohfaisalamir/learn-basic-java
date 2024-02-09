public class Operator {
    public static void main(String[] args) {
        int number = 13;
        int number2= number%3;
        System.out.println(number2);
        double a = 13;
        double b = a/2;
        System.out.println("tai "+ b);

        // String
        String name = "Aidit";
        String lastName = "iya";
        String longName = name + lastName;
        System.out.println("nama : "+ longName);

        // increment (++), decrement(--)
        int inCrement = 2;
        ++inCrement;
        int deCrement = 2;
        deCrement++;
        System.out.println("ini hasil increment : "+inCrement + " Dan Decrement : "+deCrement);
        // ++inCrement dieksekusi diline nya
        // inCrement++ dieksekusi setelah linenya dilewati
    }
}
