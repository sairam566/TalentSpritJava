package basicprogramsdayone;

public class Test
{	
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i*j+" ");
			}
			
			System.out.println();
		}
		System.out.println("-----------------------------------------------------");
		
		for(int a=1;a<=5;a++)
		{
			for(int k=a;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=a;l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
		
	}
}
