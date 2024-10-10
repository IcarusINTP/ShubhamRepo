package first;

import java.util.HashMap;

public class Hashemap {
public static void main(String[] Args)
{
	HashMap<Integer,Integer> mape = new HashMap<>();
	int[] arr = {4,3,4,5,6,5};
	for(int i=0;i<arr.length; i++)
	{
		if(mape.containsKey(arr[i]))
		{
			mape.put(arr[i], mape.get(arr[i])+1);
		}else{ mape.put(arr[i], 1);}
	}for( int key: mape.keySet())
	{
		System.out.println(key+" "+mape.get(key));
	}
}
}
