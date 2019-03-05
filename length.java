import java.util.*;

import java.lang.*;

import java.io.*;



class Ideone
{

	
public static void main (String[] args) throws java.lang.Exception
	
{
    
int sum=0;
	
Scanner sc=new Scanner(System.in);
	
int N=sc.nextInt();
	
int K=sc.nextInt();
	
int arr[]=new int[N];
	
for(int i=0;i<N;i++)
	
{
	  
arr[i]=sc.nextInt(); 
	
}
	
for(int j=0;j<K;j++)
	
{
	    
sum=sum+arr[j];
	
}
 
System.out.println(sum);   

}

}
