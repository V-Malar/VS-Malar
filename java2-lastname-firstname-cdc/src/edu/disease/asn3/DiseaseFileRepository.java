package src;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DiseaseFileRepository {
	public void save(Disease[] diseases, Patient[] patients) throws IOException {
		String folderPath = "D:\\CPS\\LWUG\\workspace\\java2-lastname-firstname-cdc\\src\\edu\\disease\\asn3";
		FileOutputStream fos = new FileOutputStream(folderPath + "patients.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(diseases);
		fos = new FileOutputStream(folderPath + "diseases.dat");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(patients);
	}

	public DiseaseAndPatient init(String folderPath) throws IOException, ClassNotFoundException {
		if (folderPath == null) {
			throw new IllegalArgumentException();
		}
		FileInputStream fis = new FileInputStream(folderPath + "patients.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DiseaseAndPatient diseases_and_patients = new DiseaseAndPatient();
		diseases_and_patients.setPatients(ois.readObject());
		fis = new FileInputStream(folderPath + "diseases.dat");
		ois = new ObjectInputStream(fis);
		diseases_and_patients.setDiseases(ois.readObject());
		return diseases_and_patients;
	}
}