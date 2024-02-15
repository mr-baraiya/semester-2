import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Enter (+,-,*,/,%):");
        char c = sc.next();
        switch (sc) {
            case "+":
                sum = a+b;
                break;
             case"-":
                sum = a-b;
                break;
             case "*":
                sum = a*b;
                break;
              case "/":
                sum = a/b;
                break;
             case "%":
                sum = a%b;
                break;
        
            default:
                break;
        }
        System.out.println(sum);
    }
}
