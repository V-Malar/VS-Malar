package asn4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import asn3.Disease;
import asn3.DiseaseControlManagerImpl;
import asn3.Exposure;
import asn3.Patient;

public class ContactTraceTest {

	private DiseaseControlManagerImpl diseaseControlManager;

	@Before
	public void setUp() {
		diseaseControlManager = new DiseaseControlManagerImpl(10, 10);
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

	@Test
	public void testEarliestExposedPatientForFluB() {

		ContactTrace ct = new ContactTrace(diseaseControlManager);

		Patient fluB = diseaseControlManager.addPatient("F", "F", 2, 2);
		// Find earliest exposed patient for fluB
		PatientZero earliestExposedPatientFlu = ct.findPatientZero(fluB);
		if (earliestExposedPatientFlu.isExposed()) {
			System.out.println(
					"Earliest exposed Patient for fluB: " + earliestExposedPatientFlu.getPatient().getFirstName() + " "
							+ earliestExposedPatientFlu.getExposureDateTime());
		} else {
			System.out.println("No exposed Patient found for fluB.");
		}
		// assertNotNull(earliestExposedPatientFlu);
		assertEquals("PatientB", earliestExposedPatientFlu.getPatient().getFirstName());
		// Add more assertions if needed
	}

	@Test
	public void testEarliestExposedPatientForCoronaA() {
		ContactTrace ct = new ContactTrace(diseaseControlManager);
		Patient coronaA = diseaseControlManager.getPatients()[0]; // Assuming coronaA is the first patient
		PatientZero earliestExposedPatientCorona = ct.findPatientZero(coronaA);

		assertNotNull(earliestExposedPatientCorona);
		assertEquals("PatientA", earliestExposedPatientCorona.getPatient().getFirstName());
		// Add more assertions if needed
	}
}
