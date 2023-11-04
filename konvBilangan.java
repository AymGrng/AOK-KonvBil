import java.util.Scanner;

public class konvBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String binary = input.next();
                    int decimal = Integer.parseInt(binary, 2);
                    System.out.println("Hasil konversi ke desimal: " + decimal);
                    break;

                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int decimalInput = input.nextInt();
                    String binaryOutput = Integer.toBinaryString(decimalInput);
                    System.out.println("Hasil konversi ke biner: " + binaryOutput);
                    break;

                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binaryInput = input.next();
                    int decimalValue = Integer.parseInt(binaryInput, 2);
                    String hexOutput = Integer.toHexString(decimalValue).toUpperCase();
                    System.out.println("Hasil konversi ke heksadesimal: " + hexOutput);
                    break;

                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexInput = input.next();
                    String binaryHexOutput = Integer.toBinaryString(Integer.parseInt(hexInput, 16));
                    System.out.println("Hasil konversi ke biner: " + binaryHexOutput);
                    break;

                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int decimalInput2 = input.nextInt();
                    String hexOutput2 = Integer.toHexString(decimalInput2).toUpperCase();
                    System.out.println("Hasil konversi ke heksadesimal: " + hexOutput2);
                    break;

                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexInput2 = input.next();
                    int decimalHexOutput = Integer.parseInt(hexInput2, 16);
                    System.out.println("Hasil konversi ke desimal: " + decimalHexOutput);
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih operasi yang benar.");
            }
        }
    }
}
