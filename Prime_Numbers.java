import java.util.*;

public class Prime_Numbers
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter a number");
		int number = scan.nextInt();
		int primeNth = isNthPrime(number);
		System.out.println("The " + number + "th prime number is " + primeNth);



	}

	public static int isNthPrime(int findPrime)
	{
		int count = 0; //this will count the number of primes
		int prime = 2; //we start at 2 because 1 is not a prime
		boolean check = true; //set check as true and assume number is prime unless otherwise proved

		while(count < findPrime) //only loop untill the Nth and no greater
		{
			//checks if prime is divisible by smaller numbers beginning with 2
			for(int i = 2; i < prime; i++)
			{
				if(prime % i == 0)
				{
					check = false; // fasle indicates that it is not a prime number
				}
			}

			if(check == true)
			{
				count++; //found a prime 
			}

			check = true; //reset check to true
			prime++; //increment and check is the next number a prime
		}

		return prime - 1; // -1 because prime will attempt to check the next number as long as the while loop condition is true
	}
}