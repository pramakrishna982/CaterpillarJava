package javafirst;
import java.util.Scanner;
public class AddingOddDigits {
	public void add() 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter bill amount:");
	int n =sc.nextInt();
	int res = 0,r = 0;
	while(n>0) {
	r=n%10;
	if((r%2)!=0)
	res+=r;
	n=n/10;
	}
	System.out.println("discount amt:"+res);
	}
public static void main(String[] args)
{	
AddingOddDigits ao=new AddingOddDigits();
ao.add();
}

}
