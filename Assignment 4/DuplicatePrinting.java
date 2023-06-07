import java.util.Scanner;

public class DuplicatePrinting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Original String: " + s);
	    System.out.print("Duplicate Characters: ");
	    printDuplicateCharacters(s);
	}
	public static void printDuplicateCharacters(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					isDuplicate = true;
					break;
				}
}
			if (isDuplicate) {
				System.out.print(chars[i] + " ");
				}
			}
		}
	
}


