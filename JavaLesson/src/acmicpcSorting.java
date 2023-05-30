import java.util.*;


public class acmicpcSorting {
	
	static Scanner in;
	
	static int N, K;
	
	static int[] nums;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();
	}
	
	public static void init() {
		N = in.nextInt();
		K = in.nextInt();
		
		nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		
	}
	
	public static void solve() {
		System.out.println(nums[K-1]);
	}
}
