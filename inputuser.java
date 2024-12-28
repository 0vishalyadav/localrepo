import java.util.Scanner;
public  class inputuser{
    public static void main(String[] args) {
       System.out.println("hello world");
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number");
       int coutdown =sc.nextInt(); 
       while (coutdown>0) {
        System.out.println(""+coutdown);
        coutdown--;
        
       }



    }
}