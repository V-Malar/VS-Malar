package Week;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DiseaseControlManagerTest {

    private DiseaseControlManager diseaseControlManager;
    private UUID patientId;
    private UUID covid19DiseaseId;
    private UUID diabetesDiseaseId;

    @Before
    public void setUp() {
        diseaseControlManager = new DiseaseControlManagerImpl(10, 10);
        patientId = UUID.randomUUID();
        covid19DiseaseId = diseaseControlManager.addDisease("COVID-19", true).getDiseaseId();
        diabetesDiseaseId = diseaseControlManager.addDisease("Diabetes", false).getDiseaseId();
    }

    @Test
    public void testAddDiseaseToPatient() {
        Patient patient = diseaseControlManager.addPatient("John", "Doe", 5, 5);
        patient.setPatientId(patientId);

        diseaseControlManager.addDiseaseToPatient(patient.getPatientId(), covid19DiseaseId);
        diseaseControlManager.addDiseaseToPatient(patient.getPatientId(), diabetesDiseaseId);

        UUID[] patientDiseaseIds = patient.getDiseaseIds();
        assertEquals(2, patientDiseaseIds.length);
        assertEquals(covid19DiseaseId, patientDiseaseIds[0]);
        assertEquals(diabetesDiseaseId, patientDiseaseIds[1]);
    }

    @Test
    public void testAddDiseaseToNonexistentPatient() {
        assertThrows(IllegalArgumentException.class,
                () -> diseaseControlManager.addDiseaseToPatient(UUID.randomUUID(), covid19DiseaseId));
    }

    @Test
    public void testAddExposureToNonexistentPatient() {
        Exposure exposure = new Exposure("D", LocalDateTime.now(), UUID.randomUUID());

        assertThrows(IllegalArgumentException.class,
                () -> diseaseControlManager.addExposureToPatient(UUID.randomUUID(), exposure));
    }
}
