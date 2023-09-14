/*
* This is a program that tells prints out the number of days in the month from the Months in the Year and
* also indicates if it is leap year or not. */
import static java.lang.System.out;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Name a Month");
        String Month = keyboard.next();




        int daysInTheMonth = 0;

        switch  (Month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                daysInTheMonth = 31;
                break;
            case "September":
            case "April":
            case "June":
            case "November":
                daysInTheMonth = 30;
                break;
            case "February":
                out.print("Is it leap year? yes/no");
                String LeapYear = keyboard.next();


                if(LeapYear.equals("yes")){
                    out.println ("it is a leap year :)");
                    daysInTheMonth = 29;
                }
                    else if(LeapYear.equals("no")){
                        out.println ("it is not a leap year :(");
                        daysInTheMonth = 28;
                    }
                    else{
                        out.print("Invalid input");
                }
                    break;
            default:
                out.println("Invalid Month Name ");

        }
        System.out.println("Number of days in " + Month + " is: " + daysInTheMonth);

        keyboard.close();



    }
}
