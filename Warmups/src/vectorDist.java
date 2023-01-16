import java.util.*;

public class vectorDist {
	static Scanner in;
	
	static double x1, y2, x3, y3,y1, x2;
	
	static String output;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		x3 = in.nextDouble();
		y3 = in.nextDouble();
		
		double sideA = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		double sideB = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
		double sideC = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));

		double semiP = (sideA + sideB + sideC)/2;
		
		
		output = "" + Math.sqrt(semiP*(semiP-sideA)*(semiP-sideB)*(semiP-sideC));
		
		System.out.println(output);
	}
	
}
