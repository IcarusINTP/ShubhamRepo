package first;

public class bob {//find number of occurances of "bob" in an string 
public static void main(String Args[])
{
	
	String S="boborbibbibbobbbob";
	int answer=bob(S);
	System.out.println(answer);
	int answer2=puchubob(S);
	System.out.println(answer2);
	
}

public static int bob(String A) {//O(n^2)
	int l = A.length();
	int count=0;
	for(int i=0;i<l;i++)
	{
		for(int j=i+1;j<=l;j++)
		{
			if(A.substring(i, j).equals("bob"))
			{	
				
			count++;
			}
			}
			
	}return count;
}
	public static int puchubob(String A)//O(n)
	{
		int l=A.length();int count=0;
		for(int i=0;i<=l-3;i++)
		{
			if(A.substring(i, i+3).equals("bob")){count++;}
		} return count;
	}
	
	
}

