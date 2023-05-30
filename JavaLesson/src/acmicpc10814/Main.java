package acmicpc10814;

import java.util.Arrays;
import java.util.Scanner;

import acmicpc11650.Main.Point;

public class Main {
	
	public static class Member implements Comparable<Member>{
		int age, order;
		String name;
		public Member(int age, String name) {
			this.age = age;
			this.name = name;
			this.order = order;
		}
		
		public int compareTo(Member o) {
			if(this.age < o.age) {
				return -1;
			}else if(this.age > o.age) {
				return 1;
			}else {
				return this.order - o.order;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Member[] members = new Member[n];
		for(int i = 0; i < n; i++) {
			//members[i] = new Member(in.nextInt(), in.nextInt());
		}
		Arrays.sort(members);
		for(int i = 0; i < n; i++) {
			System.out.println(members[i].age + " ");
		}
	}
	
	
}
