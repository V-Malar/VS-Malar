package src;

public class DiseaseAndPatient {

	private Disease[] diseases;
	private Patient[] patients;

	public Disease[] getDiseases() {
		return diseases;
	}

	public void setDiseases(Object object) {
		this.diseases = (Disease[]) object;
	}

	public void setPatients(Object object) {
		this.patients = (Patient[]) object;
	}

	public Patient[] getPatients() {
		return patients;
	}
}
