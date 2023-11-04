import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        int [][] a = {{1,2,3,4}, {4,5,6,4}, {7,8,9,4}};

        System.out.println(Arrays.deepToString(a));

        System.out.println("\n" + a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j< a[i].length; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");
            }
        }
    }