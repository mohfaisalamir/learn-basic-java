public class PrimitiveDataType {
    public static void main(String[] args) {
/*        // cara buat variable di java | TypeData namaVariable = value;
        String name = "Budi";

        // println ==> untuk mencetak dan menambah baris baru
        System.out.println("Hello World "+name);
        System.out.println("halo");
        // print ==> untuk mencetak tanpa menambah baris baru
        System.out.print("halo \n");
        // printf ==> mrncetak dan melakukan formating (susunan tampilan - %s, %d, %f)
        // printf , tidak menambahkan line baru
        System.out.printf("halo %d %s",16, "umam \n"); //% harus sesauai utrutan, %d %s, maka value harus double lalu string, jika tidak maka error
        String d = "amir";
        System.out.printf("hai %s %d %s",d,1,d);*/
        Integer angka = 10000000;
        int onko = 10000000;
        System.out.println(angka+onko);
        /*
        * Primitive : int, boolean, char, float, double, byte, short, dan long
        * 1. numeric : byte, short, int, long
        * 2. pecahan : double, float
        * Boolean : boolean
        *
        * byte ==> -128 s.d 127
        * short ==> -32,768 s.d 32,767
        * int ==> -2,147,483,648 s.d 2,147,482,647
        * long
        * float
        * double
        * boolean
        * */
        byte numberbyte =-128;
        System.out.println(numberbyte);
        //assign
        short numberShort =32766;
        System.out.println(numberShort);
        long numberLong = 123456789012345l;
        //re-assign => diubah
        numberShort = 12;
        System.out.println(numberShort);
        double numberDouble = 112222222200000000222222222222222222222222222222222222.2;
        float numberFloat = 11.2222222200000000222222222222222222222222222222222222f;
        // boolean==> pilihan benar salah, yang var-nya biasanya atau sebaiknya diawali dangn is atau has
        boolean hasValue = false;
        boolean isActive = true;
        // casting ==> mengubah/konversi tipe data tertenu
        char charValue = 'A';
       // byte byteValue = (byte) charValue;
        //int intValue = byteValue;
        int intValue = (int)charValue;
        double doubleValue = (double)intValue;
        float floatValue = (float)doubleValue;

        System.out.println(charValue+ " "+/* +byteValue+ */" " +intValue+' '+doubleValue+' '+floatValue);
    }
}
