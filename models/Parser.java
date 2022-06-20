package models;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser 
{
	String gName;
	String gDesc;
	int gHeight;
	ArrayList<RunwayObject> runwayObjectHolder = new ArrayList<RunwayObject>(10);
	
	public Parser()
	{
		//demoAnObject();
	}
	public void parseObjectName(String name)
	{		
		gName = name;
	}
	public void parseObjectDesc(String desc)
	{		
		gDesc = desc;
	}
	public void parseObjectHeight(int height)
	{
		gHeight = height;
	}
	
	public String gName()
	{
		return gName;
	}
	public String gDesc()
	{
		return gDesc;
	}
	public int gHeight()
	{
		return gHeight;		
	}
	/*
	public void demoAnObject()
	{
		RunwayObject importer = new RunwayObject(gName(), gDesc(), gHeight());	
		if(importer!=null)
		{
			runwayObjectHolder.add(importer);
			for(int i = 0; i<runwayObjectHolder.size(); i++)
			{
				System.out.println(runwayObjectHolder.get(i));
			}			
		}
	}
	*/
	
	public static void main(String[] args) 
	{
		
		Parser workForce = new Parser();
		DocumentBuilderFactory parser = DocumentBuilderFactory.newInstance();
		try 
		{
			DocumentBuilder builder = parser.newDocumentBuilder();
			Document obstacleDocument = builder.parse("obstacles.xml");
			
			//Generates a list 'objects' according to the XML Tag.
			NodeList obstacleList = obstacleDocument.getElementsByTagName("object");
			
			//Cycles through each unique object defined in the XML file
			for(int i = 0; i<obstacleList.getLength(); i++)
			{
				//Retrieves each entry (unique object) from the XML, and stores this in Node
				Node currentlyExaminedObject = obstacleList.item(i);
				if(currentlyExaminedObject.getNodeType() == Node.ELEMENT_NODE)
				{
					//Casts each scanned object as an Element for scanning
					Element object = (Element) currentlyExaminedObject;
					
					//Stores temporarily the id of the currently scanned object
					String id = object.getAttribute("id");
					
					//Creates a node list containing the attributes of a scanned object
					NodeList objectAttributes = object.getChildNodes();
					
					//Cycles through the list of attributes for an individual object in the XML
					for(int j = 0; j<objectAttributes.getLength(); j++)
					{
						//Stores each attribute temporarily (For each object) in this Node
						Node tempAttributeStorer = objectAttributes.item(j);
						
						//Checks each attribute is of type Element, before printing for each object
						if(tempAttributeStorer.getNodeType() == Node.ELEMENT_NODE)
						{		
							Element temp =(Element) tempAttributeStorer;
							//System.out.println("Object" + id + ":" + temp.getTagName() + "=" + temp.getTextContent());
							if(temp.getTagName() == "name")
							{
								String tempName = temp.getTextContent();
								workForce.parseObjectName(tempName);
							}
							if(temp.getTagName() == "description")
							{
								String tempDesc = temp.getTextContent();
								workForce.parseObjectDesc(tempDesc);
							}
							if(temp.getTagName() == "height")
							{
								int tempHeight = Integer.parseInt(temp.getTextContent());		
								workForce.parseObjectHeight(tempHeight);
							}		
							//workForce.demoAnObject();
						}
					}
				}
			}			
		} 
		catch (ParserConfigurationException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}	
}
