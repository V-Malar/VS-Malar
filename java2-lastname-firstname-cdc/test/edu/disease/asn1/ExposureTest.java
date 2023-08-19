package edu.disease.asn1;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class ExposureTest {
	@Test
	public void testGetPatientID() {
		UUID expectedUUID = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");
		LocalDateTime dateTime = LocalDateTime.now();

		Exposure exposure = new Exposure("D", dateTime);
		exposure.patientId = expectedUUID;

		assertEquals(expectedUUID, exposure.getPatientID());
	}

	@Test
	public void testSetAndGetExposure() {
		LocalDateTime dateTime = LocalDateTime.now();

		Exposure exposure = new Exposure("D", dateTime);
		exposure.setExposure("I");

		assertEquals("I", exposure.getExposure());
	}

	@Test
	public void testToString() {
		LocalDateTime dateTime = LocalDateTime.now();

		Exposure exposure = new Exposure("D", dateTime);
		exposure.patientId = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");
		exposure.setExposure("I");

		String expectedString = "PatientID: 123e4567-e89b-12d3-a456-426655440000 Exposure Type: I Date and Time: "
				+ dateTime;
		assertEquals(expectedString, exposure.toString());
	}
}
