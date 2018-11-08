import java.util.*;
class SwitchCondition{
    public static void main(String arg[]){
        String ans;
        int num , num1 , num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter \"Square\" or \"addition\" ");
        ans = scan.next();
        switch(ans){
            case "square":
            System.out.println("Enter a number to find the square!");
            num = scan.nextInt();
            num *= num;
            System.out.println("The square of th number is: " + num);
            break;
            case "addition":
            System.out.println("Enter number1");
            num = scan.nextInt();
            System.out.println("Enter number2");
            num1 = scan.nextInt();
            num2 = num + num1;
            System.out.println("The addition of two numbers is: " + num2);
            break;
            default:
            System.out.println("wrong method");
            break;
        }

        scan.close();
    }
}