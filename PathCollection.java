package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class PathCollection {

	private ArrayList<String> pathList = new ArrayList();


	public ArrayList<String> getPathList() {
		return pathList;
	}

	public void setPathList(ArrayList pathList) {
		this.pathList = pathList;
	}

	public void addLastElement(String path)
	{
		pathList.add(path);
	}

	public void deleteFirstElement(int i)
	{
		pathList.remove(i);
	}
	

	public void showList()
	{
		for(String element: pathList)

		{
			System.out.println(element);
		}
	}	

}


