package edu.disease.asn2;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class PatientTest {

	@Test
	public void testPatientSorting() {
		// Create a TreeSet with a custom comparator
		Set<Patient> patientSet = new TreeSet<>(Comparator.comparing(Patient::getLastName));

		// Create patients and add them to the TreeSet
		Patient patient1 = new Patient(3, 4);
		patient1.setFirstName("John");
		patient1.setLastName("Doe");
		patient1.setMaxDiseases(3);
		patient1.setMaxExposures(4);

		Patient patient2 = new Patient(3, 4);
		patient2.setFirstName("Alice");
		patient2.setLastName("Smith");
		patient2.setMaxDiseases(3);
		patient2.setMaxExposures(4);

		// Add patients to the TreeSet
		patientSet.add(patient1);
		patientSet.add(patient2);

		// Convert the TreeSet to an array for validation
		Patient[] patientsArray = patientSet.toArray(new Patient[0]);

		// Validate the sorting order
		assertEquals("Doe", patientsArray[0].getLastName());
		assertEquals("Smith", patientsArray[1].getLastName());
	}
}
