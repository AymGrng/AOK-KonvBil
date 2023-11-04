import java.util.Scanner;

public class FindDaysWeek{
    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int y = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        //Dealing Jan & Feb
        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }

        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String day = "";

        switch (h) {
        
        case 0:
            day = "Saturday";
            break;
        case 1:
            day = "Sunday";
            break;
        case 2:
            day = "Monday";
            break;
        case 3:
            day = "Tuesday";
            break;
        case 4:
            day = "Wednesday";
            break;
        case 5:
            day = "Thursday";
            break;
        case 6:
            day = "Friday";
            break;
          
           }
          
           System.out.print("Day of the week is " + day);
        }
    }