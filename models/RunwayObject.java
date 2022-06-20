package models;

public class RunwayObject 
{
	private String name;
	private String desc;
	private int height;
	
	public RunwayObject(String n, String d, int h)
	{
		this.name = n;
		this.desc = d;		
		this.height = h;
	}
	
	//Allows the setting of all parameters of an object
	public void setObjectName(String nameToSet)
	{
		this.name = nameToSet;
	}
	public void setObjectDescription(String descToSet)
	{
		this.desc = descToSet;
	}
	public void setObjectHeight(int heightToSet)
	{
		this.height = heightToSet;
	}
	
	//Allows the retrieval of all attributes of an object
	public String getObjectName()
	{
		return this.name;
	}
	public String getObjectDescription()
	{
		return this.desc;
	}
	public int getObjectHeight()
	{
		return this.height;
	}
	
	public String toString() {
		return this.name;
	}
}
