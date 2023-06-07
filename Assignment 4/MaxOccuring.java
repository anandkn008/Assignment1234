import java.util.Scanner;

public class MaxOccuring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the string");
		String input =sc.nextLine();
		System.out.println("Input String: " + input);
	    System.out.println("Maximum occurring character: " + findMaxOccurringCharacter(input));
	    }

	    public static char findMaxOccurringCharacter(String str) {
	        int[] count = new int[128];

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            count[ch]++;
	        }

	        char maxChar = ' ';
	        int maxCount = 0;

	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > maxCount) {
	                maxChar = (char) i;
	                maxCount = count[i];
	            }
	        }

	        return maxChar;
	    }
	}
		
		       
		



