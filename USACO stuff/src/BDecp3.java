import java.util.*;
import java.io.*;

public class BDecp3 {
	static int answer = 0;
	static int N = 0;
	static int K = 0;
	static char[][] a;
	
	static void solve(int x, int y, int turns, boolean d) {
		if(x == (N-1) && y == (N-1)) {
			answer++;
			return;
		}
		if(x >= N || y >= N) return;
		if(a[y][x] == 'H') return;
		
		if(d)
			y++;
		else
			x++;
		
		if(turns > K) return;
		
		solve(x, y, turns, d);
		solve(x, y, turns+1, !d);
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		for(int U = 0; U < T; U++) {
			int N = s.nextInt();
			int K = s.nextInt();
			
			char[][] a = new char[N][];
			
			for(int i = 0; i < N; i++) {
				String str = s.next();
				a[i] = str.toCharArray();
			}
			
			solve(0, 0, 0, true);
			solve(0, 0, 0, false);
			
			System.out.println(answer /2);
			answer = 0;
		}
	}
}
