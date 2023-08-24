package done;

import done.Exposure;
import done.Patient;
import src.DiseaseAndPatient;
import src.DiseaseFileRepository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import done.Patient;

import done.DiseaseControlManager;

public class ContactTrace {
	DiseaseControlManager diseaseControlManager;
	private Patient patient;
	private LocalDateTime exposureDateTime;
	private boolean exposed;
	 /**
     * Constructor to initialize ContactTrace with a DiseaseControlManager implementation.
     *
     * @param diseaseControlManager The implementation of DiseaseControlManager.
     */
	 public ContactTrace(DiseaseControlManager diseaseControlManager)
	 {
		 this.diseaseControlManager = diseaseControlManager;
	 }
	 /**
	     * Find and return the PatientZero instance based on the provided starting patient.
	     *
	     * @param startingPatient The patient to start the contact tracing from.
	     * @return An instance of PatientZero representing the first patient in the line of exposures.
	     */
	public PatientZero findPatientZero(Patient patient) {
		PatientZero patientZero = new PatientZero();
		Exposure[] findEx = patient.getExposures();
		for (Exposure find: findEx)
		{
			if (find.getExposure().equals("D"))
			{
				if (!find.getDateTime().isBefore(find.getDateTime()))
				{
				patientZero.setExposureDateTime(find.getDateTime());
				patientZero.setPatient(patient);
				patientZero.setExposed(true);
				}
			}
		}
		return patientZero;
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		 DiseaseControlManager d = new DiseaseControlManagerImpl(5, 5);
	        DiseaseFileRepository repository = new DiseaseFileRepository();

	        Disease disease1 = d.addDisease("Covid-19", true);
	        disease1.setDiseaseId(UUID.randomUUID());
	        disease1.setName(disease1.name);

	        Patient patient1 = d.addPatient("John", "Doe", 5, 5);
	        Patient patient2 = d.addPatient("Johny", "Dope", 2, 3);
	        Patient patient3 = d.addPatient("Johny", "Doe", 2, 3);
	        patient1.setPatientId(UUID.randomUUID());

	        Exposure exposure1 = new Exposure("D", LocalDateTime.now());
	        Exposure exposure2 = new Exposure("I", LocalDateTime.now());
	        Exposure exposure3 = new Exposure("I", LocalDateTime.now());
	        Exposure exposure4 = new Exposure("I", LocalDateTime.now());
	        exposure1.setPatientId(patient1.getPatientId());
	        exposure2.setPatientId(patient2.getPatientId());
	        exposure3.setPatientId(patient3.getPatientId());
	        exposure4.setPatientId(patient3.getPatientId());
	        patient1.addExposure(exposure1);
	        patient1.addExposure(exposure2);
	        patient1.addExposure(exposure3);
	        patient1.addExposure(exposure4);

	        d.addDiseaseToPatient(patient1.getPatientId(), disease1.getDiseaseId());
	        d.addExposureToPatient(patient1.getPatientId(), exposure1);

	        Disease disease2 = d.addDisease("FLU", true);
	        disease2.setDiseaseId(UUID.randomUUID());
	        disease2.setName(disease2.name);

	        
	        patient2.setPatientId(UUID.randomUUID());

	        exposure1 = new Exposure("D", LocalDateTime.now());
	        exposure1.setPatientId(patient2.getPatientId());
	        patient2.addExposure(exposure1);

	        d.addDiseaseToPatient(patient2.getPatientId(), disease2.getDiseaseId());
	        d.addExposureToPatient(patient2.getPatientId(), exposure1);

	        Disease disease3 = d.addDisease("FLU", true);
	        disease3.setDiseaseId(UUID.randomUUID());
	        disease3.setName(disease3.name);

	        
	        patient3.setPatientId(UUID.randomUUID());

	        exposure1 = new Exposure("D", LocalDateTime.now());
	        exposure1.setPatientId(patient3.getPatientId());
	        patient3.addExposure(exposure1);

	        d.addDiseaseToPatient(patient3.getPatientId(), disease3.getDiseaseId());
	        d.addExposureToPatient(patient3.getPatientId(), exposure1);

	        DiseaseAndPatient dandp = new DiseaseAndPatient();
	        dandp.setDiseases(new Disease[] { disease1, disease2, disease3 });
	        dandp.setPatients(new Patient[] { patient1, patient2, patient3 });
	        
	        Disease[] diseaseArray = dandp.getDiseases();
	        Patient[] patientArray = dandp.getPatients();
	        String expo = exposure1.getExposure();
	       

	        ArrayList<String> dlist = new ArrayList<>();
	        dlist.add(Arrays.toString(dandp.getDiseases()) + "\n\n" + Arrays.toString(dandp.getPatients()));

	        // Perform assertions to validate the correctness of your data
	        assertNotNull(dlist);
	        assertEquals(1, dlist.size());
	        // Add more assertions as needed
	        
	        DiseaseFileRepository.save(diseaseArray, patientArray);
//	        repository.save(new Disease[] { disease1, disease2, disease3 }, new Patient[] { patient1, patient2, patient3 });
	        System.out.println(dlist);
	        
	        // Print the exposures using an array
	        Exposure[] exposures = patient1.getExposures();
	        System.out.println("Exposures for patient " + patient1.getFirstName() + " " + patient1.getLastName() + ":");
	        for (Exposure exposure11 : exposures) {
	            System.out.println("Exposure Type: " + exposure11.getExposure() + " Date and Time: " + exposure11.getDateTime());
	        }
        // Create a DiseaseControlManager implementation (you need to define this class)
        //DiseaseControlManager diseaseControlManager = new DiseaseControlManagerImpl(2, 2);

        // Create instances of patients and exposures (you need to define these classes)
       // Patient patient1 = new Patient("John", "Doe", 3, 5);
      //  Patient patient2 = new Patient("Jane", "Smith", 3, 5);
        // ... Create more patients and exposures as needed

        // Set disease IDs and exposures for patients (you need to add disease IDs and exposures)
        //patient1.addDiseaseId(UUID.randomUUID());
       // patient2.addDiseaseId(UUID.randomUUID());
        // ... Set more disease IDs and exposures for other patients

        // Create a ContactTrace instance
        ContactTrace contactTrace = new ContactTrace(d);

        // Find patient zero for a specific starting patient
        PatientZero patientZero = contactTrace.findPatientZero(patient1);

        // Display the result
        System.out.println("Earliest exposed patient: " + patientZero.getPatient());
        System.out.println("Exposure date and time: " + patientZero.getExposureDateTime());
        System.out.println("Exposed: " + patientZero.isExposed());
    }
}
