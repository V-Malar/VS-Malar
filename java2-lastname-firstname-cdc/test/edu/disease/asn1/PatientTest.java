package edu.disease.asn1;

import org.junit.jupiter.api.Test;

import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {
	@Test
	public void testHashCode() {
		Patient patient1 = new Patient(3, 2);
		patient1.patientId = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");

		Patient patient2 = new Patient(3, 2);
		patient2.patientId = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");

		assertEquals(patient1.hashCode(), patient2.hashCode());
	}

	@Test
	public void testEquals() {
		Patient patient1 = new Patient(3, 2);
		patient1.patientId = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");

		Patient patient2 = new Patient(3, 2);
		patient2.patientId = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");

		assertEquals(patient1, patient2);
	}
}
