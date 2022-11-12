import java.util.*;

public class _1617jrc4 {
	
	
	static ArrayList<String> permutations;
	
	static Scanner in;
	static Clue c;
	
	static String output;
	
	public static void main(String[] args) {
		permutations = new ArrayList<String>();
		for(int  i = 1; i <= 5; i++) {
			for(int  j = 1; j <= 5; j++) {
				if(i == j) continue;
				for(int  k = 1; k <= 5; k++) {
					if(k == i || k == j) continue;
					for(int  l = 1; l <= 5; l++) {
						if(l == i || l == j || l == k) continue;
						for(int  m = 1; m <= 5; m++) {
							if(m != i || m != j || m != k || m != l) {
								String num = ""+i+j+k+l+m;
								permutations.add(num);
							}
						}
					}
				}
			}
		}
		in = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			init();
			solve();
			output();
		}
	}
	
	public static void init() {
		String line = in.nextLine();
		int lc = line.charAt(0) - '0';
		int rc = line.charAt(3) - '0';
		c = new Clue(lc, rc);
		
		output = "";
	}
	
	public static void solve() {
		int count = 0;
		for(int i = 0; i < permutations.size(); i++) {
			Clue pC = generateClue(permutations.get(i));
			if(c.equals(pC)) {
				count++;
			}
		}
		output+= count;
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static Clue generateClue(String num) {
		int lc = 0;
		int max = 0;
		for(int i = 0; i < num.length(); i++) {
			if(num.charAt(i) > max) {
				max = num.charAt(i);
				lc++;
			}
		}
		
		int rc = 0;
		max = 0;
		for(int i = num.length()-1; i>=0;i--) {
			if(num.charAt(i) > max) {
				max = num.charAt(i);
				rc++;
			}
		}
		return new Clue(lc, rc);
	}
}

class Clue{
	int leftNum, rightNum;
	public Clue(int leftNum, int rightNum) {
		this.leftNum = leftNum;
		this.rightNum = rightNum;
	}
	
	public boolean equals(Clue c) {
		return this.leftNum == c.leftNum && this.rightNum == c.rightNum;
	}
}
