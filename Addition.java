import java.util.Scanner;
public class Addition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the sacond number:");
        int b=sc.nextInt();
        int ans=a+b;
        System.out.println("sum = "+(a+b));
    }
    
}
