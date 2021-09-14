package main;

public class XMLCreator {
		
	String startDataContainer()
	{
		return ""
				+ "<?xml version=\"1.0\" encoding=\"ISO-8859-2\"?>"
				+ "\n<data>";
	}
	
	String endDataContainer()
	{
		return "</data>";
	}
	
	String startLine(int nr)
	{
		String txt = "<line nr=\"" + nr + "\">"; 
		return txt;
	}
	
	String endLine()
	{
		return "</line>";
	}
	
	String inputData(String columnName, String data)
	{
		
		if(data.contains("&"))
		{
			data = data.replace("&", "&amp;");			
		}
		
		
		String txt = "<" + columnName + ">" +
				"\n" + data + "\n" +
				"</" + columnName+ ">";				
		
		return txt;
	}

}
