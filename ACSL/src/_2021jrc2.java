import java.util.*;

public class _2021jrc2 {
	
	static Scanner in;
	
	static String str;
	
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
		str = in.nextLine();
		
		output = "";
	}
	
	public static void solve() {
		
		//1. lowercase and rid of all nonletters
		String fixed = str.toLowerCase();
		for(int i = 0; i < fixed.length(); i++) {
			if(!Character.isLetter(fixed.charAt(i))) {
				fixed.replace(fixed.charAt(i)+ "", "");
			}
		}
		
		//2. sort
		char sorted[] = fixed.toCharArray(); 
	    Arrays.sort(sorted);
	    
	    
		//3&4.append
	    String newstr = "";
	    int i = 0;
	    char lastChar = 0;
	    int size = sorted.length;
	    while(size != 0) {
	    	if(i == size) {
	    		i=0;
	    		lastChar = 0;
	    	}
	    	if(lastChar != sorted[i]) {
	    		newstr = newstr + Character.toString(sorted[i]);
	    		sorted[i] = 0;
	    		size--;
	    	}
	    		
	    	lastChar = sorted[i];
	    	i++;
	    }
		
	    //5. remove adjacent duplicate
	    
	    String finalstr = newstr.charAt(0) + "";
	    char prevChar = newstr.charAt(0);
	    for(int j = 1; j < newstr.length(); j++) {
	    	if(newstr.charAt(j) != prevChar) {
	    		finalstr = finalstr + newstr.charAt(j);
	    	}
	    }
	    
	    output = finalstr;
	    
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	
	
}
