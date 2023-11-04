import java.util.Scanner;

public class QuadraticEquation {
    public static void main (String[] arg){
        Scanner input = new Scanner (System.in);
        System.out.print ("Input a: ");
        double a = input.nextDouble();

        System.out.print ("Input b: ");
        double b = input.nextDouble();

        System.out.print ("Input c: ");
        double c = input.nextDouble();
        double x1 = ((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
        double x2 = ((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
        double d = Math.pow(b, 2)-4*a*c;
        if (d>0){
            System.out.printf("The equation has two roots %f and %f", x1, x2);
        } else if (d == 0){
            System.out.printf("The equation has two roots %f", x1);
        } else { System.out.printf("The equation has one root");
                }
            }
        }
