package asn6;

import java.util.ArrayList;
import java.util.UUID;

import asn6.Exposure;
/**
 * The DiseaseControlManagerImpl class implements the DiseaseControlManager interface and provides
 * the functionality to manage diseases and patients.
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {

	public ArrayList<Disease> diseases;
	public ArrayList<Patient> patients;
int maxDiseases;
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases <= 0 || maxPatients <= 0) {
			throw new IllegalArgumentException("Max diseases and max patients must be greater than 0.");
		}
		this.maxDiseases = maxDiseases;
		diseases = new ArrayList<Disease>(maxDiseases);
		patients = new ArrayList<Patient>(maxPatients);
	}

	@Override
	public Disease addDisease(String name, boolean infectious) {
		Disease newDisease;

		if (infectious) {
			newDisease = new InfectiousDisease();
		} else {
			newDisease = new NonInfectiousDisease();
		}

		newDisease.setName(name);
		diseases.add(newDisease);
		return newDisease;
//		for (int i = 0; i < diseases.size(); i++) {
//			if (diseases.get(i) == null) {
//				diseases.set(i, newDisease);
//				return newDisease;
//			}
//		}

		//throw new IllegalStateException("No more space to add diseases.");
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for (Disease disease : diseases) {
			if (disease != null && disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		Patient newPatient = new Patient(maxDiseases, maxExposures);
patients.add(newPatient);
return newPatient;
//		for (int i = 0; i < patients.size(); i++) {
//			if (patients.get(i) == null) {
//				patients.set(i, newPatient);
//				newPatient.setFirstName("Patient A");
//				newPatient.setLastName("Patient A");
//				return newPatient;
//			}
//		}

//		throw new IllegalStateException("No more space to add patients.");
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient patient : patients) {
			if (patient != null && patient.getPatientId().equals(patientId)) {
				System.out.println("\n" + patient.getFirstName());
				return patient;
			}
		}
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = null;
		for (Patient p : patients) {
			if (p != null && p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}

		if (patient == null) {
			throw new IllegalArgumentException("Patient with ID " + patientId + " not found.");
		}

		Disease disease = null;
		for (Disease d : diseases) {
			if (d != null && d.getDiseaseId().equals(diseaseId)) {
				disease = d;
				break;
			}
		}

		if (disease == null) {
			throw new IllegalArgumentException("Disease with ID " + diseaseId + " not found.");
		}

		patient.addDiseaseId(diseaseId);
		//patients.add(patient);
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient = null;
		for (Patient p : patients) {
			if (p != null && p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}

		if (patient == null) {
			throw new IllegalArgumentException("Patient with ID " + patientId + " not found.");
		}

		patient.addExposure(exposure);
		//patients.add(patient);
	}

	@Override
	public ArrayList<Disease> getDiseases() {
		return diseases;
	}

	@Override
	public ArrayList<Patient> getPatients() {
		return patients;
	}
}
