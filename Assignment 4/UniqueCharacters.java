import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the string");
		String input =sc.nextLine();
		System.out.println("Input String: " + input);
	    System.out.println("Does the string contain all unique characters? " + hasUniqueCharacters(input));
	    }

	    public static boolean hasUniqueCharacters(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (str.indexOf(ch, i + 1) != -1) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
		
		       
		

	


