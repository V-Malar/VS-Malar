package edu.disease.asn3;

import java.util.UUID;

abstract class Disease {

	UUID diseaseId;
	String name;

	abstract String[] getExamples();

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setDiseaseId(UUID id) {
		this.diseaseId = id;
	}

	UUID getDiseaseId() {
		return diseaseId;
	}

	public String toString() {
		return "\nName: " + getName() + " Disease-ID: " + getDiseaseId().hashCode();
	}
}

class InfectiousDisease extends Disease {

	@Override
	String[] getExamples() {
		return new String[] { "Influenza", "COVID-19", "Malaria", "Tuberculosis" };
	}
}

class NonInfectiousDisease extends Disease {

	@Override
	String[] getExamples() {
		return new String[] { "Diabetes", "Cancer", "Heart Disease", "Asthma" };
	}
}
//FileOutputStream fos=new FileOutputStream("myladdu.dat");
//ObjectOutputStream oos=new ObjectOutputStream(fos);
//oos.writeObject(laddu);//saves the laddu in serialized form (in a file)....