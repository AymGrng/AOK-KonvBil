import java.util.Scanner;

public class HitungVolume {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        boolean pilihan = true;
       

        while (pilihan) {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA : ");
             int start = input.nextInt();

            switch (start) {
                case 0:
                System.out.println ("Keluar dari program");
                pilihan = false;
                break;

                case 1:
                System.out.println("Hitung Volume Balok");
                System.out.println ("Masukan panjang balok: ");
                double panjang = input.nextDouble();
                System.out.println("Masukkan lebar balok: ");
                double lebar = input.nextDouble();
                System.out.println("Masukkan tinggi balok: ");
                double tinggi = input.nextDouble();
                double volume = panjang*lebar*tinggi;
                System.out.println("Volume balok adalah:" + volume);
                break;

                case 2:
                System.out.println("Hitung Volume Bola");
                System.out.println("Masukkan jari-jari bola");
                double jariJari= input.nextDouble();
                double volumeJ = (4.0/3.0)*(22.0/7.0)*jariJari*jariJari*jariJari;
                System.out.println("Volume bola adalah: " + volumeJ);
                break;

                case 3:
                System.out.println("Hitung Volume Kerucut");
                System.out.println("Masukkan jari-jari alas kerucut: ");
                double jariAlas = input.nextDouble();
                System.out.println("Masukkan tinggi kerucut: ");
                double tinggiK = input.nextDouble();
                double volumeK = (1.0/3.0) * (22.0/7.0) * jariAlas * jariAlas * tinggiK;
                System.out.println("Volume kerucut adalah: " + volumeK);
                break;

                case 4:
                System.out.println("Hitung Volume Silinder");
                System.out.println("Masukkan jari-jari alas silinder: ");
                double jAlas = input.nextDouble();
                System.out.println("Masukkan tingi silinder: ");
                double tinggiS = input.nextDouble();
                double volumeS = (22.0/7.0) * jAlas * jAlas * tinggiS;
                System.out.println("Volume silinder adalah:" + volumeS);
                break;

                case 5:
                System.out.println("Hitung Volume Limas Segitiga");
                System.out.println("Masukan alas segitiga");
                double aSegitiga = input.nextDouble();
                System.out.println("Masukkan tinggi segitiga: ");
                double tSegitiga = input.nextDouble();
                System.out.println("Masukkan tinggi limas");
                double tLimas = input.nextDouble();
                double lAlas = (aSegitiga * tSegitiga) / 2.0;
                double volumeLS = (1.0/3.0) * lAlas * tLimas;
                System.out.println("Volume limas segitiga adalah " + volumeLS);
                break;

                default:
                System.out.println("Masukan angka 1-5");


            }
        }

    }

}