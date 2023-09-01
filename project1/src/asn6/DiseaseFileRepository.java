package asn6;

//import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.UUID;

import asn6.Patient;
import asn6.Exposure;

/**
 * A class for saving and initializing Disease and Patient data to/from files.
 */

public class DiseaseFileRepository {
	/**
	 * Save an array of diseases and an array of patients to files.
	 *
	 * @param diseases An array of diseases to save.
	 * @param patients An array of patients to save.
	 * @throws IOException            If an I/O error occurs while saving the data.
	 * @throws ClassNotFoundException If the class of a serialized object cannot be
	 *                                found during deserialization.
	 */
	public static void save(ArrayList<Disease> diseases, ArrayList<Patient> patients) throws IOException, ClassNotFoundException {
		String folderPath = "D:\\CPS\\LWUG\\workspace\\project1\\";
		File file = new File(folderPath, "Diseases.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(diseases);

		file = new File(folderPath, "Patients.dat");
		fos = new FileOutputStream(file);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(patients);
		DiseaseFileRepository.init(folderPath);
	}

	/**
	 * Initialize Disease and Patient data from files.
	 *
	 * @param folderPath The path to the folder containing the data files.
	 * @return A DiseaseAndPatient object containing initialized data.
	 * @throws IOException            If an I/O error occurs while reading the data
	 *                                files.
	 * @throws ClassNotFoundException If the class of a serialized object cannot be
	 *                                found during deserialization.
	 */
	public static DiseaseAndPatient init(String folderPath) throws IOException, ClassNotFoundException {
		if (folderPath == null) {
			throw new IllegalArgumentException();
		}
		FileInputStream fis = new FileInputStream(folderPath + "patients.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DiseaseAndPatient diseases_and_patients = new DiseaseAndPatient();
		diseases_and_patients.setPatients((ArrayList<Patient>) ois.readObject());
		fis = new FileInputStream(folderPath + "diseases.dat");
		ois = new ObjectInputStream(fis);
		diseases_and_patients.setDiseases((ArrayList<Disease>) ois.readObject());
		return diseases_and_patients;
	}
//public static void main(String[] args) {
//	// Create an instance of DiseaseControlManagerImpl with maxDiseases and maxPatients
//    DiseaseControlManagerImpl diseaseManager = new DiseaseControlManagerImpl(5, 5);
//
//    // Add some diseases
//    Disease covid = diseaseManager.addDisease("COVID-19", true);
//    Disease flu = diseaseManager.addDisease("Influenza", true);
//
//    // Add some patients
//    Patient patient1 = diseaseManager.addPatient("John", "Doe", 3, 3);
//    Patient patient2 = diseaseManager.addPatient("Alice", "Smith", 2, 2);
//
//    // Set IDs for diseases and patients
//    covid.setDiseaseId(UUID.randomUUID());
//    flu.setDiseaseId(UUID.randomUUID());
//    patient1.setPatientId(UUID.randomUUID());
//    patient2.setPatientId(UUID.randomUUID());
//
//    // Add diseases to patients
//    diseaseManager.addDiseaseToPatient(patient1.getPatientId(), covid.getDiseaseId());
//    diseaseManager.addDiseaseToPatient(patient2.getPatientId(), flu.getDiseaseId());
//
//    // Create an Exposure for a patient
//    Exposure exposure = new Exposure(patient1.getPatientId());
//    exposure.setExposureType("I");
//
//    // Add exposure to the patient
//    diseaseManager.addExposureToPatient(patient1.getPatientId(), exposure);
//
//    try {
//        // Save diseases and patients to files
//        DiseaseFileRepository.save(diseaseManager.getDiseases(), diseaseManager.getPatients());
//        System.out.println("Data saved successfully.");
//
//        // Initialize diseases and patients from files
//        DiseaseAndPatient data = DiseaseFileRepository.init("C:\\YourFolderPath\\");
//
//        // Print the initialized data
//        System.out.println("Initialized Diseases:");
//        for (Disease disease : data.getDiseases()) {
//            System.out.println(disease.getName());
//        }
//
//        System.out.println("Initialized Patients:");
//        for (Patient patient : data.getPatients()) {
//            System.out.println(patient.getFirstName() + " " + patient.getLastName());
//        }
//    } catch (IOException | ClassNotFoundException e) {
//        e.printStackTrace();
//    }
}
