/*
4 S 2 S 5 S 6 S 8 S 9 S
7 H 3 S 3 H 3 D 3 C 2 H
9 D 3 C 5 H 1 S 7 D 9 S
6 C 1 S 2 H 7 S 8 D 9 H
1 D 2 S 3 D 4 S 2 H 2 C
 */





import java.util.*;

public class _1617jrc1 {
	static Scanner in;
	
	static int leadnum;
	static String leadsuit;
	static int[] cardsnum;
	static String[] cardsuit;
	
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
		leadnum = in.nextInt();
		leadsuit = in.next();
		
		cardsnum = new int[5];
		cardsuit = new String[5];
		
		for(int i = 0; i < 5; i++) {
			cardsnum[i] = in.nextInt();
			cardsuit[i] = in.next();
		}
		output = "";
	}
	
	public static void solve() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		if(suitThere(leadsuit)) {
			for(int i = 0; i < cardsnum.length; i++) {
				if(cardsuit[i].equals(leadsuit)) {
					nums.add(cardsnum[i]);
				}
			}
			int min = 10;
			int possNum = 10;
			for(int i = 0; i < nums.size(); i++) {
				if(nums.get(i) < possNum && nums.get(i) > leadnum) {
					possNum = nums.get(i);
				}else if(nums.get(i) < min) {
					min = nums.get(i);
				}
			}
			if(possNum == 10) {
				output = "" + min + ", " + leadsuit;
			}else if(possNum != 10) {
				output = "" + possNum + ", " + leadsuit;
			}
		}
		
		if(!suitThere(leadsuit)) {
			output = "NONE";
		}
		
		
		/* loser code
		int min = 10;
		String finalSuit = "";
		if(suitThere(leadsuit)) {
			for(int i = 0; i < cardsuit.length; i++) {
				
				if(isSuit(cardsuit[i]) && cardsnum[i] > leadnum && cardsnum[i] < min) {
					min = cardsnum[i];
					finalSuit = cardsuit[i];
				}else{
					min = Integer.parseInt(lowInt().substring(0,1));
					finalSuit = lowInt().substring(1,2);
				}
			}
		}else {
			output = "NONE";
			return;
		}
		
		
		output = "" + min + ", " + finalSuit;*/
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static boolean isSuit(String suit) {
		if(suit.equals(leadsuit)) {
			return true;
		}
		return false;
	}
	
	/*public static String lowInt() {loser code
		String smol = "10";
		for(int i = 0; i < cardsnum.length;i++) {
			if(isSuit(cardsuit[i]) && cardsnum[i] < Integer.parseInt(smol.substring(0,1))) {
				smol = "" + cardsnum[i] + cardsuit[i];
				
			}
		}
		return smol;
	}*/
	
	public static boolean suitThere(String suit) {
		for(int i = 0; i < cardsuit.length;i++) {
			if(cardsuit[i].equals(suit)) {
				return true;
			}
		}
		return false;
	}
	
}
