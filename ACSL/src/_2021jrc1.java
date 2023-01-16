/*
599 23 43
4326 1234 80
704 1776 200
6283 185 31
3141 59 26
 */

import java.util.*;

public class _2021jrc1 {
	
	static Scanner in;
	
	static int s, d, r;
	
	static int output;
	
	/*
	 599 23 43
	 4326 1234 80
	 704 1776 200
	 6283 185 31
	 3141 59 26
	 */
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			init();
			solve();
			output();
		}
	}
	
	public static void init() {
		
		s = in.nextInt();
		d = in.nextInt();
		r = in.nextInt();
		
		output = 0;
	}
	
	public static void solve() {
		int sequenceSize = r * (r-1)/2; 
		
		int num = transform(s);
		int delta = d; 
		for(int i = 1; i < sequenceSize; i++) {
			num += delta;
			num = transform(num); 
		}
		int row = r;
		
		for(int i = 0; i < row; i++) {
			num += delta;
			num = transform(num); 
			output += num;
		}
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static int transform(int a) {
		while(a > 9) {
			int sum = 0;
			while(a > 0) {
				sum += a % 10;
				a /= 10;
			}
			a = sum;
		}
		return a;
	}
}
