import java.util.*;

public class _1718jrc2 {
	
	static Scanner in;
	
	static String equation;
	
	static ArrayList<Integer> output;
	
	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	
	public static void init() {
		in = new Scanner(System.in);
		
		equation = in.nextLine();
		
		output = new ArrayList<Integer>();
	}
	
	public static void solve() {
		int index = 0;
		for(int i = 0; i < equation.length(); i++) {
			if(equation.charAt(i) == '(') {
				solveEquation(equation, i+1, true);
			}else if(equation.charAt(i) == ')') {
				solveEquation(equation, i+1, false);
			}
		}
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static void solveEquation(String equation, int start, boolean GoR) {
		int looped = 0;
		while(GoR && start < equation.length()) {
			if(looped == 0) {
				start+=4;
			}else {
				start+=2;
			}
			looped++;
			output.add(start);
		}
		
		while(!GoR && start > 0) {
			if(looped == 0) {
				start-=3;
			}else if(start >= 2){
				start-=2;
			}else {
				break;
			}
			looped++;
			output.add(start);
		}
		Collections.sort(output);
	}
}
