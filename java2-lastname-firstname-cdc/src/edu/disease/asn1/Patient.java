package edu.disease.asn1;

import java.util.UUID;
import java.util.Arrays;
import java.util.Objects;

public class Patient {
	UUID patientId = UUID.randomUUID();
	int maxDiseases, maxExposures;
	String firstName, lastName;
	UUID[] diseaseIds;

	Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases < 0) {
			throw new IllegalArgumentException("Value must be greater than 0");
		} else {
			this.diseaseIds = new UUID[maxDiseases];
		}
	}

	public void addDiseaseId(UUID id) {
		for (int i = 0; i < diseaseIds.length; i++) {
			diseaseIds[i] = id;
		}
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return firstName;
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
}
