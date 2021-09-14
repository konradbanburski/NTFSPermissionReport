package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;


public class Acl {
	
	
	Acl()
	{
		for(int i=0;i<perm.length;i++)
		{
			perm[i] = "";
		}
	}
	
	private Object[] perm = new Object[13];
	
			
	
	
	Object[] getAclAttr(Path file, String name) {
		try
		{
			AclFileAttributeView aclFileAttributes = Files.getFileAttributeView(
		    file, AclFileAttributeView.class);
	
			for (AclEntry aclEntry : aclFileAttributes.getAcl()) 
			{
				if(aclEntry.principal().getName().equals(name))
				{		    			    	
					return aclPermissionsToArray(aclEntry);					 
				}		
			}
		}		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	Object[] aclPermissionsToArray(AclEntry aclEntry) {
		return perm = aclEntry.permissions().toArray();
	}
} 


// System.out.println("\n" + aclEntry.principal().getName() + ":");
	   //name = aclEntry.principal().toString();	    
			 //   pg.permissionSpliter(perm);
			 //   Map<String, String> pMap = new TreeMap<>();
			 //   pMap = pg.getMap();
			//	for (Map.Entry<String, String> entry : pMap.entrySet()) {
			//	     System.out.println(entry.getKey() + " " + entry.getValue());
				     
			    

			 /*  
			    
			    User user = new User(name, pMap);
			   // user.showUserPermissions();
			    System.out.println(user.getName());
			   // System.out.println(user.getMap().toString());
		*/