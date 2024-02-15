import java.util.Scanner;
public class lab4_3 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            int value=sc.nextInt();
            a[i]=value;
        }
        int sum=0;
        for(int i=0;i<4;i++){
            sum +=a[i];
        }
        double average = sum/(double)4;
        System.out.println(sum);
        System.out.println("average"+average);
    }   
}
