package javafirst;

import java.util.Scanner;

public class Demo {
	public   void securitykey(int data)
	{
		int res= 0;
		int count[] = new int[20];
		while (data > 0) {
			int rem = data % 10;
			count[rem]++;
			data = data /10;
		}
		
		for (int i = 0; i<10; i++)
		{
			if(count[i] > 1) {//== if you want to count unique valus
				res++;
			}
		}		
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Demo de = new Demo();	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number : ");
		int data=in.nextInt();
		de.securitykey(data);
	}

}
//ramakrishna
