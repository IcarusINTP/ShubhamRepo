package first;

public class fibpractice {
public static void main(String Args[])
{
	int n=5;
	int answer= fib(n);
	System.out.println(answer);
}
public static int fib(int n)
{
	
	int answer;
	
	
	if(n==1){return 0;}
	if(n==2){return 1;}
	//if(n==3){return 1;}
	
	else{answer= fib(n-1)+fib(n-2);return answer;}
}
}
