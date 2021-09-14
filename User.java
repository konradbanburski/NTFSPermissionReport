package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class User {

	
	Map<String, String> map = new TreeMap<>();
	String name = "";


    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	void showUserPermissions()
	{
		System.out.println(name);
		for (Map.Entry<String, String> entry : map.entrySet()) {
		     System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	

	
}
