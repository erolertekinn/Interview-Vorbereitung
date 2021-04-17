public class _01_ReverseStringForLoop {

	public static void main(String[] args) {
		String rvr = "";
		String str = "Interview Prep";
		//System.out.println(str.length());

		for (int i = str.length()-1; i >= 0 ; i--) {
			rvr = rvr + str.charAt(i);	
		}
		System.out.println(rvr);
	}

}
