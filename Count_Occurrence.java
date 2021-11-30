package javafirst;

import java.util.Scanner;

public class Count_Occurrence
{
public void countOccurrances(int n,int d)

{
int count = 0;	
while (n > 0)
{
count = (n % 10 == d)? count++ : count;
n = n / 10;
}
System.out.println(count);
}

public static void main(String args[])

{
Count_Occurrence cc = new Count_Occurrence();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int n= sc.nextInt();
System.out.println("Enter the digit ");
int d=sc.nextInt();
cc.countOccurrances(n, d);
}
}
