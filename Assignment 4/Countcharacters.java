import java.util.Scanner;

public class Countcharacters {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		System.out.println("Input String: " + input);
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int specials = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specials++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specials);
    }


}

		
	   
	        

