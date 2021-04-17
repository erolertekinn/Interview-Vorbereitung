package cybertek;

public class _03_Reverse {
	public static void main(String[] args) {
		String str = "I am a codder";
		String reverse = "";
		
		for (int i = str.length()-1; i >=0 ; i--) {
			reverse += str.charAt(i);
			
		}
		System.out.println("Str1 = "+str);
		System.out.println("StrReverse = "+reverse);
	}

}
