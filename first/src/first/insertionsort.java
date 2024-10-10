package first;

import java.util.Random;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = new int[10];
Random rand = new Random();

for( int i = 0; i< num.length; i++)
{ num[i]= rand.nextInt(10);}
	
before(num);	
insertsort(num);
	
	
	}
	
	public static void before(int[] num){
		System.out.print("Before sorting: ");
		for(int i = 0; i< num.length;i++ )
		{System.out.print(num[i]+" ");}
	}
	public static void insertsort(int[] num)
	{
		int pointer= 0;
		int j =0;
	
		for( int i = 1; i < num.length; i++)
		{pointer= num[i];
		j = i-1;
			while(j>=0 && num[j]>pointer)
			{
				num[j+1]=num[j];
				j--;
			}num[j+1]= pointer;
		}System.out.print("\nsorted:         ");
		for( int i = 0; i<num.length; i++)
		{
			System.out.print(num[i]+" ");
		}
		
		
	}
	

}
