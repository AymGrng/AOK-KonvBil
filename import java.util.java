import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama barang: ");
        String namaBarang = Scanner.nextLine();

        System.out.println("Masukkan berat barang (kg): ");
        double beratBarang = Scanner.nextDouble();

        Scanner.nextLine();

        System.out.println("Masukkan tipe ekspedisi (Regular/Express/Super): ");
        String tipeEkspedisi = Scanner.nextLine().toLowerCase();

        System.out.println("Masukkan tanggal pengiriman (dd/mm/yyyy): ");
        String tanggalPengiriman = Scanner.nextLine();

        if (beratBarang <= 0 || beratBarang > 2000) {
            System.out.println("Berat tidak sesuai ketentuan!");
        }

        if (!(tipeEkspedisi.equals("regular") || tipeEkspedisi.equals("express") || tipeEkspedisi.equals("super"))) {
            System.out.println("Pilihan ekspedisi tidak valid!");
        }

        if (!tanggalPengiriman.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Format input tanggal tidak sesuai!");
        }

        if (beratBarang > 0 && beratBarang <= 2000 &&
                (tipeEkspedisi.equals("regular") || tipeEkspedisi.equals("express") || tipeEkspedisi.equals("super")) &&
                tanggalPengiriman.matches("\\d{2}/\\d{2}/\\d{4}")) {

            int estimasiHari = 0;
            int biayaPengiriman = 0;

            if (tipeEkspedisi.equals("regular")) {
                estimasiHari = 5;
                biayaPengiriman = 10000;
            } else if (tipeEkspedisi.equals("express")) {
                estimasiHari = 3;
                biayaPengiriman = 20000;
            } else if (tipeEkspedisi.equals("super")) {
                estimasiHari = 1;
                biayaPengiriman = 50000;
            }

            if (beratBarang > 20) {
                estimasiHari += 1;
                biayaPengiriman += 10000;
            }

            if (beratBarang > 50) {
                estimasiHari += 3;
                biayaPengiriman += 20000;
            }

            if (beratBarang > 100) {
                estimasiHari += 5;
                biayaPengiriman += 30000;
            }

            String[] tanggalArray = tanggalPengiriman.split("/");
            int day = Integer.parseInt(tanggalArray[0]);
            int month = Integer.parseInt(tanggalArray[1]);
            int year = Integer.parseInt(tanggalArray[2]);
            for (int i = 0; i < estimasiHari; i++) {
                day++;
                if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                    day = 1;
                    month++;
                } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day > 31) {
                    day = 1;
                    month++;
                } else if (month == 2) {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        if (day > 29) {
                            day = 1;
                            month++;
                        }
                    } else {
                        if (day > 28) {
                            day = 1;
                            month++;
                        }
                    }
                }

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            System.out.println("Nama barang: " + namaBarang);
            System.out.println("Tanggal sampai barang: " + day + "/" + month + "/" + year);
            System.out.println("Biaya pengiriman: Rp " + biayaPengiriman + ",00");
        }
    }
}