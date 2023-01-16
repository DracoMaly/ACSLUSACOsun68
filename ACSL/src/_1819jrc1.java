import java.util.*;

public class _1819jrc1 {
	static Scanner in;
	
	static String n1, n2, n3, n4, n5;
	
	static int o1, o2, o3, o4, o5;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		init();
		solve();
		output();
	}
	
	public static void init() {
		n1 = in.nextLine();
		n2 = in.nextLine();
		n3 = in.nextLine();
		n4 = in.nextLine();
		n5 = in.nextLine();
		
		o1 = 0;
		o2 = 0;
		o3 = 0;
		o4 = 0;
		o5 = 0;

	}
	
	public static void solve() {
		//1. how many digits
		o1 = n1.length();
		
		//2. sum of all digits
		for(int i = 0; i < n2.length();i++) {
			o2 += Integer.parseInt(n2.substring(i, i+1));
		}
		
		//3. sum of all digits in odd locations
		for(int i = 0; i < n3.length();i+=2) {
			o3 += Integer.parseInt(n3.substring(i, i+1));
		}
		
		//4. how many times 4?
		for(int i = 0; i < n4.length(); i++) {
			if(n4.charAt(i) == '4') {
				o4++;
			}
		}
		
		//5. middle digit?
		if(n5.length() %2 == 0) {
			o5 = Integer.parseInt(n5.substring(n5.length()/2-1, n5.length()/2));
		}else {
			o5 = Integer.parseInt(n5.substring(n5.length()/2, n5.length()/2+1));
		}
			
		
		
	}
	
	public static void output() {
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		System.out.println(o5);
	}
}
