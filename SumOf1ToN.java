//Display sum of 1 to N Numbers
import java.util.Scanner;
class  SumOf1ToN
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		for (int i =1 ;i<=n ;i++ )
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
}
