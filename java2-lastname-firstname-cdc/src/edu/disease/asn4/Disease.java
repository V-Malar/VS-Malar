package done;

import java.io.Serializable;
import java.util.UUID;

public abstract class Disease {

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
/**
 * The InfectiousDisease class is a subclass of Disease and provides examples of infectious diseases.
 */
class InfectiousDisease extends Disease  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	String[] getExamples() {
		return new String[] { "Influenza", "COVID-19", "Malaria", "Tuberculosis" };
	}
}
/**
 * The NonInfectiousDisease class is a subclass of Disease and provides examples of non-infectious diseases.
 */
class NonInfectiousDisease extends Disease implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	String[] getExamples() {
		return new String[] { "Diabetes", "Cancer", "Heart Disease", "Asthma" };
	}
}