
import java.util.*;

public class _2019jrc2 {
	
	static Scanner in;
	
	static String a, b;
	
	static String output;
	
	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	
	public static void init() {
		in = new Scanner(System.in);
		
		a = in.next();
		b = in.next();
		
		output = "";
	}
	public static void solve() {
		a = delete2ndCons(a);
		b = delete2ndCons(b);
		
		a = deleteVowels(a);
		b = deleteVowels(b);
		
		//
		int min = Math.min(a.length(), b.length());
		for(int i = 0; i < min; i++) {
			if(b.charAt(i) == a.charAt(i)) {
				a = deleteChar(a, i);
				b = deleteChar(b, i);
				i--;
				min--;
			}
		}
		
		
		if(a.length() < b.length()) {
			output = a;
		}else {
			output = b;
		}
		
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static String delete2ndCons(String a) {
		for(int i = 1; i < a.length(); i++) {
			if(a.charAt(i-1) == a.charAt(i)) {
				a = deleteChar(a, i);
				i--;
			}
		}
		return a;
	}
	
	public static String deleteVowels(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				s = deleteChar(s, i);
				i--;
			}
		}
		return s;
	}
	
	
	public static String deleteChar(String s, int i) {
		return s.substring(0, i) + s.substring(i+1, s.length());
	}
	
}
