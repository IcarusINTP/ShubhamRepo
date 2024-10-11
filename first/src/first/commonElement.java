package first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class commonElement {
	

public static void main(String[] Args)
{
	commonE();
}



static void commonE()
 {
    HashMap<Integer,Integer> mape= new HashMap<>();
 
	 Random R = new Random();
	 int N=0;int M=0;int count=0;
	 try
	 
	{
	System.out.println("enter the length of first array");
	Scanner s = new Scanner(System.in);
	 N = s.nextInt();
	System.out.println("enter the length of second array");
 M = s.nextInt();s.close();
 }
	 
 catch(Exception e){System.out.println("enter length in numericals");}
	 if(N>=M)
	 {
	 int[] arrN = new int[N];
 int[] arrM = new int[N];
 System.out.println("randomly generated first array:");
 for(int i=0;i<N;i++)
 {
	 arrN[i] = R.nextInt(6);
	 System.out.print(arrN[i]+" ");
 }
 System.out.println("\nrandomly generated second array:");
 for(int i=0;i<N;i++)
 {
	 if(i<M){arrM[i] = R.nextInt(6);}
	 else{arrM[i]= 0;}
	 System.out.print(arrM[i]+" ");
	 
 }

	 
	 }
	 else if(M>N)
	 {
		 
		 int[] arrN = new int[M];
		 int[] arrM = new int[M];
		 System.out.println("randomly generated first array:");
		 for(int i=0;i<M;i++)
		 {
			if(i<N) {arrN[i] = R.nextInt(6);}
			else {arrN[i]= 0;}
			 System.out.print(arrN[i]+" ");}
		 
	 
		 System.out.println("\nrandomly generated second array:");
		 for(int i=0;i<M;i++)
		 {
			 arrM[i] = R.nextInt(6);
			 System.out.print(arrM[i]+" ");
			
		 } 
		 
	 }
 
	 
 }


}
	
	
	

