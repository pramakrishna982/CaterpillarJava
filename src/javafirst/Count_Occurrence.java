package javafirst;

import java.util.Scanner;

public class Count_Occurrence
{
public void countOccurrances(int n,int d)

{
	
	int count = 0;
	
	while (n > 0)
	{
	count = (n % 10 == d)?
	count + 1 : count;
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






















/*import java.util.Scanner;

public class RepeatedNumCount {
	public void checkRepeatedNum(int num) {
		int res= 0;
		int count[] = new int[20];
		while (num > 0) {
			int rem = num % 10;
			count[rem]++;
			num = num /10;
		}
		
		for (int i = 0; i<20; i++)
		{
			if(count[i] == 1) {
				res++;
			}
		}		
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedNumCount re = new RepeatedNumCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		re.checkRepeatedNum(num);	
	}

}*/
/*import java.util.Scanner;
                                     
public class Count_Occurrence
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}*/













