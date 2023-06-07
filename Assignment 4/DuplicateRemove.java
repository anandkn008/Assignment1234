import java.util.Scanner;

public class DuplicateRemove {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String res = removeDuplicates(s);
		System.out.println("Original String: " + s);
	    System.out.println("String after the removal of  duplicates: " + res);
		    }

    public static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
				}
			}
		return sb.toString();
		}
}
	


