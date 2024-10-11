package first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_BufferReader {
public static void main(String[] args){
	String[] names = { "first name", "second name", "thirdname"};
	try {
		BufferedWriter firstfile = new BufferedWriter(new FileWriter("output.txt"));
		firstfile.write("firstfile text");
		firstfile.write("\nsecond line");
		for(String name: names){firstfile.write("\n" + name);}
		firstfile.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		BufferedReader firstread = new BufferedReader(new FileReader("output.txt"));
		System.out.println(firstread.readLine());
		String line;
		while((line= firstread.readLine())!= null){System.out.println(line);}
		System.out.println(firstread.readLine());
		firstread.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
