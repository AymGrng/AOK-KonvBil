import java.util.Scanner;

public class nyobaba {
    boolean f = true;{
    while (f) {
        System.out.println("a");
        String  jenisKelamin = new Scanner(System.in).nextLine();
        if (jenisKelamin != "p" && jenisKelamin != "L") {
            f = false;
            System.out.println("Input tidak sesuai");
        } else {
            System.out.println(jenisKelamin);
        }
    }
}
}