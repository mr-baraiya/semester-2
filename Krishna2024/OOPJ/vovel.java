import java.util.Scanner;
public class vovel {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
         System.out.println("enter a string");
         String s=sc.nextLine();
         int v=0;
         int c=0;
         String vowel = "aeiou";
         for(int i=0;i<s.length()-1;i++){
            if(vowel.indexOf(i)==-1){
                c++;                
            }
            else{
                v++;
            }
         }
         System.out.println("vovel="+v);
         System.out.println("consonent="+c);
    }
}
