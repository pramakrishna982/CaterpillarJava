package javafirst;

import java.util.Scanner;

public class InttoBinary
{
 public static int getBinary(int num)
  {
	int answer=0;
	int cnt=0;
	while(num!=0)
	{
	int rem=num % 2;
	double c=Math.pow(10,cnt);
	answer+=rem*c;
	num/=2;
	cnt++;
	}
	  return answer;
	}
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Take a Number from User:");
	int num = in.nextInt();
	int result = getBinary(num);
	System.out.print(result);
  }
}
//ramya