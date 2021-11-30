package javafirst;

import java.util.Scanner;

public class BinarytoDecimal {
	public static int Decimal(int binary){
		int decimal= 0;
		int power = 0;
		while(true) {
		if (binary == 0)
		{
		break;				
		}
		else
		{
		int temp = binary%10;
		decimal += temp*Math.pow(2,power);
		binary = binary/10;
		power++;	
		}
	}
		return decimal;
	}
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Binary Number:");
	    int binary = sc.nextInt();
		int result = Decimal(binary);
		System.out.print(result);
	}
	
}
//suresh

