package javafirst;

import java.util.Scanner;

public class StringRevers {
	
	public static int unaffectedChar(String dataStream)
	{
		int answer = 0;
		String string1= "alphxxdida";
		int count= 0;
		StringBuffer string2 = new StringBuffer(string1);
		string2 = string2.reverse();
		for(int i=0; i< string1.length(); i++) {
			if(string1.charAt(i)==string2.charAt(i)) {
				count++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string :");
		String dataStream = in.nextLine();
		int result =  unaffectedChar(dataStream);
		System.out.println(result);
	}

}
//ramakrishna