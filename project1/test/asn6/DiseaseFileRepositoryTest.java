package asn6;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import asn6.Disease;
import asn6.DiseaseAndPatient;
import asn6.DiseaseControlManagerImpl;
import asn6.DiseaseFileRepository;
import asn6.Patient;
import asn6.Exposure;

public class DiseaseFileRepositoryTest {

	@Test
	public void testDiseaseFileRepository() throws ClassNotFoundException, IOException {
		DiseaseControlManagerImpl d = new DiseaseControlManagerImpl(5, 5);
		DiseaseFileRepository repository = new DiseaseFileRepository();

		
		Disease disease1 = d.addDisease("Covid-19", true);
		disease1.setDiseaseId(UUID.randomUUID());
		disease1.setName(disease1.name);

		Patient patient1 = d.addPatient("John", "Doe", 2, 3);
		patient1.setPatientId(UUID.randomUUID());

		Exposure exposure = new Exposure(patient1.patientId);
		// exposure.setPatientId(patient1.getPatientId());
		exposure.setDateTime(LocalDateTime.now());
		exposure.setExposureType("I");
		patient1.addExposure(exposure);

		d.addDiseaseToPatient(patient1.getPatientId(), disease1.getDiseaseId());
		d.addExposureToPatient(patient1.getPatientId(), exposure);

		Disease disease2 = d.addDisease("FLU", true);
		disease2.setDiseaseId(UUID.randomUUID());
		disease2.setName(disease2.name);

		Patient patient2 = d.addPatient("Johny", "Dope", 2, 3);
		patient2.setPatientId(UUID.randomUUID());

		exposure = new Exposure(patient2.getPatientId());
		// exposure.setPatientId(patient2.getPatientId());
		exposure.setDateTime(LocalDateTime.now());
		exposure.setExposureType("I");
		patient2.addExposure(exposure);

		d.addDiseaseToPatient(patient2.getPatientId(), disease2.getDiseaseId());
		d.addExposureToPatient(patient2.getPatientId(), exposure);

		Disease disease3 = d.addDisease("FLU", true);
		disease3.setDiseaseId(UUID.randomUUID());
		disease3.setName(disease3.name);

		Patient patient3 = d.addPatient("Johny", "Doe", 2, 3);
		patient3.setPatientId(UUID.randomUUID());

		exposure = new Exposure(patient3.getPatientId());
		// exposure.setPatientId(patient3.getPatientId());
		exposure.setDateTime(LocalDateTime.now());
		exposure.setExposureType("I");
		patient3.addExposure(exposure);

		d.addDiseaseToPatient(patient3.getPatientId(), disease3.getDiseaseId());
		d.addExposureToPatient(patient3.getPatientId(), exposure);

		DiseaseAndPatient dandp = new DiseaseAndPatient();
		dandp.setDiseases(new ArrayList<Disease>(Arrays.asList(disease1, disease2, disease3)));
		dandp.setPatients(new ArrayList<Patient>(Arrays.asList(patient1, patient2, patient3)));

		ArrayList<Disease> diseaseArray = dandp.getDiseases();
		ArrayList<Patient> patientArray = dandp.getPatients();

		ArrayList<Object> dlist = new ArrayList<>();
		dlist.add(Arrays.asList(dandp.getDiseases()));
		dlist.add(Arrays.asList(dandp.getPatients()));

		assertNotNull(dlist);
		assertEquals(2, dlist.size());

		DiseaseFileRepository.save(diseaseArray, patientArray);
		System.out.println(dlist);
	}
}
