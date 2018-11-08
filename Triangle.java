import java.util.Scanner;

class Triangle{
    public static void main(String arg[]){
        int num, space, i, j, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        num = scan.nextInt();
        int count=num-1;
        for(i=1; i<=num; i++){
            for(space=1; space<=count; space++){
                System.out.print(" ");
            } 
            count--;           
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            for(k=i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
            }
        scan.close();
    }
}