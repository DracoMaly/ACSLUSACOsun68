import java.util.*;

public class _1920jrc2v2 {
	
	static Scanner in;
	
	static String str, stri;
	
	static String output;
	
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			init();
			solve();
			output();
		}
	}
	
	public static void init() {
		str = in.next();
		stri = in.next();
		
		output = "";
	}
	
	public static void solve() {
		String strv = str;
		String striv = stri;
		
		//Remove double consonants
		for(int i = 1; i < strv.length(); i++) {
			if(strv.charAt(i) == strv.charAt(i-1)) {
				strv = strv.substring(0,i) + strv.substring(i+1);
				i--;
			}
		}
		for(int i = 1; i < striv.length(); i++) {
			if(striv.charAt(i) == striv.charAt(i-1)) {
				striv = striv.substring(0,i) + striv.substring(i+1);
				i--;
			}
		}
		
		//remove vowels
		for(int i = 1; i < strv.length(); i++) {
			if(strv.charAt(i) == 'A' || strv.charAt(i) == 'E' || strv.charAt(i) == 'I' || strv.charAt(i) == 'O' || strv.charAt(i) == 'U') {
				strv = strv.substring(0,i) + strv.substring(i+1);
				i--;
			}
		}
		for(int i = 1; i < striv.length(); i++) {
			if(striv.charAt(i) == 'A' || striv.charAt(i) == 'E' || striv.charAt(i) == 'I' || striv.charAt(i) == 'O' || striv.charAt(i) == 'U') {
				striv = striv.substring(0,i) + striv.substring(i+1);
				i--;
			}
		}
		
		int min = 0;
		if(strv.length() < striv.length()) {
			min = strv.length();
		}else {
			min = striv.length();
		}
		
		//delete like characters left to right
		for(int i = 0; i < min; i++) {
			if(strv.charAt(i) == striv.charAt(i)) {
				//how to remove character from string without bothering index bounds
			}
		}
		
		
		int max = 0;
		if(strv.length() < striv.length()) {
			min = strv.length();
			max = striv.length();
		}else {
			min = striv.length();
			max = strv.length();
		}
		//delete like characters from right to left
		for(int i = 0; i < min; i++) {
			if(strv.charAt(i) == striv.charAt(i)) {
				//how to remove character from string without bothering index bounds
			}
		}
		
		output = strv + "\n" + striv;
	}
	
	public static void output() {
		System.out.println(output);
	}
}
