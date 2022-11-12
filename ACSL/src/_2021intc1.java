/*
4567 7 65
3141 5 26
765 43 21
704 1776 20
77 7 100
 */


import java.util.*;

public class _2021intc1 {
	static Scanner in;
	
	static int s,d,r;
	
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
		s = OtoD(in.next());
		d = OtoD(in.next());
		r = in.nextInt();
		output = "";
	}
	
	public static void solve() {
		int x = r*(r-1) / 2;
		int num = s;
		for(int i = 0; i <x;i++) num += d;
		
		String digits = "";
		for(int i = 0; i < r; i++) {
			digits += DtoO(num);
			num += d;
		}
		
		int sumOfDigits = 0;
		for(int i = 0; i < digits.length(); i++) {
			sumOfDigits += digits.charAt(i) - '0';
		}
		output += sumOfDigits;
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static int OtoD(String oct) {
		int sum = 0;
		int place = 1;
		for(int i = oct.length()-1; i >= 0; i--) {
			int digit = oct.charAt(i) - '0';
			sum += digit * place;
			place *= 8;
		}
		return sum;
	}
	
	public static String DtoO(int n) {
		String out = "";
		while(n > 0) {
			int digit = n%8;
			out = digit + out;
			n /= 8;
		}
		return out;
	}
}
