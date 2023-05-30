	package acmicpc10825;

import java.util.Arrays;
import java.util.Scanner;

import acmicpc11650.Main.Point;

public class Main {
	
	public static class Student implements Comparable<Student>{
		String name;
		int kor, eng, math;
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor  = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public int compareTo(Student o) {
			if(this.kor < o.kor) {
				return -1;
			}else if(this.kor > o.kor) {
				return 1;
			}else if(this.eng > o.kor) {
				return -1;
			}else if(this.eng < o.eng) {
				return 1;
			}else {
				return this.name.compareTo(o.name);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student[] students = new Student[n];
		for(int i = 0; i < n; i++) {
			students[i] = new Student(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
		}
		Arrays.sort(students);
		for(int i = 0; i < n; i++) {
			System.out.println(students[i].name);
		}
	}
}
