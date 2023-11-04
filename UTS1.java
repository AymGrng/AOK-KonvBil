import java.util.Scanner;

public class UTS1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Barang: ");
        String namaBarang = input.nextLine();

        System.out.println("Berat Barang: ");
        double beratBarang = input.nextDouble()

        System.out.println("Tipe Ekspedisi (Regular/Express/Super): ");
        String tipeEkspedisi = input.nextLine().toLowerCase();

        System.out.println("Tanggal Pengiriman (dd/mm/yyyy): ");
        String tanggalPengiriman = input.nextLine();


        System.out.println("Harga Barang: ");
        double hargaBarang = input.nextDouble();

        if (beratBarang <=0 || beratBarang > 2000){
            System.out.println("Berat tidak sesuai ketentuan!");
        } else {
        if (tipeEkspedisi.equals("regular")||tipeEkspedisi.equals("express")||tipeEkspedisi.equals("super")){

        int penyesuaianWaktu = 0;
        double penyesuaianHarga = 0;

        if (beratBarang > 20) {
            penyesuaianWaktu += 1;
            penyesuaianWaktu += 10000;
        }
        if (beratBarang > 50) {
            penyesuaianWaktu += 3;
            penyesuaianHarga += 20000;
        }
        if (beratBarang > 100){
            penyesuaianWaktu += 5;
            penyesuaianHarga += 30000;
        }
        int estimasi = 5;
        if (tipeEkspedisi.equals("express")){
            estimasi = 3;
        } else if (tipeEkspedisi.equals("super")){
            estimasi = 1;
        }

        System.out.println("\nNama barang: " + namaBarang);
        System.out.println("Tanggal sampai barang: " + );
        System.out.println("Biaya pengiriman: Rp" + String.format("%,.2f", hargaBarang + penyesuaianHarga));
    }

        
    }
    
}
