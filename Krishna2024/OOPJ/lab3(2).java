import java.util.Scanner;
public class lab3(2) {
    public static void main(String[] args){
          Scanner sc=(system.in);
          System.out.println("Enter the Marks of 5 Students");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int d=sc.nextInt();
          int e=sc.nextInt();
          int sum=a+b+c+d+e;
          float per=(a+b+c+d+e)/5;
          if(per<=40){
            System.out.println("fail");
          }
          else if(per>=49){
            System.out.println("Third division");
          }
          else if(per>=59){
            System.out.println("secound division");
          }
          else{
            System.out.println("first division");
          }
    }
}
