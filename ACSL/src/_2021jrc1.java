import java.util.*;

public class _2021jrc1 {
	
	static Scanner in;
	
	static int s, d, r;
	
	static int output;
	
	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	
	public static void init() {
		in = new Scanner(System.in);
		
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
