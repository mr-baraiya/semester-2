import java.util.Scanner;
public class LinearSearchDemo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] temp = {1,4,2,5,6,3,9,8,7,0};
        boolean flag = false;
        System.out.println("Enter the search Numbner : ");
        int number = sc.nextInt();
        for(int i = 0 ; i < temp.length ; i++){
            if ( temp[i] == number) {
                System.out.println("Found At = "+i);
                flag =true;
                break;
            }
        }
        if(!flag){
            System.out.println("The Number Was not Found in array.");
        }
    }
}