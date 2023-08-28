package asn2;

import org.junit.Before;
import org.junit.Test;
import asn1.Exposure;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DiseaseControlManagerTest {

	private DiseaseControlManager diseaseControlManager;
	private UUID patientId;
	private UUID covid19DiseaseId;
	Disease covid19, diabetes, lBP;
	Patient patient1, patient2, patient3;

	@Before
	public void setUp() {
		diseaseControlManager = new DiseaseControlManagerImpl(10, 10);
		// patientId = UUID.randomUUID();
	}

	@Test
	public void testAddDiseaseToPatient() {

		covid19 = diseaseControlManager.addDisease("COVID-19", true);
		covid19.setDiseaseId(UUID.randomUUID());
		diabetes = diseaseControlManager.addDisease("Diabetes", false);
		diabetes.setDiseaseId(UUID.randomUUID());
		lBP = diseaseControlManager.addDisease("LBP", false);
		lBP.setDiseaseId(UUID.randomUUID());

		patient1 = diseaseControlManager.addPatient("John", "Doe", 5, 5);
		patient2 = diseaseControlManager.addPatient("Jonhy", "Dow", 5, 5);
		patient3 = diseaseControlManager.addPatient("Sherlock", "Homes", 3, 3);

		patient1.setPatientId(UUID.randomUUID());
		patient2.setPatientId(UUID.randomUUID());
		patient3.setPatientId(UUID.randomUUID());

		diseaseControlManager.addDiseaseToPatient(patient1.getPatientId(), covid19.getDiseaseId());
		diseaseControlManager.addDiseaseToPatient(patient2.getPatientId(), diabetes.getDiseaseId());
		diseaseControlManager.addDiseaseToPatient(patient3.getPatientId(), lBP.getDiseaseId());

		diseaseControlManager.addDiseaseToPatient(patient2.getPatientId(), diabetes.getDiseaseId());
		diseaseControlManager.addDiseaseToPatient(patient2.getPatientId(), covid19.getDiseaseId());

		Exposure exposure1 = new Exposure(patient1.getPatientId());
		exposure1.setPatientId(patient1.getPatientId());
		exposure1.setExposureType("D");
		exposure1.setDateTime(LocalDateTime.now().plusHours(1));
		Exposure exposure2 = new Exposure(patient2.getPatientId());
		exposure2.setPatientId(patient2.getPatientId());
		exposure2.setExposureType("I");
		exposure2.setDateTime(LocalDateTime.now());
		Exposure exposure3 = new Exposure(patient3.getPatientId());
		exposure3.setPatientId(patient3.getPatientId());
		exposure3.setExposureType("I");
		exposure3.setDateTime(LocalDateTime.now().plusHours(2));

		ArrayList<String> dList = new ArrayList<>();
		dList.add(covid19 + ", " + exposure1);
		dList.add(diabetes + "," + exposure2);
		System.out.println("Disease Manager Information:");
		System.out.println(dList);

		ArrayList<Patient> pList = new ArrayList<>();
		pList.add(patient1);
		pList.add(patient2);
		pList.add(patient3);
		System.out.println("Patient Information:");
		System.out.println(pList);

		assertEquals(3, pList.size());
		assertEquals(patient1.getPatientId(), pList.get(0).getPatientId());
		assertEquals(patient2.getPatientId(), pList.get(1).getPatientId());
	}

	@Test
	public void testAddDiseaseToNonexistentPatient() {
		assertThrows(IllegalArgumentException.class,
				() -> diseaseControlManager.addDiseaseToPatient(UUID.randomUUID(), covid19DiseaseId));
	}

	@Test
	public void testAddExposureToNonexistentPatient() {
		patientId = UUID.randomUUID();
		Exposure exposure = new Exposure(patientId);
		exposure.setPatientId(patientId);

		assertThrows(IllegalArgumentException.class,
				() -> diseaseControlManager.addExposureToPatient(exposure.getPatientId(), exposure));
	}
}