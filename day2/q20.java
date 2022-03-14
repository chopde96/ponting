/*
class q20{
    public static void main(String args[])
    {
		int i,j;
		for(i=1;i<=5;i++)
		{
			int sum=0;
			for(j=i;j>=1;j--){
				sum=sum+j;
			System.out.print(" "+j);
			}
			System.out.print(" "+sum);
			System.out.println();
			}
		}
	}*/
	class q20
{
	public static void main(String args [])
	{	int k=0;
		for(int i=1;i<=7;i++)//Row
		{
			for(int j=1;j<=i;j++)//Column
			{
				k=k+2;
				System.out.print(k+" ");
				
			}
			
			System.out.println();
		}
		
	}
}
