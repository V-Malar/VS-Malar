package edu.disease.asn3;

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
		folderPath = "D:\\CPS\\LWUG\\workspace\\java2-lastname-firstname-cdc\\src\\edu\\disease\\asn3";
		FileInputStream fis=new FileInputStream(folderPath+"patients.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		DiseaseAndPatient patients = (DiseaseAndPatient) ois.readObject();
		fis = new FileInputStream(folderPath+"diseases.dat");
		ois=new ObjectInputStream(fis);
		DiseaseAndPatient diseases = (DiseaseAndPatient) ois.readObject();
		return patients;

	}
}
