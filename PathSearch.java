package main;

import java.io.File;
import java.io.IOException;


public class PathSearch {

	
	int num = 0;
	PathCollection pc = new PathCollection();

	public void searchDirectory(File dir) {
		
		File next = null;
		
			try 
			{
			File[] files = dir.listFiles();
		
			
			for (File file : files) {
			if (file.isDirectory()) 
				{
					System.out.println("Skanowanie: " + num + "  " + file.getCanonicalPath());				
					String path = file.getCanonicalPath();					
					next = file;
					
					pc.addLastElement(path);
					num++;
					searchDirectory(file);				
				} 

			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			searchDirectory(next);		
		}

	}

	

	private void addPathToList(File file) throws IOException {
		pc.addLastElement(file.getCanonicalPath());
	}
	
}
