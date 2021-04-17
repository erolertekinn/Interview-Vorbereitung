
public class _05_PalindromeStringBuilder {
	public static void main(String[] args) {
		String str = "nokon";
		System.out.println(isPalindrome(str));
		
	}

	public static boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}

		StringBuilder strB = new StringBuilder(str);
		return strB.reverse().toString().equals(str);
	}
}
