

public class BinaryConversion {
	public static void main(String[] args) {
		System.out.println(cvtToDec("1101"));
	}
	
	public static int cvtToDec(String binary) {
		int num = 0;
		int blen = binary.length();
		
		for(int i = 0; i < blen; i++) {
			num += Math.pow(2, blen - 1 - i) * Integer.parseInt(binary.substring(i, i+1));
		}
		return num;
	}
}
