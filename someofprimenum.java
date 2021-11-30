package javafirst;

import java.util.Scanner;

public class someofprimenum {
public int sumofprimevalues(int n)
{
  int number=0,sum=0,count=2;
     Boolean isprime=false;
     while(n>0)   					
     {
      number=n%10;
      if(number==2)
       {
          sum=sum+number;
       }
      for(int i=2;i<number;i++)
       {
         if(number % i!= 0)
          {
            count=count+1;
         if(count==number)
           {
          isprime=true;
           }
	  }
	}
	if(isprime)
	{
	sum=sum+number;
	isprime=false;
	}
	n=n/10;
	count=2;
	}
	return sum;
	}
public static void main(String args[])
{	
Scanner s =new Scanner(System.in);
System.out.println("enter values");
 int n=s.nextInt();
	someofprimenum sp=new someofprimenum();
	int result=sp.sumofprimevalues(n);
	System.out.println(result);
	}
	}

