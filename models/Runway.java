package models;
/*
 ****TORA - Take off Run Available****

TORA is defined as length of runway suitable for normal operations. 
It need not always equal to LDA (landing distance available). 
TORA doesn’t include Stopway or Clearway.
 
 ****TODA - Take off Distance Available****

TODA is the length of runway plus any clearway if available. 
In case no clearway exists, TODA is same as TORA. 
TODA includes ground as well as air segments.
 
 ****ASDA Accelerate - Stop Distance Available****

ASDA is used for calculation of V1.
It is defined as sum of LDA/TORA (as applicable) and Stopway.
In case take off is aborted the aircraft can be brought to a stop either on the runway or on Stopway.
ASDA must not be used as TORA.
  
 ****LDA - Landing Distance Available****

LDA is the runway length declared available and suitable for landing an airplane.
*/

public class Runway 
{
	private String name;
	private int tora;
	private int toda;
	private int asda;
	private int lda;
	
	public Runway (String name, int t1, int t2, int a, int l)
	{
		this.name = name;
		this.tora = t1;
		this.toda = t2;
		this.asda = a;
		this.lda = l;
	}
	
	//Allows the parameters of a Runway to be set
	public void setTORA(int setter)
	{
		this.tora = setter;
	}
	public void setTODA(int setter)
	{
		this.toda = setter;
	}
	public void setASDA(int setter)
	{
		this.asda = setter;
	}
	public void setLDA(int setter)
	{
		this.lda = setter;
	}
	
	//Allows the retrieval of Runway attributes
	public String getName()
	{
		return this.name;
	}
	public int getTORA()
	{
		return this.tora;
	}
	public int getTODA()
	{
		return this.toda;
	}
	public int getASDA()
	{
		return this.asda;
	}
	public int getLDA()
	{
		return this.lda;
	}
	
	public String toString() {
		return this.name;
	}
	
}
