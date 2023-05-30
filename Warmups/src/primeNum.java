import java.util.*;

public class primeNum {
	
	static int N = 10000;
	
	public static int[] primes;
	
	public static void main(String[] args) {
		primes = new int[N+1];
		for(int i = 0; i < primes.length;i++) {
			primes[i] = i;
		}
		
		for(int i = 2; i < primes.length;i++) {
			for(int j = i + i; j < primes.length; j+=i) {
				primes[j] = 0;
			}
		}
		
		printPrimes();
	}
	
	public static void printPrimes() {
		for(int i = 2; i < primes.length; i++) {
			if(primes[i] != 0) System.out.print(primes[i] + " ");
		}
		System.out.println();
	}
}
