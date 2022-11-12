import java.util.*;

public class _1920intc1 {
	
	static Scanner in;
	
	static String n;
	static int p;
	
	static String output;
	
	public static void main(String args[]) {
		in = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			init();
			solve();
			output();
		}
	}
	
	public static void init() {
		n = in.next();
		p = in.nextInt();
		
		output = "";
	}
	
	public static void solve() {
		String a = n.substring(0, n.length()-p);
		String b = n.substring(n.length() - p+1);
		int pDigit = n.charAt(p) - '0';
		
		//for loop through a
		//replace each digit with the sum of that digit and the digit p
		
		for(int i = 0; i < a.length(); i++) {
			int aDigit = a.charAt(i) - '0';
			aDigit += pDigit;
			aDigit %= 10;
			a = a.substring(0, i) + aDigit + a.substring(i+1);
		}
		
		for(int i = 0; i < b.length(); i++) {
			int bDigit = b.charAt(i) - '0';
			bDigit = Math.abs(bDigit - pDigit);
			b = b.substring(0, i) + bDigit + b.substring(i+1);
		}
		
		output = a + pDigit + b;
	}
	
	public static void output() {
		System.out.println(output);
	}
}
