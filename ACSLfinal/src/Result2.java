import java.io.*;
import java.util.*;


/*

 */

public class Result2 {
	
	public static void main(String[] args) {
		System.out.println(changedPositions("13 12 11 10 9 8 7 6 5 4 3 2 1"));
	}
	
	public static int changedPositions(String customers) {
		StringTokenizer bobFrankST = new StringTokenizer(customers);
		ArrayList<Integer> line = new ArrayList<Integer>();
		
		while(bobFrankST.hasMoreTokens()) {
			line.add(Integer.parseInt(bobFrankST.nextToken()));
		}
		
		
		int count = 0;
		
		int max = Collections.max(line);
		
		
		for(int i = 1; i <= max; i++) {
			int tempI = findI(line, i);
			int num = line.get(tempI);
			
			
			ArrayList<Integer> tempa= new ArrayList<Integer>();
			for(int k = 0; k <= tempI; k++) {
				tempa.add(line.get(k));
			}
			
			tempa = rev(tempa);
			
			if(tempa.size() != 0 && tempa.size()%2 != 1) {
				count+=tempa.size();
			}else if(tempa.size() != 0) {
				count+= tempa.size()-1;
			}
			
			for(int k = tempI+1; k < line.size();k++) {
				tempa.add(line.get(k));
			}
			
			line = tempa;
			line.remove(0);
			
			
		}
		return count;
		
	}
	
	public static int findI(ArrayList<Integer> al, int num) {
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i) == num) {
				return i;
			}
		}
		return 100000;
	}
	
	public static ArrayList<Integer> rev(ArrayList<Integer> list) {
        ArrayList<Integer> rev = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            rev.add(list.get(i));
        }
 
        return rev;
    }
 
	
}