import java.util.*;

public class _2021jrc3 {
	
	static Scanner in;
	
	static ArrayList<Integer> nums;
	static ArrayList<Integer> nums2;
	static ArrayList<Integer> nums3;
	
	static int output;
	
	public static void main(String[] args) {
		init();
		solve();
		output();
	}

	public static void init() {
		in = new Scanner(System.in);
		
		String line1 = in.nextLine();
		String line2 = in.nextLine();
		String line3 = in.nextLine();
		
		nums = new ArrayList<Integer>();
		nums2 = new ArrayList<Integer>();
		nums3 = new ArrayList<Integer>();
		
		
		StringTokenizer st1 = new StringTokenizer(line1);
		while(st1.hasMoreTokens()) {
			nums.add(Integer.parseInt(st1.nextToken()));
		}
		
		StringTokenizer st2 = new StringTokenizer(line2);
		while(st2.hasMoreTokens()) {
			nums2.add(Integer.parseInt(st2.nextToken()));
		}
		
		StringTokenizer st3 = new StringTokenizer(line3);
		while(st3.hasMoreTokens()) {
			nums3.add(Integer.parseInt(st3.nextToken()));
		}
		
		
		output = 0;
	}
	
	public static void solve() {
		
		ArrayList<Integer> sml,med,lrg;
		if(nums.size() < nums2.size() && nums2.size() < nums3.size()) {
			sml = nums;
			med = nums2;
			lrg = nums3;
		}else if(nums.size() < nums3.size() && nums3.size() < nums2.size()){
			sml = nums;
			med = nums3;
			lrg = nums2;
		}else if(nums2.size() < nums.size() && nums.size() < nums3.size()) {
			sml = nums2;
			med = nums;
			lrg = nums3;
		}else if(nums2.size() < nums3.size() && nums3.size() < nums.size()) {
			sml = nums2;
			med = nums3;
			lrg = nums;
		}else if(nums3.size() < nums.size() && nums.size() < nums2.size()) {
			sml = nums3;
			med = nums;
			lrg = nums2;
		}else {
			sml = nums3;
			med = nums2;
			lrg = nums;
		}
		
		ArrayList<Integer> bigNums = new ArrayList<Integer>();
		
		int i = 0;
		while(i < sml.size()) {
			int a = sml.get(i);
			int b = med.get(i);
			int c = lrg.get(i);
			
			bigNums.add(Math.max(Math.max(a, b), c));
			
			i++;
		}
		while(i < med.size()) {
			int b = med.get(i);
			int c = lrg.get(i);
			
			bigNums.add(Math.max(c, b));
			
			i++;
		}
		while(i < lrg.size()) {
			int c = lrg.get(i);
			
			bigNums.add(c);
			
			i++;
		}
		
		for(int j = 0; j < bigNums.size(); j++) {
			output += bigNums.get(j);
		}
	}
		
		
	
	public static void output() {
		System.out.println(output);
	}
	
}
