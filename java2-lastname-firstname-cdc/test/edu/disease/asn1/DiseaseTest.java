package edu.disease.asn1;

import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class DiseaseTest {
    @Test
    public void testSetNameAndGetDiseaseName() {
        Disease disease = new Disease();
        disease.setName("COVID-19");
        assertEquals("COVID-19", disease.getName());
    }

    @Test
    public void testSetAndGetDiseaseId() {
        Disease disease = new Disease();
        UUID uuid = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");
        disease.setdiseaseId(uuid);
        assertEquals(uuid, disease.getdiseaseId());
    }

    @Test
    public void testToString() {
        Disease disease = new Disease();
        disease.setName("Flu");
        UUID uuid = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");
        disease.setdiseaseId(uuid);

        String expectedString = "\nName: Flu Disease-ID: " + uuid.hashCode();
        assertEquals(expectedString, disease.toString());
    }
}
