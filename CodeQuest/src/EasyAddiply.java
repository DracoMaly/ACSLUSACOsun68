import java.io.*;
import java.util.*;


public class EasyAddiply {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amt = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < amt; i++) {
			int num = in.nextInt();
			int anum = in.nextInt();
			
			sb.append((num+anum) + " " + (num*anum) + "\n");
		}
		
		System.out.print(sb);
	}
}
/*
3
2 2
5 4
3 8
*/