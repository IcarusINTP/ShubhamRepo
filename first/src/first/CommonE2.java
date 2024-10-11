package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonE2 {
	public static void main(String Args[])
	{
int[] N ={1,2,2,1};
int[] M={2,3,1,2};
int[] A=commonArray(N,M);
for(int i=0; i<A.length;i++)
{
	System.out.print(A[i]+" ");
}
}

	private static int[] commonArray(int[] n, int[] m) 
	
	
	{
		HashMap<Integer,Integer> N = new HashMap<>();
		HashMap<Integer,Integer> M = new HashMap<>();
		ArrayList<Integer> answerList = new ArrayList<>();
		
		
		
		
		
		for(int i=0;i<n.length;i++)
		{
			if(N.containsKey(n[i]))
			{
				N.put(n[i], N.get(n[i])+1);
			}
			
			
			else{N.put(n[i],1);}
			
		}
		
		
		for(int i=0;i<m.length;i++)
		{
			if(M.containsKey(m[i]))
			{
				M.put(m[i], M.get(m[i])+1);
			}
			
			
			else{M.put(m[i],1);}
			
		}
		
		HashSet<Integer> commonSet = new HashSet<>();
		
		for(Map.Entry<Integer,Integer> En: N.entrySet() )
				{
			if(M.containsKey(En.getKey()))
					{
				commonSet.add(En.getKey());
				
				
					}
			
				}
		
		for(int i:commonSet)
		{int min = Math.min(M.get(i),N.get(i));
			for( int j=0;j<min;j++)
			{
			answerList.add(i);
			}
		}
		
		int size= answerList.size();
		int answer[] = new int[size];
		for(int i=0;i<size;i++)
		{
			answer[i]=answerList.get(i);
			
		} return answer;
	}
	
	
	
	
	
	
}