//Subtraction of two array
//4 5 6 7
//1 2 3 4
//3 3 3 3
class Array12
{
	public static void main(String[] args)
	{
		int[] a={4,5,6,7};
		int[] b={1,2,3,4};
		int[] c=new int[4];
		for(int i=0;i<=3;i++)
		{
			c[i]=a[i]-b[i];
         System.out.print(c[i]+"    ");
		}
	}
}	