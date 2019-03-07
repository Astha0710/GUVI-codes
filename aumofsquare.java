import java.util.*;
import java.lang.*;
class SumOfSquares
{
    public static void main(String args[])
{
    
       Scanner sc=new Scanner(System.in);
     int l=sc.nextInt();
     int sum=0;
     int r;
     while(l%10!=0)
     {   r=l%10;
         sum=sum+(int)Math.pow(r,2);
         l=l/10;
     }
      
          System.out.println(sum);
      
      
        
    
        
    } 
}
