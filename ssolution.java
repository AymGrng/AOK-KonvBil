import java.util.Scanner;

public class ssolution {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        String kalimat = input.nextLine();
        
        if(kalimat.length()>50){
            kalimat = kalimat.replaceAll("enggak bisa", "gb");
            kalimat = kalimat.replaceAll("yang", "yg");
            kalimat = kalimat.replaceAll("enggak", "g");
            kalimat = kalimat.replaceAll("bisa","bs");
        }

            System.out.println(kalimat);
    }
}
