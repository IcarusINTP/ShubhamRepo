package first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonElements
{
public static void main(String[] Args)
{
	int[] arrN={1,2,2,1};
	int[] arrM={2,3,1,2,13};
	HashMap<Integer,Integer> N = new HashMap<>();
	HashMap<Integer,Integer> M = new HashMap<>();
	HashMap<Integer,Integer> C =new HashMap<>();
	for(int i=0;i<arrN.length;i++)
	{
		if(N.containsKey(arrN[i]))
		{
			N.put(arrN[i],N.get(arrN[i])+1);
		}
		else {N.put(arrN[i],1);}
	}
	
	for(int i=0;i<arrM.length;i++)
	{
		if(M.containsKey(arrM[i]))
		{
			M.put(arrM[i],M.get(arrM[i])+1);
		}
		else {M.put(arrM[i],1);
		
		}
		
	}
	Set<Integer> setN= N.keySet();
	Set<Integer> setM= M.keySet();
	Set<Integer> Ckey= new HashSet<>();
	
	for(int i:setN)
	{
		for(int j:setM)
		{
			if(i==j){Ckey.add(i);}
		}
	}
	int[] result = new int[arrM.length + arrN.length];int count=0;
for(int i: Ckey)
{
	int j = M.get(i);
	int k= N.get(i);
	C.put(i,Math.min(j,k));
	
}

for(Map.Entry En: C.entrySet())
{int j= (int) En.getValue();
	for(int i=0;i<j;i++)
	{System.out.print(En.getKey()+" ");
	result[count]= (int) En.getKey();count++;
	
	
	}
	
	
}for(int i:result)
{
	System.out.print(i);
}


}

}
