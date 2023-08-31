package asn6;

import asn3.Exposure;
import java.util.ArrayList;
import java.util.UUID;


/**
 * The DiseaseControlManager interface defines methods for managing diseases and patients in an application.
 */
public interface DiseaseControlManager{

	Disease addDisease(String name, boolean infectious);
	// Adds a new disease to a application

	Disease getDisease(UUID diseaseId);
	// Returns the disease or null if not found

	Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);
	// Adds a new patient to the application. Supply the max parameters to the
	// Patient constructor

	Patient getPatient(UUID patientId);
	// Returns the patient or null if not found

	void addDiseaseToPatient(UUID patientId, UUID diseaseId);
	// Adds a disease to a patient

	void addExposureToPatient(UUID patientId, Exposure exposure);
	// Adds an Exposure instance to a patient
	
	ArrayList<Disease> getDiseases();
	// Returns the diseases array
	
	ArrayList<Patient> getPatients();

}
