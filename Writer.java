package main;

import java.util.ArrayList;

public class Writer {

	XMLCreator xml = new XMLCreator();
	
	
	
	
	String prepearData(int nr, ArrayList key, ArrayList value)
	{
		String txt = xml.startLine(nr);
		
		for(int i = 0; i < 14; i++)
		{
		txt += "\n" + xml.inputData(key.get(i).toString(), value.get(i).toString());
		}
		
		txt += xml.endLine();

		return txt;
		
		
	}
}
