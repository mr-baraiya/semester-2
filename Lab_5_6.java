// WAP that counts the number of objects created using static.

import java.util.Scanner;

class Counter{
	static int count;
	Counter(){
		count++;
	}
}

public class Lab_5_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many objects to be created : ");
		int n = sc.nextInt();
		Counter c[] = new Counter[n];
		for(int i=0;i<n;i++)
		{
			 c[i] = new Counter();
		}

		System.out.println("Total objects created = "+c[n-1].count);
		sc.close();
	}
}
