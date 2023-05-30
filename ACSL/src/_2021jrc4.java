import java.util.*;

public class _2021jrc4 {
	
	static Scanner in;
	
	static int[][] matrix;
	static int chara;
	
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
		
		String line = in.nextLine();
		
		matrix = new int[10][10];
		
		StringTokenizer bobFrankST = new StringTokenizer(line);
		
		chara = Integer.parseInt(bobFrankST.nextToken());
		
		while(bobFrankST.hasMoreTokens()) {
			String thing = bobFrankST.nextToken();
			int row = thing.charAt(0)-'0';
			int col = thing.charAt(1)-'0';
			matrix[row][col] = 1;
		}
		
		output = "";
	}
	
	public static void solve() {
		int count = 0;
		
		if(chara == 1) {
			for(int i = 0; i < 10; i++) {
				if(matrix[i][i] == 1) {
					count++;
				}
			}
			for(int i = 0; i < 10; i++) {
				for(int j = i+1; j < 10; j++) {
					if(matrix[i][j] == 1 && matrix[j][i] == 1) {
						count++;
					}
				}
			}
		}else if(chara == 2) {
			int max = 0;
			int maxI = 0;
			for(int i = 0; i < 10; i++) {
				int c = 0;
				for(int j = 0; j < 10; j++) {
					if(matrix[i][j] == 1) {
						c++;
					}
				}
				if(c > max) {
					max = c;
					maxI = i;
				}
			}
			
			for(int j = 0; j < 10; j++) {
				if(matrix[maxI][j] == 1) {
					count += maxI*10+j;
				}
			}
			
		}else {
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					for(int k = 0; k < 10; k++) {
						if(matrix[i][j] == 1 && matrix[j][k] == 1) {
							count++;
						}
					}
				}
			}
		}
		output = ""+count;
	}
	
	public static void output() {
		System.out.println(output);
	}
}

/*

2 12 13 23 31 34 41
1 12 23 34 11 21 32 45 53 95 43 99 29 91
3 12 23 34 41 31 52 45 61 14 21 33 55 13 54 32 56 36
1 12 11 33 34 43 55 52 41 31 25 88 79 98 45 13 42 87 35 51 21 14 78
2 12 11 33 34 43 55 52 41 31 25 88 79 98 45 13 42 87 35 51 21 14 78
*/
