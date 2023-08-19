package edu.disease.asn1;
import java.util.UUID;

public class Disease {

	UUID diseaseId;
	String name;
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setdiseaseId(UUID id)
	{
		this.diseaseId = id;
	}
	UUID getdiseaseId()
	{
		return diseaseId;
	}
	public String toString()
	{
		return "\nName: " + getName() + " Disease-ID: "+ diseaseId.hashCode();
		
	}
//	public static void main(String args[])
//	{
//		Patient p = new Patient(-4, -5);
//	}
}
