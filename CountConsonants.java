package javafirst;

import java.util.Scanner;

public  class CountConsonants{
		// TODO Auto-generated method stub
		static boolean isConsonant(char ch)
		{
			ch = Character.toUpperCase(ch);
			return !(ch == 'A' || ch == 'E' ||
	                ch == 'I' || ch == 'O' ||
	                ch == 'U') && ch >= 65 && ch <= 90;
}
		static int totalConsonants(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	      
	            // To check is character is Consonant
	            if (isConsonant(str.charAt(i)))
	                ++count;
	        return count;
	    }
public static void main(String args[])
{
   String ch = "RAMAKRISHNA";
   String str = "aeiou";
   System.out.println("Consonant of the String : "+ CountConsonants.totalConsonants(ch));
   System.out.println("Consonant of the String  "+ CountConsonants.totalConsonants(str));
}
}

