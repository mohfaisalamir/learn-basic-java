public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("amir");
              print(builder);
              //append
              builder.append(" Diancook ");
              print(builder);
              builder.append(" Hallo semua warga Soviet !!");
              print(builder);
              //insert
              builder.insert(21,"Mowsko ");
              print(builder);
              //delete
              builder.delete(21,27);
              print(builder);
              // mengubah satu char di dalam, langsun, delete + insert
            builder.setCharAt(0,'E');
            print(builder);
            builder.replace(34, 40, "Putin");
            print(builder);
            // mengubah StringBuilder  menjadi String
        System.out.println("Ngubah string");
        String stringBiasa = builder.toString();
        System.out.println(stringBiasa);
        int x = System.identityHashCode(stringBiasa);
        System.out.println("adress tai jancok = "+ x);
        System.out.println("adress tai jancok = "+ Integer.toHexString(x));
    }

    public static void print(StringBuilder string) {
        System.out.println("isi string : " + string);
        System.out.println("Kapasitas : " + string.capacity());
        System.out.println("Panjang String : " + string.length());

        int addresBuilder = System.identityHashCode(string);
        System.out.println("Address : " + addresBuilder);
        //concut itu membuat memory baru,

        System.out.println("=".repeat(30)+"\n");
    }
}
