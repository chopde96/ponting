//rectangle
import java.util.*;
public class q12 {
    public static void main(String args[])
    {
        
         
        Scanner sc=new Scanner (System.in);

        float l,b,area,peri;
        System.out.println("enter lenght of reactangle");
        l=sc.nextFloat();
		 System.out.println("enter width of reactangle");
		b=sc.nextFloat();
        area=l*b;
        peri=2*(l+b);
        System.out.println("area  of react is "+area);
        System.out.println("peri of rect is"+peri);
    }
}
       