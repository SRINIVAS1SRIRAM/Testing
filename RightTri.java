import java.util.*;
class RightTri{
    public static void main(String arg[]){
        int num, i, j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        num = scan.nextInt();
        for(i=num; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    scan.close();
    }
}