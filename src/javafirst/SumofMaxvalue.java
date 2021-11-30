package javafirst;

public class SumofMaxvalue 
{
public static int sumoftwolements(int[] elements) 
{
	int max = Integer.MIN_VALUE;
	int secondMax = Integer.MAX_VALUE;
	for (int value : elements) 
	{
	  if (value > max) 
		{
		secondMax = max;
		max = value;
	    }
	 else if (value > secondMax && value < max) {
			secondMax = value;
		}
	}
	System.out.println("The First Element is : " + max);
	System.out.println("The Second Element is : " + secondMax);
	int sum = max + secondMax;
	return sum;
	}
 public static void main(String[] args) 
  {
   int[] elements = {3,4,66,22,-100,-200,1 };
   int result = sumoftwolements(elements);
	System.out.println("The Sum of two elements is : " + result);
}
}
