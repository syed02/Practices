import java.util.Scanner;
public class lab08 {
	public static void main(String[] args) 
	
	{
		Scanner stdIn = new Scanner(System.in);


		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		int input;
		
		

		do	
		{
			System.out.println("Enter number of rolls (100-1000): ");
			input = stdIn.nextInt();
			
		} while ((input < 100 && input > 1000));
		
		do 
		{
			
			int die = (int)(Math.random() * 4) + 1;
			if (die == 1) 
			{
				v1++;
			}
			else if (die == 2) 
			{
				v2++;
			}
			else if (die == 3) 
			{
				v3++;
			}
			else if (die == 4) 
			{
				v4++;
		}
			
		}while (input != v1 + v2 + v3 + v4);
		System.out.print("v1: " + v1 + '\n');
		System.out.print("v2: " + v2 + '\n');
		System.out.print("v3: " + v3 + '\n');
		System.out.print("v4: " + v4 );

		stdIn.close();
	}
	

}
