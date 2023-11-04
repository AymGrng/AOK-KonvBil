import java.util.Scanner;

public class Bintang {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai n =");
        int n = input.nextInt ();
        
        for (int i=1; i <=n; i++)//baris 
        {
        for (int j=1; j<=i; j++)//bintang
        {
            System.out.print ("* ");
        }
        System.out.println();
       }
    }
}
