package asn6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import asn6.Exposure;

/**
 * Represents a patient with associated data.
 */
public class Patient implements Serializable{
	UUID patientId;
	String firstName, lastName;
	ArrayList<Exposure> exposures;
	ArrayList<UUID> diseaseIds;

	/**
	 * Constructs a new Patient instance with specified maximum diseases and
	 * exposures.
	 *
	 * @param maxDiseases  The maximum number of diseases.
	 * @param maxExposures The maximum number of exposures.
	 * @throws IllegalArgumentException If maxDiseases or maxExposures is invalid.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases > 0) {
			diseaseIds = new ArrayList<UUID>(maxDiseases);
		} else {
			throw new IllegalArgumentException("Invalid maxDisease count..");
		}
		if (maxExposures > 0) {
			exposures = new ArrayList<Exposure>(maxExposures);
		} else {
			throw new IllegalArgumentException("Invalid maxExposure count..");
		}
	}

	/**
	 * Adds a disease ID to the list of disease IDs.
	 *
	 * @param diseaseId The disease ID to add.
	 * @throws ArrayIndexOutOfBoundsException If the maximum number of disease IDs
	 *                                        is reached.
	 */
	public void addDiseaseId(UUID diseaseId) {
//		for (int i = 0; i < diseaseIds.size(); i++) {
//			if (diseaseIds.get(i) == null) {
//				diseaseIds.set(i, diseaseId);
//				return;
//			}
//		}
//		throw new ArrayIndexOutOfBoundsException("Max level reached..");
		diseaseIds.add(diseaseId);
	}

	/**
	 * Adds an exposure to the list of exposures.
	 *
	 * @param exposure The exposure to add.
	 * @throws ArrayIndexOutOfBoundsException If the maximum number of exposures is
	 *                                        reached.
	 */
	public void addExposure(Exposure exposure) {
		exposures.add(exposure);
//		for (int i = 0; i < exposures.size(); i++) {
//			if (exposures.get(i) == null) {
//				exposures.set(i, exposure);
//				return;
//			}
//		}
//		throw new ArrayIndexOutOfBoundsException("Max level reached..");
	}

	/**
	 * 
	 * @return FirstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		System.out.println("FN: " + firstName);
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return LastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return getDiseaseIds in ArrayList format
	 */
	public ArrayList<UUID> getDiseaseIds() {
		return diseaseIds;
	}

	/**
	 * 
	 * @param diseaseIds
	 */
	public void setDiseaseIds(ArrayList<UUID> diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	/**
	 * 
	 * @return patientId
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * 
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * 
	 * @return Exposure
	 */
	public ArrayList<Exposure> getExposures() {
		return exposures;
	}

	/**
	 * 
	 * @param exposures2
	 */
	public void setExposures(ArrayList<Exposure> exposures2) {
		this.exposures = exposures2;
	}

	/**
	 * returns hashcode of PatientId
	 */
	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}

	/**
	 * Using equals method to match objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patientId, other.patientId);
	}

	/**
	 * prints everything in the Patient class
	 */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + getFirstName() + ", lastName=" + getLastName()
				+ ", exposures=" + exposures + ", diseaseIds=" + diseaseIds + "]";
	}

}
