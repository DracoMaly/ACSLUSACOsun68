import java.util.*;

public class _1819jrc2 {
	
	static Scanner in;
	
	static String sentence;
	
	static int diffLetters;
	static int Nvowels;
	static int Nupper;
	static int NmaxLetter;
	static String largestWord;
	
	public static void main(String[] args) {
		in = new Scanner(System.in); 
		for(int i = 0; i < 5; i++) {
			init();
			solve();
			output();
		}
	}
	
	public static void init() {
		
		sentence = in.nextLine();
	}
	
	public static void solve() {
		String Lsentence = sentence.toLowerCase();
		for(int i = 0; i < sentence.length(); i++) {
			if(!sameLetter(Lsentence, Lsentence.charAt(i), i) && Character.isLetter(Lsentence.charAt(i))) {
				diffLetters++;
			}
		}
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
				Nvowels++;
			}
		}
		for(int i = 0; i < sentence.length(); i++) {
			if(Character.isUpperCase(sentence.charAt(i))) {
				Nupper++;
			}
		}
		
		int[] letters = new int[26];
		
		
		for(int i = 0; i < sentence.length(); i++) {
			if(Character.isLetter(sentence.charAt(i))) {
				letters[Lsentence.charAt(i) - 'a']++;
			}
		}
		NmaxLetter = 0;
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] > NmaxLetter) {
				NmaxLetter = letters[i];
			}
		}
		
		StringTokenizer st = new StringTokenizer(sentence, ". ,");
		while(st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			String LNT = nextToken.toLowerCase();
			if(largestWord == null || LNT.length() > largestWord.length()) {
				largestWord = nextToken;
			}else if(largestWord.length() == nextToken.length() && largestWord.compareTo(nextToken)  < 0) {
				largestWord = nextToken;
			}
		}
		
	}
	
	public static void output() {
		System.out.println(diffLetters);
		System.out.println(Nvowels);
		System.out.println(Nupper);
		System.out.println(NmaxLetter);
		System.out.println(largestWord);
	}
	
	public static boolean sameLetter(String str, char letter, int end) {
		for(int i = 0; i < end; i++) {
			if(str.charAt(i) == letter) {
				return true;
			}
		}
		return false;
	}
	
	
}
