import java.util.Scanner;

public class FindDaysMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfDaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print ("Input a month number: ");
        int month = input.nextInt();

        System.out.print ("Input a year: ");
        int year= input.nextInt();

        switch (month){
            case 1:
                MonthOfName = "January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                numberOfDaysInMonth = 28;    
                }
                break;
            case 3:
                MonthOfName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Oktober";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                numberOfDaysInMonth = 31;
                break;
        }
        System.out.print(MonthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
    }
    
}