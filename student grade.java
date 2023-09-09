/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Enter your marks(Maths,Physics,Chemistry,Computer Science,Language):");
	    int[] marks=new int[5];
	    for(int i=0;i<5;i++)
	    {
	      marks[i]=scn.nextInt(); 
	     
	    }
	    int tm=0;
	    for(int i=0;i<5;i++)
	    {  if(marks[i]>100||marks[i]<0)
	    {
	        	    System.out.println("Wrong entry");
	        	    break;
	    }
	        tm+=marks[i];
	    }
	    int avg=tm/5;
	    	    System.out.println("Total Marks(out of 500):"+tm);	    
	    	    System.out.println("Average percentage     :"+avg);
	    if(avg<60)
	    {
	        System.out.println("Grade : E");
	    }
	    if(avg>=60&&avg<70)
	    {
	        System.out.println("Grade : D");
	    }
	    if(avg>=70&&avg<80)
	    {
	        System.out.println("Grade : C");
	    }
	if(avg>=80&&avg<90)
	    {
	        System.out.println("Grade : B");
	    }
	    if(avg>=90&&avg<=100)
	    {
	        System.out.println("Grade : A");
	    }
	   
	}
}
