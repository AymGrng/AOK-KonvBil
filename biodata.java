import java.util.Scanner;

public class biodata {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);

        String nama = scn.nextLine();
        int tahunLahir = scn.nextInt();
        scn.nextLine();
        String jenisKelamin = scn.nextLine();
        double tinggiBadan = scn.nextDouble();

        //Menghitung Umur
        int umur = 2023 - tahunLahir;

        //Output jenis kelamin
        if (jenisKelamin.equalsIgnoreCase("Pria")){
            double beratBadanIdeal = (tinggiBadan - 100) - ((tinggiBadan - 100) / 10);
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.printf("Berat Badan Ideal: " + beratBadanIdeal + " Kg");
        } else if (jenisKelamin.equalsIgnoreCase("Wanita")){
              double beratBadanIdeal = (tinggiBadan - 100) - ((tinggiBadan - 104) / 10);
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.printf("Berat Badan Ideal: " + beratBadanIdeal + " Kg");
        } else {
            System.out.println("Input data Jenis Kelamin tidak sesuai.");
        }
        
         
        }
    }
