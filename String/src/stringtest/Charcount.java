package stringtest;

public class Charcount {
	public static void main(String[] args) {
		int wordCount = 0;
		String word = "vijay dinanath chouhan";
		for (char letter = 'a'; letter <= 'z'; letter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					wordCount++;
				}
			}
			if (wordCount > 0) {
				System.out.println(letter + "=" + wordCount);
				wordCount = 0;

			}
		}
	}
}
	
		
