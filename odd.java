import java.io.*;

import java.util.*;

import java.lang.*;



class Ideone
{

	
public static void main (String[] args) throws java.lang.Exception
	
{
    
	
Scanner sc=new Scanner(System.in);
	
int N=sc.nextInt();
	
int temp=0;
	
for(int i=1;i<=N;i++)
	
{
	   
 if(N%i==0)
	   
 {
	        
temp++;
	    
}
	
}
	
if(temp==2)
	
{
    
System.out.println("yes");
	
}
	
else{
	
System.out.println("no");
	    
	
}

}

}
