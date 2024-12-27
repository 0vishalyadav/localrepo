import java.util.Scanner;
public  class inputuser{
    public static void main(String[] args) {
       System.out.println("hello world");
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number");
       int num1 =sc.nextInt(); 
       while (num1<5) {
        System.out.println("hello world");
        num1++;
        
       }



    }
}