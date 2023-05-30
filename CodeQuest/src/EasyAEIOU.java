import java.util.*;
import java.io.*;

public class EasyAEIOU {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amt = Integer.parseInt(in.nextLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < amt; i++) {
			String str = in.nextLine();
			str = str.toLowerCase();
			
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
					count++;
				}
			}
			sb.append(count+"\n");
			count = 0;
		}
		System.out.print(sb);
	}
}
/*
3
code quest is fun
good luck programming today
queueing has five vowels in a row
*/