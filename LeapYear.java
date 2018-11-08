import java.util.*;
class LeapYear{
    public static void main(String arg[]){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year to find Leap or Not");
        year = scan.nextInt();
        if (year%4 == 0) {
            if(year%100 != 0){
                System.out.println(year + " is a leap year");
            }
            else if (year%400 == 0){
                System.out.println(year + " is a leap year");
            }
            else{
                System.out.println(year + " is not a leap year");
            }
            }
        else{
            System.out.println(year + " is not a leap year");
        }
        scan.close();
        }

    }
