package asn6;

import java.util.ArrayList;
import asn6.Patient;
/**
 * A class representing diseases and patients.
 */
public class DiseaseAndPatient {

	private ArrayList<Disease> diseases;
	private ArrayList<Patient> patients;

	public ArrayList<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(ArrayList<Disease> diseases) {
		this.diseases = diseases;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> arrayList) {
		this.patients = arrayList;
	}

}
