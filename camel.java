import java.util.*;
import java.lang.*;
class CamelCase
{
    public static void main(String args[])
{
    
       Scanner sc=new Scanner(System.in);
     String l=sc.nextLine();
     char c=l.charAt(0);
     String res="";
     res=res+Character.toUpperCase(c);
     for(int i=1;i<l.length();i++)
     {
         if(l.charAt(i-1)==' ')
         {
             res=res+Character.toUpperCase(l.charAt(i));
         }
         else{
             res=res+l.charAt(i);
         }
     }
     
    
          System.out.println(res);
      
      
        
    
        
    } 
}
