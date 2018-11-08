class Looping{
    public static void main(String arg[]){
        System.out.println("In the file Looping concept is implemented!");
        System.out.println("For loop");
        int i;
        for(i = 1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("while loop is started");
        while(i>=1){
            System.out.println(i);
            i--;
        }
        System.out.println("Do While loop");
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}