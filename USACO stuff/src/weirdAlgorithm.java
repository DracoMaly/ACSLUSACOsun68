import java.util.*;
import java.io.*;

public class weirdAlgorithm {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		String output = "";
		
		long n = Integer.parseInt(r.readLine());
		
		output = output + n+ " ";
		while(n != 1) {
			if(n%2==1) {
				n=n*3+1;
			}else {
				n = n/2;
			}
			output = output + n + " ";
		}
		System.out.println(output.substring(0, output.length()-1));
	}
}
