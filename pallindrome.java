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
	
int store=N;
	
int r=0;
	
while(N>0)
	
{
r=N%10;
	    
temp=(temp*10)+r;
	    
N=N/10;
	}
	
if(temp==store)

	{
   
 System.out.println("yes");
	
}
	
else{
	
System.out.println("no");
	    
	
}
}
}
