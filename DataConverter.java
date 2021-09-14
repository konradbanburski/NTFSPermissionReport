package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DataConverter {

	
	Map<String, String> permissionsMap = new HashMap<>();
	
	DataConverter()
	{
		addKeyToMap();
	}
	
	void addKeyToMap()
	{
		permissionsMap.put("PATH", "");
		permissionsMap.put("READ_NAMED_ATTRS", "");
		permissionsMap.put("EXECUTE", "");
		permissionsMap.put("READ_DATA", "");
		permissionsMap.put("WRITE_NAMED_ATTRS", "");
		permissionsMap.put("DELETE", "");
		permissionsMap.put("READ_ACL", "");
		permissionsMap.put("WRITE_OWNER", "");
		permissionsMap.put("DELETE_CHILD", "");
		permissionsMap.put("WRITE_DATA", "");
		permissionsMap.put("WRITE_ACL", "");
		permissionsMap.put("APPEND_DATA", "");
		permissionsMap.put("WRITE_ATTRIBUTES", "");
		permissionsMap.put("SYNCHRONIZE", "");
		permissionsMap.put("READ_ATTRIBUTES", "");
	}
	
	
	void dataSpliter(Object[] perm, String path) {
		String key = "";
		//for(int i=0; i<perm.length;i++)
		if(!(perm==null))
		{
			for(int i=0; i<perm.length;i++)
			{
				key = perm[i].toString();
				replaceMapValue(key, "x");	
				
			}		
		}
		replaceMapValue("PATH", path);
		key = "";
	}
	
	
	
	void replaceMapValue(String key, String value)
	{
		permissionsMap.replace(key, value);
	}
	
	Map<String, String> getMap()
	{
		return permissionsMap;
	}
	
	ArrayList getMapKey()
	{
		ArrayList<String> mapKeyList = new ArrayList<String>(permissionsMap.keySet());
		return mapKeyList;
	}
	
	ArrayList getMapValue()
	{
		ArrayList<String> mapKeyList = new ArrayList<String>(permissionsMap.values());
		return mapKeyList;
	}
	
}
