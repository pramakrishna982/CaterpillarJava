package javafirst;
	import java.io.*;
	import java.lang.*;
	import java.util.*;
	public class DiscountDemo
 {
	public int checkDiscounts(int noc, int[] billamount)
	{
	for(int i=0; i<billamount.length;i++) 
	{
	 float num = (float) Math.sqrt(billamount[i]);
		float check_num = (num*10);
		if((check_num%10)==0)
		{
		System.out.println("The numbers of billamount to avail Discount are : "+billamount[i]);
		}
		}
		return 0;
		}
 
	public static void main (String args[])
	{
	Scanner sc = new Scanner(System.in);
	int da=0;
	System.out.print("Enter the number list to avail Discount offer:");
	da=sc.nextInt();
	int billamount[]= new int[da];
	DiscountDemo ps = new DiscountDemo();
	System.out.println("The bill amounts are: ");
	for(int i=0; i<da; i++)
	{
	billamount[i]=sc.nextInt();
	}
	int result=ps.checkDiscounts(da,billamount);
	System.out.println(result);
	}
	
	}
	//suresh
