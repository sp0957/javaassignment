package AssignmentJavaa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MultipleCatchBlock {
public static void main(String[] args) {
	
 
	
	
	try {
		File file =new File("file4.txt");
		FileOutputStream fos=new FileOutputStream(file /*"file.txt",true*/);// true is use for pachal vala data erase na thay etle 
		String msg="\nthis class is runing in tts";
		byte[]string =msg.getBytes();
		fos.write(string);
		fos.flush();
		fos.close();
		System.out.println(" data is writtrn into the file...");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
