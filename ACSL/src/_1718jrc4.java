/*
2 Computer
2 COMPUTER bat
3 COMPUTER
4 ACSL is fun
9 the xylophone
 
 
 
 */


import java.util.*;

public class _1718jrc4 {
	
	static Scanner in;
	
	static ArrayList<Character> sorted;
	static int N;
	static String str;
	
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
		sorted = new ArrayList<Character>();
		
		N = in.nextInt()-1;
		str = in.nextLine().toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			
			if(!Character.isAlphabetic(str.charAt(i))) {
				str = str.substring(0, i) + str.substring(i+1);
				i--;
			}
		}
		
		output = "";
	}
	
	public static void solve() {
		int check = 0;
		char prevChar = 0;
		
		for(int i = 0; i < str.length(); i++) {
			//place into sorted
			int insPos = 0;
			while(insPos < sorted.size() && str.charAt(i) > sorted.get(insPos)) {
				insPos++;
			}
			
			sorted.add(insPos, str.charAt(i));
			
			if(N < sorted.size() && sorted.get(N) != prevChar) {
				check++;
				prevChar = sorted.get(N);
			}
		}
		
		output += check;
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	
}
