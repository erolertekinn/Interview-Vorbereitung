package questions;

public class _06_PalindromeWithCharAt {
	public static void main(String[] args) {
		String str = "abcba";
		System.out.println("Palindrome mu? \n"+isPalindrome(str));
		
	}

	public static boolean isPalindrome(String str) {
		int head = 0;
		int tail = str.length() - 1;

		while (head < tail) {
			if (str.charAt(head) != str.charAt(tail)) {
				return false;
			}
			head++;
			tail--;
		}
		return true;

	}

}
