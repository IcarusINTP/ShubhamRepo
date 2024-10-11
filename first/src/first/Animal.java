package first;

public class Animal {  //overloading practice 
	void speak(){System.out.println("loud animal noises :3");}
}
class dog extends Animal{
void speak(){System.out.println("woof");}

}

class cat extends Animal{
void speak(){System.out.println("meow");}}

/*class test
{
	public static void main(String[] Args)
	{dog luca = new dog();
	cat mrow= new cat();
	luca.speak();
	mrow.speak();
	
	
	}
}*/