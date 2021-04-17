package cybertek;

public class _01_UniqueChars {
	public static void main(String[] args) {
		char a = 'p';
		String b = "s";
		
		String str1 = "erol ertekin";
		String str2 = "";
		
		for (int i = 0; i < str1.length(); i++) {
			if(!str2.contains(String.valueOf(str1.charAt(i)))) {
				str2 = str2 + str1.charAt(i);
			}
			
		}
		System.out.println("Str1:"+str1);
		System.out.println("Str2:"+str2);
		
	}

}
