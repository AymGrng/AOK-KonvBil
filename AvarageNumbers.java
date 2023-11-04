import java.util.Scanner;

public class AvarageNumbers {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //Membaca data awal
        System.out.print("Enter an integer, the input ends if it is 0:  ");
        int number = input.nextInt();

        if (number == 0){
            System.out.println("No numbers are entered except 0");
        } else {
            int sum, countNegative, countPositive;
            sum = countNegative = countPositive = 0;
            do{
                sum += number;
                if (number > 0){
                    countPositive++;
                }else {
                    countNegative++;
                }
                number = input.nextInt();
            } while (number != 0 );

            System.out.printf("The number of positives is %d\n"
            + "The number of negatives is %d\n"
            + "The total is %d\n"
            + "The average is %f\n", countPositive, countNegative, sum, (double) sum / (countPositive + countNegative));
        }
    
    }

} 
