package acmicpc9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			String parensis = in.next();
			boolean mmballs = false;
			for(int j = 0; j < parensis.length(); j++) {
				if(parensis.charAt(j) == '(') {
					s.push("s");
				}else if(parensis.charAt(j) == ')') {
					if(s.isEmpty()) {
						mmballs = true;
						break;
					}else {
						s.pop();
					}
				}
			}
			if(!s.isEmpty() || mmballs) {
				sb.append("NO\n");
			}else {
				sb.append("YES\n");
			}
			s.clear();
		}
		System.out.println(sb);
	}
}


/*
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
*/
