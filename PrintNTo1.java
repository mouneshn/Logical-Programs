//Print numbers from N to 1
import java.util.Scanner;
class PrintNTo1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	
		for(int i = n; i>=1; i--)
		{
			System.out.println(i);
		}
	}
}
