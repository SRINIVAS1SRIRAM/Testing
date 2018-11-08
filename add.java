import java.util.*;
class add{
    public static void main(String Arg[]){
        int n1,n2,n3 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n1: ");
        n1 = scan.nextInt();
        System.out.println("Enter the value of n2: ");
        n2 = scan.nextInt();
        n3 = n1 + n2;
        System.out.println("The addition of n1 and n2 is: " + n3);
        scan.close();
    }
}