package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Anagram {// words that have same letters example 'cat' and 'tca'
public static void main(String Args[])
{
	
	String[] A= {"cat", "dog", "god", "tca"};
	
	Ana(A);
	
	
	
	
}

private static int[][] Ana(String[] a) {
	HashMap<String,Integer> mape = new HashMap<>();
	HashMap<Integer,Integer> resultstored = new HashMap<>();
	for(int i=0; i<a.length; i++)
	{
		ArrayList<Character> c = new ArrayList<>();
		for( char ch: a[i].toCharArray())
		{
			c.add(ch);
			
			
			
		}
		Collections.sort(c);
		String sortedString = c.toString();
		if(mape.containsKey(sortedString))
		{
			resultstored.put(mape.get(sortedString)+1,i+1);
			
		}
		
		else{
		mape.put(sortedString,i);}
	}
	int l = resultstored.size();
	int[][] result = new int[l][l];
	ArrayList<Integer> interm = new ArrayList<>();
	for(Map.Entry<Integer,Integer> En: resultstored.entrySet())
	{
		interm.add(En.getKey());
		interm.add(En.getValue());
		
		
	}
	for(int i=0;i<l;i++)
	{
		for(int j=0;j<l;j++)
		{
			result[i][j]= interm.get(j);
			System.out.println(interm.get(j)); 
			
		}
	}
	System.out.println(result); return result;
}
	
	
	
}
