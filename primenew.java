import java.io.*;

import java.util.*;

import java.lang.*;



class Ideone
{

	
public static void main (String[] args) throws java.lang.Exception
	
{
    
	
Scanner sc=new Scanner(System.in);
	
int N=sc.nextInt();
	
int K=sc.nextInt();
	
	
int i=0;
	
for(i=N+1;i<K;i++)
	
{
	    
int counter=0; 	  
          
for(int num =i; num>=1; num--)
	  
{
             
if(i%num==0)
	     
{
 		
counter = counter + 1;
	     
}
	  
}
	  
if(counter==2)
	  
{
	    
System.out.print(i+" ");
	  
}	

}


}

}
