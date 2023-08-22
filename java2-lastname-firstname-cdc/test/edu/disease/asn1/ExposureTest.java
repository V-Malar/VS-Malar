package edu.disease.asn1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

public class ExposureTest {
	private Exposure exposure;

	@Before
	public void setUp() {
		final UUID uuid = UUID.randomUUID();
		exposure = new Exposure(uuid);
		exposure.setDateTime(LocalDateTime.now());
		exposure.setExposureType("D");
	}

	@Test
	public void testExposurePostiveScenario() {
		assertNotNull(exposure.toString());
		assertNotNull(exposure.getDateTime());
		assertNotNull(exposure.getPatientId());
		assertEquals("D", exposure.getExposureType());
		assertNotNull(exposure.hashCode());
		final Exposure exposureObj = exposure;
		assertTrue(exposure.equals(exposureObj));
		assertTrue(exposure.equals(exposure));
		assertFalse(exposure.equals(null));
		final Exposure exposureObjEquals = new Exposure(exposure.getPatientId());
		exposureObjEquals.setExposureType("I");
		exposureObjEquals.setDateTime(exposure.getDateTime());
		System.out.println(exposure);
		System.out.println(exposureObjEquals);
		assertThrows(NullPointerException.class, () -> exposure.setPatientId(null));
        assertThrows(NullPointerException.class, () -> exposureObjEquals.setDateTime(null));
		assertFalse(exposure.equals(exposureObjEquals));
		assertFalse(exposure.equals(null));
		assertFalse(exposure.equals(exposureObjEquals));
		exposure.setPatientId(exposure.getPatientId());
		exposureObjEquals.setDateTime(exposure.getDateTime());
		System.out.println(exposure);
		System.out.println(exposureObjEquals);
		assertFalse(exposure.equals(exposureObjEquals));
		
	}

	@Test
    public void testInvalidExposureType() {
        Exposure exposure = new Exposure(UUID.randomUUID());
        
        // Set an invalid exposure type, expecting an exception
        assertThrows(IllegalArgumentException.class, () -> exposure.setExposureType("X"));
        assertThrows(IllegalArgumentException.class, () -> exposure.setExposureType("Z"));
    }
	
}
