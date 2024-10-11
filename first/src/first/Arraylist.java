package first;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {// ArrayList and array practice
public static void main(String[]args){
	
	String[]  f1 = new String[4];
	String[] f2 = {"one","two","three","four"};

	ArrayList<String> a1 = new ArrayList<>();
	
		ArrayList<String> a2 = new ArrayList<>(Arrays.asList("john","treat","john"));
		System.out.println(f2[1]);
		System.out.println(a2.get(1));
		System.out.println(f2.length);
		System.out.println(a2.size());
		a2.add("mitch");
		f1[0]="cARL";
		a2.set(0,"Carl");
		a2.remove("john");
		System.out.println(f1);
		System.out.println(a2);
		System.out.println(a1);
}}
