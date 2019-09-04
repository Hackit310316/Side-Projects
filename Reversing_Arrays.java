import java.util.*;

public class Reversing_Arrays
{
	public static void main(String [] args)
	{
		/*
		 * using standard method of declaring arrays 
		 */
		int [] array_1 = {100,200,300,500,900,500,};

		// Reverse array_1
		reverse (array_1, array_1.length); // must pass the array and the lenght of the array 
		//as parameters

		/* 
		 * Using a Scanner to fill the array with user input and then reverse it
		 */
		Scanner scan = new Scanner (System.in);

		System.out.println("\n Please enter the lenght of Array");
		int length = scan.nextInt(); //sets length as the number entered by user
		int [] array_2 = new int [length]; // sets arrays length as length variable

		System.out.println("Please enter the elements of Array");
		// Using a for loop to iterate and enter each value entered 
		//into the array will end once size is exceded

		for( int i = 0; i < length; i++ )
		{
			array_2[i] = scan.nextInt();
		}

		System.out.println(Arrays.toString(array_2));

		// Reverse array_2
		reverse (array_2, array_2.length);


	}

	public static void reverse(int [] a, int n)
	{
		int [] myArray = new int[n];
		int j = n;

		for(int i = 0; i < n; i++)
		{
			myArray[j-1] = a[i];
			j = j - 1;
		}

		/*Print the reversed array*/
		System.out.println("Reversed array is: \n");
		for(int x = 0; x < n; x++)
		{
			System.out.print(myArray[x]);
		}
	}


}