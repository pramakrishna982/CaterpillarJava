package javafirst;
import java.util.Scanner;

	
public class ReverseString {	
	public void compareStringRev(String str)
	{		
	String rev=""; 
	int count=0;
	int no=0;
	for(int i=str.length()-1; i>=0;--i)
	{
	rev += str.charAt(i);
	}
	System.out.println(rev);
	
	for(int j=0;j<str.length();j++)
	{
	if(rev.charAt(j)==str.charAt(j))
	count++;
	}
	System.out.println(count);

	}
	public static void main(String[] args) 
	{
	ReverseString stringrev = new ReverseString();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string to check: ");
	String str = s.next();
	stringrev.compareStringRev(str);	
	}
	}
//ramakrishna
	

