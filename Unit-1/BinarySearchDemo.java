import java.util.Scanner;
public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int temp [] = {0,1,2,3,4,5,6,7,8,9};
        int n,high,low;
        low = 0;
        high = temp.length-1;
        boolean flag = false;
        System.out.println("enter a search number : ");
        n = sc.nextInt();

        while(high >= low){
            int mid = (high+low)/2;
            if(n < mid){
                high = mid-1;
            }
            else if(n == mid){
                System.out.println("Found At :"+ mid);
                flag = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        if(!flag){
            System.out.println("Number is Not Exist in array.");
        }
    }
}
