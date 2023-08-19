package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Patient implements Comparable<Patient> {
	UUID patientId;
	int maxDiseases, maxExposures;
	String firstName, lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;

	Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases < 0) {
			throw new IllegalArgumentException("Value must be greater than 0");
		} else {
			this.diseaseIds = new UUID[maxDiseases];
		}
		if (maxExposures < 0) {
			throw new IllegalArgumentException("Value must be greater than 0");
		} else {
			this.exposures = new Exposure[maxExposures];
		}
	}

	public void addDiseaseId(UUID id) {
		for (int i = 0; i < diseaseIds.length; i++) {
			diseaseIds[i] = id;
		}
	}

	public void addExposure(Exposure exe) {
		for (int i = 0; i < exposures.length; i++) {
			exposures[i] = exe;
		}
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setMaxDiseases(int maxDiseases) {
		this.maxDiseases = maxDiseases;
	}

	public int getMaxDiseases() {
		return maxDiseases;
	}

	public void setMaxExposures(int maxExposures) {
		this.maxExposures = maxExposures;
	}

	public int getMaxExposures() {
		return maxExposures;
	}

	static UUID getPatientID() {
		return UUID.randomUUID();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Patient patient = (Patient) obj;
		return Objects.equals(patientId, patient.patientId);
	}

	@Override
	public String toString() {
		return "Patient{" + "patientId=" + patientId + ", maxDiseases=" + getMaxDiseases() + ", maxExposures="
				+ getMaxExposures() + ", firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\''
				+ ", exposures=" + ", diseaseIds=" + Arrays.toString(diseaseIds) + '}';
	}

	@Override
	public int compareTo(Patient other) {
		Comparator<String> lastNameComparator = Comparator.comparing(String::toLowerCase);
		return lastNameComparator.compare(this.lastName, other.lastName);
	}

	public static void main(String[] args) {
		// Create a TreeSet with a custom comparator
//				Set<Patient> patientSet = new TreeSet<>(Comparator.comparing(Patient::getLastName));
//			
//				// Create patients and add them to the TreeSet
//				Patient patient1 = new Patient(3, 4);
//				patient1.setFirstName("John");
//				patient1.setLastName("Doe");
//				patient1.setMaxDiseases(3);
//				patient1.setMaxExposures(4);
//			
//				Patient patient2 = new Patient(3, 4);
//				patient2.setFirstName("Alice");
//				patient2.setLastName("Smith");
//				patient2.setMaxDiseases(3);
//				patient2.setMaxExposures(4);
//			
//				// Add patients to the TreeSet
//				patientSet.add(patient1);
//				patientSet.add(patient2);
//			
//				// Print patients in ascending order of last name
//				System.out.println("Patients in ascending order of last name:");
//				for (Patient patient : patientSet) {
//					System.out.println("Last Name: " + patient.getLastName() + ", First Name: " + patient.getFirstName());
//				}
	}

}

//public static void main(String[] args) {
//	// Create a TreeSet with a custom comparator
//	Set<Patient> patientSet = new TreeSet<>(Comparator.comparing(Patient::getLastName));
//
//	// Create patients and add them to the TreeSet
//	Patient patient1 = new Patient(3, 4);
//	patient1.setFirstName("John");
//	patient1.setLastName("Doe");
//	patient1.setMaxDiseases(3);
//	patient1.setMaxExposures(4);
//
//	Patient patient2 = new Patient(3, 4);
//	patient2.setFirstName("Alice");
//	patient2.setLastName("Smith");
//	patient2.setMaxDiseases(3);
//	patient2.setMaxExposures(4);
//
//	// Add patients to the TreeSet
//	patientSet.add(patient1);
//	patientSet.add(patient2);
//
//	// Print patients in ascending order of last name
//	System.out.println("Patients in ascending order of last name:");
//	for (Patient patient : patientSet) {
//		System.out.println("Last Name: " + patient.getLastName() + ", First Name: " + patient.getFirstName());
//	}
//}


//... rest of the main method ...

		// Print exposure details
//		Set<Patient> exposures = patientSet;
//		if (exposures != null) {
//			System.out.println("\nExposure Details:");
//			for (Patient e : exposures) {
//				System.out.println(e);
//			}
//		}