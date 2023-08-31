package asn5;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import asn1.Disease;
import asn1.Exposure;
import asn1.Patient;

public class ContainerTest {
	@Test
	public void check() {
		Patient p1 = new Patient(3, 3);
		Patient p2 = new Patient(3, 3);

		p1.setPatientId(UUID.randomUUID());
		p2.setPatientId(UUID.randomUUID());

		Disease d1 = new Disease();
		Disease d2 = new Disease();

		d1.setDiseaseId(UUID.randomUUID());
		d2.setDiseaseId(UUID.randomUUID());

		p1.addDiseaseId(d1.getDiseaseId());
		p2.addDiseaseId(d1.getDiseaseId());

		p1.setFirstName("A");
		p1.setLastName("AA");

		p2.setFirstName("B");
		p2.setLastName("BB");

		Exposure e1 = new Exposure(p1.getPatientId());
		e1.setExposureType("D");
		e1.setDateTime(LocalDateTime.now().minusDays(1));

		Exposure e2 = new Exposure(p2.getPatientId());
		e2.setExposureType("I");
		e2.setDateTime(LocalDateTime.now().minusDays(2));

		p1.setExposures(new Exposure[] { e1, e2 });
		p2.setExposures(new Exposure[] { e2, e1 });

		p1.setDiseaseIds(new UUID[] { d1.getDiseaseId(), d2.getDiseaseId() });

		Container<Disease> disease = new Container<Disease>(d1, d2);
		Container<Exposure> exposure = new Container<Exposure>(e1, e2);
		Container<Patient> patient = new Container<Patient>(p1, p2);

		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(e1);
		list.add(e2);
		list.add(d1);
		list.add(e2);

		System.out.println(list);

		assertEquals(6, list.size());
	}
}
