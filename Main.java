package main;

import java.io.File;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) throws IOException {
		
		JOptionPane.showMessageDialog(null, "Start", "Waring", JOptionPane.INFORMATION_MESSAGE );
		
		DataConverter dc = new DataConverter();
		Acl acl = new Acl();
		XMLCreator xml = new XMLCreator();
		FileIO io = new FileIO();
		Writer writer = new Writer();
		PathSearch ps = new PathSearch();

		// start directory
		File currentDir = new File("\\\\disk\\rootDirectory");
		ps.searchDirectory(currentDir);

		
		
		io.output(xml.startDataContainer());
		for(int i = 0; i<ps.pc.getPathList().size();i++)
		{
			String path = ps.pc.getPathList().get(i).toString();
			
			
				
			
		Path file = Paths.get(path);
		System.out.println(file.toString());
		//user name
		dc.dataSpliter(acl.getAclAttr(file, "Domain\\UserName"), path);

		io.output(writer.prepearData(i+1, dc.getMapKey(), dc.getMapValue()));
		System.out.println(i+1 + "/" + ps.pc.getPathList().size() );
		dc.permissionsMap.clear();
		dc.addKeyToMap();
			
		}
		
		
		
		io.output(xml.endDataContainer());
	
		
		
		
		JOptionPane.showMessageDialog(null, "End", "Uwaga", JOptionPane.INFORMATION_MESSAGE );
	}
}
