//Program to print from 1 to n
import java.util.Scanner;
class  PrintNNumbers
{
	public static void main(String[] args) 
	{

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	
	int n = input.nextInt();
	
		for (int i = 1;i <= n ;i++ )
		{
			System.out.println(i);
		}
	}
}
