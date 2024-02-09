public class arrayOdd {
    public static void main(String[] args) {
        printWeirdAndNotWeird(24);
    }
    public static void printWeirdAndNotWeird(int n) {
        // fill this code
        if (n % 2 == 0 && (n>=2 && n<5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (6>=2 && n<20)) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n>20) {
            System.out.println("Not Weird");
        }else {
            System.out.println("Weird");
        }
    }
}