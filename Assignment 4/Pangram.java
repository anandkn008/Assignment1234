
public class Pangram {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Sentence: " + sentence);
        System.out.println("Is the sentence a pangram? " + isPangram(sentence));
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }

	}
		
		       




