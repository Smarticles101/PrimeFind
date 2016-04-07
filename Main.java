/*
*	Prime find!
*	Author: @Smarticles101
*	Finds prime numbers between two numbers
*/

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int primeCount = 0;
		long startNumber;
		long orgStartNumber;
		long endNumber;
		
			Scanner input = new Scanner(System.in);
			System.out.print("Find primes starting at-->\t");
			startNumber = input.nextLong();
			orgStartNumber = startNumber;
		
			System.out.print("Find prime numbers up to -->\t");
			endNumber = input.nextLong();
			while(startNumber<=endNumber) {
				if(isPrime(startNumber)) {
					primeCount++;
					System.out.println(startNumber+" is prime!");
				}
				startNumber++;
			}
			System.out.println(primeCount+" prime numbers found between "+orgStartNumber+" and "+endNumber);
			}
		
	
	public static boolean isPrime(long n) {
		if(n==0||n==1)
			return false;
			
		for(int y=2; y<n; y++) {
			if(n%y == 0) {
				return false;
				// We found a multiple!
			}
		}
		return true;
		// No multiples found, it is prime
	}
}
