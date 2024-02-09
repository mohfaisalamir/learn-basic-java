import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
/*        int value = 500;

        switch (value){
            case 30 :
                System.out.println("Kebacut");
                break; // untuk menghentikan eksekusi setelah menemukan kodisi yang sesuai
            case 40:
                System.out.println("Niat Opo Ora?");
                break;
            case 50:
                System.out.println("Budal");
                break;
            default:
                System.out.println("Ora Mbejaji babar pisan cok!!");
        }*/
        // make simple calculator

//        System.out.println("Pilih Operator kalkulator");
//        System.out.println("1. Pemjumlahan");
//        System.out.println("2. Pengurangan");
//        System.out.println("3. Pengalian");
//        System.out.println("4. Pembagian");
//        System.out.println("5. Pengkuadratan");
//
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        double result = 0;
//
//
//
//
//        switch (c){
//            case 1 :
//               result = jumlahkan( a,  b);
//                break;
//            case 2:
//               result = kurangkan( a,  b);
//                break;
//            case 3:
//               result = kalikan( a,  b);
//                break;
//            case 4 :
//               result = bagikan( a,  b);
//                break;
//            case 5:
//               result = kuadratkan( a,  b);
//                break;
//            default:
//                System.out.println("Keluar");
//        }
//        System.out.println("Hasil nya adalah ==> 3"+result);
//    }
//    static double jumlahkan(int a, int b){
//        return  a+b;
//
//    }
//    static double kurangkan(int a, int b){
//        return a-b;
//    }
//    static double kalikan(int a, int b){
//        return a*b;
//    }
//    static double bagikan(int a, int b){
//        return a/b;
//    }
//    static double kuadratkan(int a, int b){
//        return a^b;
//    }




        Scanner input = new Scanner(System.in);
        double result = 0;
        boolean inTrue = true;
        do{

            Scanner inpu = new Scanner(System.in);
            System.out.println("Pilih Operator kalkulator");
            System.out.println("1. Pemjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pengalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Pengkuadratan");

            System.out.println("Masukan angka pertama : ");
            double a,b;
            a = inpu.nextDouble();
            System.out.println("Masukan angka kedua : ");
            b = inpu.nextDouble();
            System.out.println("Masukan jenis Operator : ");
            int operatorNumber = inpu.nextInt();


            if (b==0 && operatorNumber==0){
                System.out.println("pembagi tidak boleh = 0 ");
            }else {
                switch (operatorNumber){
                    case 1 :
                        result = a + b;
                        System.out.printf("Hasli penjumlahan antara %f dengan %f adalah %f \n",a,b,result);
                        break;
                    case 2 :
                        result = a - b;
                        System.out.printf("Hasli pengurangan antara %f dengan %f adalah %f \n",a,b,result);
                        break;
                    case 3 :
                        result = a * b;
                        System.out.printf("Hasli perkalian antara %f dengan %f adalah %f \n",a,b,result);
                        break;
                    case 4 :
                        result = a / b;
                        System.out.printf("Hasli pembagian antara %f dengan %f adalah %f \n",a,b,result);
                        break;
                    case 5 :
                        result = Math.pow(a,b);
                        System.out.printf("Hasli penjumlahan presentasi antara %f dengan %f adalah %f \n",a,b,result);
                        break;
                    default:
                        System.out.println("sesaaaa  t");

                }
            }
            System.out.println("apakah anda tertarik untuk mengnghitung lagi ???");
            System.out.println("Jika iya, maka ketik Y, jika tidak amak ke kelompok selanjutnya");
            String choice = inpu.next();
            if (choice.equalsIgnoreCase("y")){
                inTrue = true;
            }else {
                inTrue = false;
            }

        }while (inTrue);
    }
}
