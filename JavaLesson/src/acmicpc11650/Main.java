package acmicpc11650;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static class Point implements Comparable<Point>{
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(Point o) {
			if(this.y < o.y) {
				return -1;
			}else if(this.y > o.y) {
				return 1;
			}else {
				return this.x - o.x;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point[] points = new Point[n];
		for(int i = 0; i < n; i++) {
			points[i] = new Point(in.nextInt(), in.nextInt());
		}
		Arrays.sort(points);
		for(int i = 0; i < n; i++) {
			System.out.println(points[i].x + " " + points[i].y);
		}
	}
	
	/*
5
3 4
1 1
1 -1
2 2
3 3
	 */
}
