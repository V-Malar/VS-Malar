package src;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

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

        Exposure exposure = new Exposure("D", LocalDateTime.now());
        exposure.setPatientId(patient1.getPatientId());
        patient1.addExposure(exposure);

        d.addDiseaseToPatient(patient1.getPatientId(), disease1.getDiseaseId());
        d.addExposureToPatient(patient1.getPatientId(), exposure);

        Disease disease2 = d.addDisease("FLU", true);
        disease2.setDiseaseId(UUID.randomUUID());
        disease2.setName(disease2.name);

        Patient patient2 = d.addPatient("Johny", "Dope", 2, 3);
        patient2.setPatientId(UUID.randomUUID());

        exposure = new Exposure("D", LocalDateTime.now());
        exposure.setPatientId(patient2.getPatientId());
        patient2.addExposure(exposure);

        d.addDiseaseToPatient(patient2.getPatientId(), disease2.getDiseaseId());
        d.addExposureToPatient(patient2.getPatientId(), exposure);

        Disease disease3 = d.addDisease("FLU", true);
        disease3.setDiseaseId(UUID.randomUUID());
        disease3.setName(disease3.name);

        Patient patient3 = d.addPatient("Johny", "Doe", 2, 3);
        patient3.setPatientId(UUID.randomUUID());

        exposure = new Exposure("D", LocalDateTime.now());
        exposure.setPatientId(patient3.getPatientId());
        patient3.addExposure(exposure);

        d.addDiseaseToPatient(patient3.getPatientId(), disease3.getDiseaseId());
        d.addExposureToPatient(patient3.getPatientId(), exposure);

        DiseaseAndPatient dandp = new DiseaseAndPatient();
        dandp.setDiseases(new Disease[] { disease1, disease2, disease3 });
        dandp.setPatients(new Patient[] { patient1, patient2, patient3 });
        
       // Disease[] diseaseArray = new Disease[] { disease1, disease2, disease3 };

        ArrayList<String> dlist = new ArrayList<>();
        dlist.add(Arrays.toString(dandp.getDiseases()) + "\n\n" + Arrays.toString(dandp.getPatients()));

        // Perform assertions to validate the correctness of your data
        assertNotNull(dlist);
        assertEquals(1, dlist.size());
        // Add more assertions as needed
        
//        repository.init("D:\\CPS\\LWUG\\workspace\\java2-lastname-firstname-cdc\\src\\edu\\disease\\asn3");
//        repository.save(new Disease[] { disease1, disease2, disease3 }, new Patient[] { patient1, patient2, patient3 });
        System.out.println(dlist);
    }
}
