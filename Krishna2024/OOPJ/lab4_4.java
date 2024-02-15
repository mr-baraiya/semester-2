import java.util.Scanner;
public class lab4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int a[]=new int[4];
     for(int i=0;i<4;i++){
         int value=sc.nextInt();
         a[i]=value;
     }
     System.out.println("array in reverse order:");
     for(i=3;i>=0;i--){
        System.out.println(a[i]+ " ");
     }
    
}
