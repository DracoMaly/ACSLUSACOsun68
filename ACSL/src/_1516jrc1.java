/*
526
730
415
234
567

104
772
635
026
527
*/



import java.util.*;

public class _1516jrc1 {
	
	static Scanner in;
	
	static String oNum;
	
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
		oNum = in.nextLine();
		
		output = "";
	}
	
	public static void solve() {
		String oct_bin = Integer.toString(Integer.parseInt(oNum, 8), 2);
		
		if(oct_bin.length() != 9) {
			while(oct_bin.length() != 9) {
				oct_bin = "0" + oct_bin;
			}
		}
		
		String perms = "";
		
		int count = 1;
		for(int i = 0; i < oct_bin.length(); i++) {
			
			if(oct_bin.charAt(i) == '0') {
				perms+="-";
				if(count == 3) {
					count = 1;
				}else {
					count++;
				}
			}else if(count == 1 && oct_bin.charAt(i) == '1') {
				perms+="r";
				count++;
			}else if(count == 2 && oct_bin.charAt(i) == '1') {
				perms+="w";
				count++;
			}else if(count == 3 && oct_bin.charAt(i) == '1') {
				perms+="x";
				count=1;
			}
		}
		
		
		
		output = oct_bin + " and " + perms;
		
	}
	
	public static void output() {
		System.out.println(output);
	}
}
