//multiplication table
import java.util.*;
public class table {
    public static void main(String args[])
    {
        
        int a,i ;
        Scanner sc=new Scanner (System.in);

        
        System.out.println("enter a no ");
		a=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(a +" * "+i+" = "+ (a*i));
			}
	}
	}

//q4
class Q4
{

public static void main(String args[])
{
 int a = -5 + 8 * 6;
int b = (55+9) % 9;
int c = 20 + -3*5 / 8;
int d = 5 + 15 / 3 * 2 - 8 % 3;

System.out.println(+a);
System.out.println(+b);
System.out.println(+c);
System.out.println(+d);

}
}
