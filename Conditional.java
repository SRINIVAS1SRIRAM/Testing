import java.util.*;
class Conditional{
    public static void main(String arg[]){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year: ");
        year = scanner.nextInt();
        if (year%100 == 0){
            if (year%400 == 0){
                System.out.println("It is a leap year");
                        }
            else{
                System.out.println("It is not a leap year");
                        }
            }
        else if (year%4 == 0){
            System.out.println("It is a leap year");
                }
         else {
             System.out.println("It is not a leap year");
                }
        scanner.close();
            }
    }
