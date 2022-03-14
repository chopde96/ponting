class q21{
public static void main(String args [])
	{	
		for(char i=65;i<=90;i++)//Row
		{
			
			for(char j=65;j<=i;j++)//Column 
			{
				System.out.print(j+" ");
				
			}
			
			for(char k=i-1;k>=1;k--)//Column 
			{
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		
	}
}