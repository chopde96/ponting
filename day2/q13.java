import java.util.*;
public class q13 {
    public static void main(String args[])
    {
        
        int a,b,c,suma ;
        Scanner sc=new Scanner (System.in);

        float average;
        System.out.println("enter 3 nos ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        suma=a+b+c;
        
        average=(a+b+c)/3f;
        
        System.out.println("average is"+average);
        System.out.println("sum is"+suma);
        
    }
}
       
