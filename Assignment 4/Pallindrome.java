
public class Pallindrome {

	public static void main(String[] args) {
		String input = "2552";
        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

	
		        
		
		        