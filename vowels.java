import java.io.*;

import java.lang.*;

import java.util.*;

class Reverse{
   
 public static void main(String args[])
    
   
 {
        
Scanner sc=new Scanner(System.in);
        
String s=sc.nextLine();
        
char[] c=s.toCharArray();
       
 for(int i=c.length-1;i>=0;i--)
        
{
if(c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u')  
{
System.out.print(c[i]);
}
        
}
    
}

}
