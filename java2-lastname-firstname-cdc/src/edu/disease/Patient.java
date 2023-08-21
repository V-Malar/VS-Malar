package edu.disease.asn3;

import java.util.UUID;

class Patient {

	private UUID patientId;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;

	public Patient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (maxDiseases <= 0 || maxExposures <= 0) {
			throw new IllegalArgumentException("Max diseases and max exposures must be greater than 0.");
		}
		diseaseIds = new UUID[maxDiseases];
		exposures = new Exposure[maxExposures];
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void addDiseaseId(UUID diseaseId) {
		for (int i = 0; i < diseaseIds.length; i++) {
			if (diseaseIds[i] == null) {
				diseaseIds[i] = diseaseId;
				return;
			}
		}
		throw new IndexOutOfBoundsException("Disease IDs array is full.");
	}

	public void addExposure(Exposure exposure) {
		for (int i = 0; i < exposures.length; i++) {
			if (exposures[i] == null) {
				exposures[i] = exposure;
				return;
			}
		}
		throw new IndexOutOfBoundsException("Exposures array is full.");
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Exposure[] getExposures() {
		return exposures;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	@Override
	public int hashCode() {
		return patientId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Patient patient = (Patient) obj;
		return patientId.equals(patient.patientId);
	}

	@Override
	public String toString() {
		return "Patient{" + "patientId=" + patientId.hashCode() + ", firstName='" + firstName + '\'' + ", lastName='"
				+ lastName + '\'' + '}' + "\n";
	}
}
