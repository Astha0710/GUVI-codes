import java.util.*;

import java.lang.*;

import java.io.*;
class Ideone

{

	
public static void main (String[] args) throws java.lang.Exception
	
{
	
Scanner sc=new Scanner(System.in);
	
char T=sc.next().charAt(0);
	
if(T=='a'||T=='e'||T=='i'||T=='o'||T=='u')
	
{
		
System.out.println("Vowel");
	
}
	
else if(T>='a' && T<='z'|| T>='A' && T<='Z')
	
{
		
System.out.println("Consonant");
	
}
	
else
	
{
		
System.out.println("invalid");
	
}

	
}

}
