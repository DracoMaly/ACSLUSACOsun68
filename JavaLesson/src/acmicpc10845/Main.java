package acmicpc10845;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


//WRONG BUT WILL GO OVER

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			String command = in.next();
			if(command.equals("push")) {
				int val = in.nextInt();
				q.add(val);
			}else if(command.equals("pop")) {
				if(q.isEmpty()) {
					sb.append("-1\n");
				}else {
					q.poll();
				}
			}else if(command.equals("size")){
				sb.append(q.size()+"\n");
			}else if(command.equals("empty")) {
				if(q.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}else if(command.equals("front")) {
				if(q.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(q.peek()+"\n");
				}
			}else {
				if(q.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(q.peekLast()+"\n");
				}
			}
		}
		System.out.println(sb);
	}
}

/*
15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front
 */
