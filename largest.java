import java.util.*;
import java.lang.*;

import java.io.*;
class Ideone
{

	
public static void main (String[] args) throws java.lang.Exception
	
{
	
int largest=0;
	
Scanner sc=new Scanner(System.in);
    
int array[]=new int[83];
    
for (int i=0;i<3;i++)
    
{
    
array[i]=sc.nextInt();
   
 }
    
int j=0;
    
        
if(array[j]>array[j+1])
            
 {
                 
	if(array[j]>array[j+2])
                  
	 {
                   
 	largest=array[j];
                    
	}
               
 	else
               
 	{
                   
 	largest=array[j+2];
                
	}
             
}
             
        
else if(array[j]<array[j+1])
        
{
            
	if(array[j+1]>array[j+2])
           
	 {
                
	largest=array[j+1];
            
	}
            	
	else
	{
                
	largest=array[j+2];
            
	}
        
}
	
	System.out.println(largest);    
    

}
}
