package javafirst;

public class FindfixedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1= "alphxxdida";//adidxxhpla
		int count= 0;
		
		StringBuffer string2 = new StringBuffer(string1);
		
		string2 = string2.reverse();
		
		for(int i=0; i< string1.length(); i++) 
		{
			if(string1.charAt(i)==string2.charAt(i))
			{
				count++;
			}
		}
       System.out.println("Total fixed Characters in string : "+count);
	}

}
