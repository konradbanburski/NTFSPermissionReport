package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileIO {

	//output path
	private File outputFile = new File("disk\\permissions.xml");

	
	
	void output(String data)
	{
		try 
		{
			
			
		//	 PrintWriter out = new PrintWriter(new FileOutputStream(outputFile, true), true );  
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(outputFile, true), "ISO-8859-2");
			
			
			System.out.println("Skanowanie uprawnie�: ");
			out.append(data);
			out.flush();
			out.close();
			
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
