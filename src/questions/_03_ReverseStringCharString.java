package questions;

public class _03_ReverseStringCharString {
	public static void main(String[] args) {
		String str = "Interview Prep";
		
		char [] ch = new char [str.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=str.charAt(i);
		}
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.print(ch[i]);
			
		}
		
	}
}
