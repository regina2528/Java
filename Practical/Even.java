// example of java control statememnts
//check the number is odd or even
import java.util.Scanner;
class Even
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}
	