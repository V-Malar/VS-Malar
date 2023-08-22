package src;

/**
 * A class representing diseases and patients.
 */
public class DiseaseAndPatient {

	private Disease[] diseases;
	private Patient[] patients;

	/**
	 * Get an array of diseases.
	 *
	 * @return An array of diseases.
	 */
	public Disease[] getDiseases() {
		return diseases;
	}

	/**
	 * Set the array of diseases.
	 *
	 * @param diseases An array of diseases to set.
	 */
	public void setDiseases(Object object) {
		this.diseases = (Disease[]) object;
	}

	/**
	 * Set the array of patients.
	 *
	 * @param object An array of patients to set.
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
