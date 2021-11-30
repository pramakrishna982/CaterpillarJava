package javafirst;

public class CountConsonantandVowles {

	
	private static void countVowels(String str) {
		// TODO Auto-generated method stub
         int vowelCount = 0;	
		int consonantCount = 0;
		
		for(int i=0; i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				vowelCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println("Vowel count" + vowelCount);
		System.out.println("Consonant count" +consonantCount);
	}

	private static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		
		ch = Character.toUpperCase(ch);
		
		return !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||  ch == 'U');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ramakrishna";
		countVowels(str);
	}

}
