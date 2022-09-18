import java.util.*;

public class _2021jrc4 {
	
	static Scanner in;
	
	static int query;
	static int[][] adj;
	
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
		adj = new int[9][9];
		
		query = in.nextInt();
		
		StringTokenizer st = new StringTokenizer(in.nextLine());
		while(st.hasMoreTokens()) {
			String t = st.nextToken();
			int origin = t.charAt(0) - '0' - 1;
			int dest = t.charAt(1) - '0' -1;
			
			adj[origin][dest] = 1;
		}
		
		output = "";
	}
	
	public static void solve() {
		if(query == 1) {
			int count = 0;
			for(int i = 0; i < adj.length; i++) {
				for(int j = 0; j < adj.length; j++) {
					if(adj[i][j] == 1) {
						count++;
					}
				}
			}
		}else if(query == 2) {
			
		}else {
			int count = 0;
			for(int i = 0; i < adj.length; i++) {
				for(int j = 0; j <adj[i].length; j++) {
					if(adj[i][j] == 1) {
						for(int k = 0; k < adj[j].length;k++) {
							if(adj[j][k] == 1) count++;
						}
					}
				}
			}
			output = "" + count;
		}
	}
	
	public static void output() {
		
	}
}

/*

2 12 13 23 31 34 41
1 12 23 34 11 21 32 45 53 95 43 99 29 91
3 12 23 34 41 31 52 45 61 14 21 33 55 13 54 32 56 36
1 12 11 33 34 43 55 52 41 31 25 88 79 98 45 13 42 87 35 51 21 14 78
2 12 11 33 34 43 55 52 41 31 25 88 79 98 45 13 42 87 35 51 21 14 78
*/
