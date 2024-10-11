package first;

import java.util.Scanner;

public class BinraySearch {
public static void main(String[] Args)
{	int arr[]={2,4,5,11,23,45,56,67,89,102,115,145,176};

	binsearch(arr);
	
	
}

static void binsearch(int[] arr)
{
	
	//int arr[]={2,4,5,11,23,45,56,67,89,102,115,145,176};
	int left=0;
	int right=arr.length;
	for(int a:arr){System.out.print(a+" ");}
	Scanner s = new Scanner(System.in);
	System.out.println("\nenter key to search its index");
	int searchkey= s.nextInt();
	s.close();
	int mid = (left + right)/2;int count=0;
	while(left<=right)
	{mid= (left+right)/2;
		if(searchkey==arr[mid])
		{System.out.println(mid+1);++count;break;}
		else if(searchkey>arr[mid])
		{left= mid+1;}
		else{right=mid-1;}
		
	}if(count==0){System.out.println("key not found");}
	
}

}
