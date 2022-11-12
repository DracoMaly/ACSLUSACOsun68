import java.util.*;

public class _1718intc1 {
	
	static Scanner in;
	
	static int ipt; //initial point total
	static String[] cards;
	
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
		ipt = in.nextInt();
		
		cards = new String[10];
		for(int i = 0; i < 10; i++) {
			cards[i] = in.next();
		}
	}

	public static void solve() {
		ArrayList<Character> p1Hand = new ArrayList<Character>();   //TURN THIS INTO STATIC
		for(int i = 0; i < 3; i++) {
			p1Hand.add(cards[i].charAt(0));
		}
		ArrayList<Character> sequence = new ArrayList<Character>();
		for(int i = 3; i < cards.length; i++) {
			sequence.add(cards[i].charAt(0));
		}
		int sum = ipt; 
		boolean dealerWins = false; 
		
		
		//for loop
		//Look for largest P1Hand
		//add in to sum
		//get rid of that num and add next card to p1Hand
		//check if its gone over the limit
			//if it has then dealer wins and break
		//add in dealers card to sum
		//check if its gone over the limit
			//if it has then dealer wins and break
		//for(int i = 3; i < ; i++) {
			
		//}
		
		
		
		output += sum + ", ";
		
		if(dealerWins) {
			output += "dealer";
		}else {
			output += "player";
		}
	}
	
	public static void output() {
		System.out.println(output);
	}
	
}
