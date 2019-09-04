public class whileNested
{
	public static void main (String args[])
	{
		int count = 0;
		int track = 0;
		
		
		while (count <=3)
		{
			System.out.println("The count has the value of " + count);
			track = 0; //by setting track = 0 in the while loop it rests track to 0 every time it enters the outter while loop
			
			while (track <=3)
			{
				System.out.println(" \t value of track has: " + track);
				track++;
			}
			
			count++;
		}
	}
}