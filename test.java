import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai teori: ");
        int teori = input.nextInt();
        System.out.println("Masukan nilai praktik: ");
        int praktik = input.nextInt();
        System.out.println("Masukan nilai kerjasama tim: ");
        int kerjasama = input.nextInt();

        double nilai_akhir = (teori*0.4) + (praktik*0.4) + (kerjasama*0.2);

        String hurufMutu;
        double angkaMutu;
        String predikat;
        
        if (nilai_akhir > 80) {
            hurufMutu = "A";
            angkaMutu = 4.0;
            predikat = "Sangat Baik";
        } else if (nilai_akhir > 75) {
            hurufMutu = "B+";
            angkaMutu = 3.5;
            predikat = "Lebih Baik";
        } else if (nilai_akhir > 69) {
            hurufMutu = "B";
            angkaMutu = 3.0;
            predikat = "Baik";
        } else if (nilai_akhir > 60) {
            hurufMutu = "C+";
            angkaMutu = 2.5;
            predikat = "Lebih dari Cukup";
        } else if (nilai_akhir > 55) {
            hurufMutu = "C";
            angkaMutu = 2.0;
            predikat = "Cukup";
        } else if (nilai_akhir > 50) {
            hurufMutu = "D+";
            angkaMutu = 1.5;
            predikat = "Lebih dari Kurang";
        } else if (nilai_akhir > 44) {
            hurufMutu = "D";
            angkaMutu = 1.0;
            predikat = "Kurang";
        } else {
            hurufMutu = "E";
            angkaMutu = 0.0;
            predikat = "Gagal";
        }

        System.out.printf("%s | %.1f | %s%n", hurufMutu, angkaMutu, predikat);
    }
}
