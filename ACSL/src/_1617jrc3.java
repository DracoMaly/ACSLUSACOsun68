import java.util.*;

public class _1617jrc3 {
	
	static int[][] offsets = {
			{2, 0},
			{1, -1}, {1, 0}, {1, 1},
			{0, -2}, {0, -1}, {0, 0}, {0, 1}, {0, 2}, 
			{-1, -1}, {-1, 0}, {-1, 1},
			{-2, 0}
	};
	
	static Scanner in;
	
	static int[][] grid;
	static int row, col;
	
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
		grid = new int[8][8];
		
		int r = Integer.parseInt(in.next().replace(",", ""));
		
		for(int i = 0; i < r; i++) {
			String t = in.next().replace(",", "");
			int rowNum = t.charAt(0) - '0' - 1;
			for(int j = 1; j < t.length(); j++) {
				int colNum = t.charAt(j) - '0' - 1;
				grid[rowNum][colNum] = 1;
			}
		}
		
		String t = in.next();
		row = t.charAt(0) - '0' - 1;
		col = t.charAt(0) - '0' - 1;
	}
	
	public static void solve() {
		for(int i = 0; i < offsets.length; i++) {
			int newRow = row + offsets[i][0];
			int newCol = row + offsets[i][1];
			
			if(0 <= newRow && newRow <= 7 && 0 <= newCol && newRow <= 7) {
				flip(newRow,newCol);
			}
		}
		
		int count = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				count += grid[i][j];
			}
		}
		output = "" + count;
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static void flip(int r, int c) {
		if(grid[r][c] == 1) {
			grid[r][c] = 0;
		}else {
			grid[r][c] = 1;
		}
	}
}


/* 
2, 434, 523, 43 
1, 58, 58 
1, 58, 57 
1, 518, 51 
3, 32, 44, 56, 54
*/