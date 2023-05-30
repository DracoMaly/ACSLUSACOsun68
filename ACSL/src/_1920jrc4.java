import java.util.*;

public class _1920jrc4 {
	
	static final int H = 1, V = 2;
	static final int[] direction = {0, 
			V, V,
			H, H, H, H, V, 
			H, H, H, H, V, 
			H, H, H, H, V, 
			H, H, H, H, V, 
			V, V, V, H, 
			V, V, V, V, 
			H, H, H, H, V, 
			H, H, H, H, V, 
			H, H, H, H, V, 
			H, H, H, H, V, 
			V
	};
	
	static Scanner in;
	
	static int[] board;
	static int[] diceRolls;
	static int playerLoc;
	
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
		board = new int[53];
		
		//1 - player marker
		//-1 - enemy marker
		
		for(int i = 0; i < 3; i++) {
			int loc = in.nextInt();
			board[loc] = -1;
		}
		
		playerLoc = in.nextInt();
		
		int r = in.nextInt();
		diceRolls = new int[r];
		for(int i = 0; i < r; i++) {
			diceRolls[i] = in.nextInt();
		}
		
		output = "";
	}
	
	public static void solve() {
		for(int i = 0; i < diceRolls.length; i++) {
			int newLoc = playerLoc + diceRolls[i];
			if(board[newLoc] == -1) {
				//do nothing
				continue;
			}else if( isPrime(newLoc) ) {
				int j = 0;
				while(j < 6) {
					if(board[newLoc + j + 1] == -1) {
						break;
					}
					j++;
				}
				newLoc += j;
			}else if( isPerfectSquare(newLoc) && newLoc > 4) {
				int j = 0;
				while(j < 6) {
					if(board[newLoc-j-1] == -1) {
						break;
					}
					j++;
				}
				newLoc -=j;
			}else if( horVertMovement(playerLoc, newLoc) ){
				int furthestPossible = playerLoc;
				for(int j = playerLoc; j <= newLoc; j++) {
					if(j % diceRolls[i] == 0 && board[j] != -1) {
						furthestPossible = j;
					}
				}
				newLoc = furthestPossible;
			}
			playerLoc = newLoc;
		}
		
		if(playerLoc == 52) {
			output += "GAME OVER";
		}else {
			output += playerLoc;
		}
		
		
	}

	public static void output() {
		System.out.println(output);
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPerfectSquare(int n) {
		return Math.sqrt(n) == (int)Math.sqrt(n);
	}
	
	public static boolean horVertMovement(int a, int b) {
		for(int i = a; i < b-1; i++) {
			if(direction[i] == H && direction[i+1] == V) {
					return true;
			}
		}
		return false;
	}
	
}

/*
4 6 8 1 5 6 3 5 1 1
10 24 32 8 4 4 4 3 5
10 22 32 8 7 4 4 3 5 5 5 6
17 20 27 16 7 3 5 4 6 5 1 4
43 46 50 40 5 3 1 2 4 4
 */

