public class formatString {
    public static void main(String[] args) {
        // cetak output : nama saya Alosaurus, umur saya 12 juta tahun
        String name = "Allosaurus";
        int umur = 12;
        System.out.println("Nama saya "+ name + " Umur saya "+ umur +" Juta tahun");
        // cara lainnya menggunakan format string
        System.out.printf("Nama saya %s Umur saya %d Juta tahun %%",name,umur);
    }
}
