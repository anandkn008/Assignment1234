import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Are the strings anagrams? " + isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
		
		        
		



