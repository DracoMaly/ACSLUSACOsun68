import java.util.*;

public class _1617jrc2 {
	
	static Scanner in;
	
	static String digits;
	static ArrayList<Integer> nums;
	
	static String output;
	
	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	
	public static void init() {
		in = new Scanner(System.in);
		
		digits = in.nextLine();
		
		nums = new ArrayList<Integer>();
		
		output = "";
	}
	
	public static void solve() {
		int prevNum = -1;
		int size = 1;
		int index = 0;
		while(index + size<= digits.length()){
			int num = Integer.parseInt(digits.substring(index, index+size));
			if(num > prevNum) {
				nums.add(num);
				prevNum = num;
				index += size;
			}else {
				size += 1;
			}
			
		}
		
	}
	
	public static void output() {
		
		for(int i: nums) {
			if(output.length() > 0) output += " ";
			output+= i;
		}
		System.out.println(output);
	}
	
	
	
	
	
	
}