package edu.disease.asn1;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ExposureTest {

    @Test
    public void testValidExposureType() {
        LocalDateTime dateTime = LocalDateTime.now();
        UUID patientId = UUID.randomUUID();

        Exposure exposure = new Exposure("D", dateTime, patientId);

        assertEquals("D", exposure.getExposure());
    }

    @Test
    public void testInvalidExposureType() {
        LocalDateTime dateTime = LocalDateTime.now();
        UUID patientId = UUID.randomUUID();

        try {
            Exposure exposure = new Exposure("X", dateTime, patientId);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testExposureToString() {
        LocalDateTime dateTime = LocalDateTime.now();
        UUID patientId = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");

        Exposure exposure = new Exposure("I", dateTime, patientId);

        String expectedString = "PatientID: " + patientId.hashCode() + " Exposure Type: I Date and Time: " + dateTime;
        assertEquals(expectedString, exposure.toString());
    }
}
