import java.util.*;

public class _1819intc1 {
	
	static Scanner in;
	
	static String num;
	static int dp;//digit place
	
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
		num = in.next();
		dp = in.nextInt();
		
		output = "";
	}
	
	public static void solve() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0; i < num.length()-dp; i+=dp) {
			//nums.add(Long.parseLong(num.substring(i, i+dp)));
		}
		
		int sum = 0;
		for(int i = 0; i < nums.size(); i++) {
			sum+= nums.get(i);
		}
		
		output = "" + sum;
	}
	
	public static void output() {
		System.out.println(output);
	}
	
}
