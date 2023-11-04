import java.util.Scanner;

public class hurufVokal {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = scanner.nextLine();

        int az = 0;
        int iz = 0;
        int uz = 0;
        int ez = 0;
        int oz = 0;

        for (int i = 0; i < teks.length(); i++) {
            char huruf = Character.toLowerCase(teks.charAt(i));

            if (huruf == 'a') {
                az++;
            } else if (huruf == 'i') {
                iz++;
            } else if (huruf == 'u') {
                uz++;
            } else if (huruf == 'e') {
                ez++;
            } else if (huruf == 'o') {
                oz++;
            }
        }

        System.out.println("Jumlah 'a' dalam input: " + az);
        System.out.println("Jumlah 'i' dalam input: " + iz);
        System.out.println("Jumlah 'u' dalam input: " + uz);
        System.out.println("Jumlah 'e' dalam input: " + ez);
        System.out.println("Jumlah 'o' dalam input: " + oz);

        
    }
}
