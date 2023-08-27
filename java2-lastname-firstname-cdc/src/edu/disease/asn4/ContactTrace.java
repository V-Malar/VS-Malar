package asn4;

import asn3.Exposure;
import asn3.Patient;
import asn3.Disease;

import java.time.LocalDateTime;
import java.util.UUID;

import asn3.DiseaseControlManager;
import asn3.DiseaseControlManagerImpl;
/**
 * The ContactTrace class is responsible for tracing the earliest exposed patient
 * based on their exposure type and date/time properties.
 */
public class ContactTrace {
	DiseaseControlManagerImpl diseaseControlManager;
        /**
        * Constructor to initialize the ContactTrace with a DiseaseControlManager.
        *
        * @param diseaseControlManagerImpl The DiseaseControlManager implementation
        */
	public ContactTrace(DiseaseControlManager diseaseControlManagerImpl) {
		this.diseaseControlManager = (DiseaseControlManagerImpl) diseaseControlManagerImpl;
	}
        /**
        * Finds the earliest exposed patient based on exposure type and date/time properties.
        *
        * @param patient The patient for whom to find the earliest exposed patient
        * @return The earliest exposed patient information encapsulated in a PatientZero object
        */
	public PatientZero findPatientZero(Patient patient) {
		Exposure[] exposure = patient.getExposures();
		Exposure expoone = null; // Initialize expoone as null
		boolean exposed = false;
		PatientZero patientchange = new PatientZero();

		for (Exposure ex : exposure) {
			if (ex.getExposureType().equals("D")) {
				if (expoone == null || ex.getDateTime().isBefore(expoone.getDateTime())) {
					expoone = ex; // Update expoone if this exposure is earlier
					System.out.println(expoone);
				}
				exposed = true;
			}
		}

		if (expoone != null) {
			Patient p = diseaseControlManager.getPatient(expoone.getPatientId());
			patientchange.setPatient(p);
			patientchange.setExposureDateTime(expoone.getDateTime());
			patientchange.setExposed(true);
		} else {
			//// Recursively check exposures in previous patients
			if (!exposed) {
				Patient[] previousPatients = diseaseControlManager.getPatients();
				for (Patient prevPatient : previousPatients) {
					if (!prevPatient.getPatientId().equals(patient.getPatientId())) {
						PatientZero patientZero = findPatientZero(prevPatient);
						if (patientZero.isExposed()) {
							return patientZero;
						}
					}
				}
			}
		}

		return patientchange;
	}
	
	/**
    	* Main method to demonstrate the ContactTrace class functionality.
     	*
     	* @param args Command-line arguments (not used)
    	*/
	public static void main(String[] args) {

		DiseaseControlManagerImpl diseaseControlManager = new DiseaseControlManagerImpl(10, 10);

		// Add diseases and patients
		Disease corona = diseaseControlManager.addDisease("Corona", true);
		Disease flu = diseaseControlManager.addDisease("Flu", true);

		Patient coronaA = diseaseControlManager.addPatient("K", "A", 2, 2);
		Patient fluB = diseaseControlManager.addPatient("F", "F", 2, 2);

		// Set patient IDs and names
		coronaA.setPatientId(UUID.randomUUID());
		fluB.setPatientId(UUID.randomUUID());

		coronaA.setFirstName("PatientA");
		coronaA.setLastName("LastA");

		fluB.setFirstName("PatientB");
		fluB.setLastName("LastB");

		// Create exposures
		Exposure coronaC1 = new Exposure(coronaA.getPatientId());
		Exposure coronaC2 = new Exposure(coronaA.getPatientId());
		coronaC1.setDateTime(LocalDateTime.now().minusDays(1));
		coronaC2.setDateTime(LocalDateTime.now().minusDays(27));
		coronaC1.setExposureType("D");
		coronaC2.setExposureType("D");
		coronaA.setExposures(new Exposure[] { coronaC1, coronaC2 });

		Exposure fluB1 = new Exposure(fluB.getPatientId());
		Exposure fluB2 = new Exposure(fluB.getPatientId());
		fluB1.setDateTime(LocalDateTime.now().minusDays(1));
		fluB2.setDateTime(LocalDateTime.now().minusDays(20));
		fluB1.setExposureType("I");
		fluB2.setExposureType("D");
		// fluB2.setExposureType("I");
		// Interesting line
		fluB.setExposures(new Exposure[] { fluB1, fluB2 });

		ContactTrace ct = new ContactTrace(diseaseControlManager);

		// Find earliest exposed patient for fluB
		PatientZero earliestExposedPatientFlu = ct.findPatientZero(fluB);
		if (earliestExposedPatientFlu.isExposed()) {
			System.out.println(
					"Earliest exposed Patient for fluB: " + earliestExposedPatientFlu.getPatient().getFirstName() + " "
							+ earliestExposedPatientFlu.getExposureDateTime());
		} else {
			System.out.println("No exposed Patient found for fluB.");
		}

		// Find earliest exposed patient for coronaA
		PatientZero earliestExposedPatientCorona = ct.findPatientZero(coronaA);
		if (earliestExposedPatientCorona.isExposed()) {
			System.out.println(
					"Earliest exposed Patient for coronaA: " + earliestExposedPatientCorona.getPatient().getFirstName()
							+ " " + earliestExposedPatientCorona.getExposureDateTime());
		} else {
			System.out.println("No exposed Patient found for coronaA.");
		}
	}
}
