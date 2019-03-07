import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
 
class ReverseNumber 
{ 
    public static void main(String[] args) 
    { 
       
  
      Scanner sc=new Scanner(System.in);
       
      int s=sc.nextInt();
      int res=0;
     
       while(s>0)
       {
           res=res*10+(s%10);
           s=s/10;
           
       }
            System.out.print(res); 
    } 
}
