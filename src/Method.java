public class Method {
    public static void main(String[] args) {
        int x = 10;
        fungsi(x);
        int y = 20;
        fungsi(y);
        int z = 888;
        fungsi(z);

        printFunsi2(x);
        printFunsi2(y);
        printFunsi2(z);



    }
    static void fungsi (int input){

        int hasil = input*(input+2);
        System.out.println("Hasil dari f("+input+") , adalah : "+hasil);
    }
    static int fungsi2 (int input2){
        int hasil = input2*(input2*9);
        return hasil;
    }
    static void printFunsi2(int input){
        System.out.println("untuk f("+input+"), maka hasilnya : "+ fungsi2(input));
    }
}
