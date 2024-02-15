import java.util.Scanner;
public class lab3pellindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int temp=a;
        int rem,r=0;
        while (a>0) {
            rem=a%10;
            r=r*10+rem;
            a=a/10;
        }
        if(temp==r){
            System.out.println("number is pellindrom");
        }
        else{
            System.out.println("number is not pellindrom");
        }
    }
}
