/*
65 0 8 0 7 0 6 0 5 1 4
74 2 0 1 8 2 0 1 7 0 4
84 2 4 6 8 0 3 9 1 5 7
92 0 1 2 3 4 5 6 7 8 9
80 9 7 5 3 1 8 6 4 2 0

105, dealer
100, dealer
106, dealer
100, player
101, player

 */


import java.util.*;

public class _1718jrc1 {
	
	static Scanner in;
	
	static int points;
	static ArrayList<Integer> pHand;
	static ArrayList<Integer> dplay;
	
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
		points = in.nextInt();
		
		pHand = new ArrayList<Integer>();
		
		pHand.add(in.nextInt());
		pHand.add(in.nextInt());
		pHand.add(in.nextInt());
		
		dplay = new ArrayList<Integer>();
		
		for(int i = 0; i < 7; i++) {
			if(i%2 == 0) {
				pHand.add(in.nextInt());
			}else {
				dplay.add(in.nextInt());
			}
		}
		
		output = "";
		
	}
	
	public static void solve() {
		
		for(int i = 0; i < dplay.size(); i++) {
			if(pHand.get(i) != 9 && pHand.get(i) != 4 && pHand.get(i) != 0) {
				points += pHand.get(i);
			}else if(pHand.get(i) == 9) {
				//skip
			}else if(pHand.get(i) == 4) {
				points-=10;
			}else if(pHand.get(i) == 0) {
				if(points+11 > 99) {
					points++;
				}else {
					points+=11;
				}
			}
			if(points > 99) {
				output = points + ", dealer";
				return;
			}
		
			if(dplay.get(i) != 9 && dplay.get(i) != 4 && dplay.get(i) != 0) {
				points += dplay.get(i);
			}else if(dplay.get(i) == 9) {
				//skip
			}else if(dplay.get(i) == 4) {
				points-=10;
			}else if(dplay.get(i) == 0) {
				if(points+11 > 99) {
					points++;
				}else {
					points+=11;
				}
			}
			if(points > 99) {
				output = points + ", player";
				return;
			}
		
		}
		if(pHand.get(3) == 0) {
			if(points+1 > 99) {
				points++;
				output = points + ", dealer";
			}
		}else if(points+pHand.get(3) > 99) {
			points+= pHand.get(3);
			output = points + ", dealer";
		}
		
	}
	
	public static void output() {
		System.out.println(output);
	}
}
