package src;
/**
 * A class representing diseases and patients.
 */
public class DiseaseAndPatient {

	private Disease[] diseases;
	private Patient[] patients;

	public Disease[] getDiseases() {
		return diseases;
	}
/**
     * Get an array of diseases.
     *
     * @return An array of diseases.
     */
	public void setDiseases(Object object) {
		this.diseases = (Disease[]) object;
	}
 /**
     * Set the array of patients.
     *
     * @param patients An array of patients to set.
     */
	public void setPatients(Object object) {
		this.patients = (Patient[]) object;
	}
 /**
     * Get an array of patients.
     *
     * @return An array of patients.
     */
	public Patient[] getPatients() {
		return patients;
	}
}
