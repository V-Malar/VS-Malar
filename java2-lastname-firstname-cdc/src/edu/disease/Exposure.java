package edu.disease.asn3;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

class Exposure {
	String exposureType;
	LocalDateTime dateTime;
	UUID patientId;

	public Exposure(String exposureType, LocalDateTime dateTime) {
		if (!Pattern.matches("[DI]", exposureType)) {
			throw new IllegalArgumentException("Value must be either D or I");
		} else {
			this.exposureType = exposureType;
		}
		this.dateTime = dateTime;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setExposure(String exposureType) {
		this.exposureType = exposureType;
	}

	public String getExposure() {
		return exposureType;
	}

	public String toString() {
		return "PatientID: " + getPatientId().hashCode() + " Exposure Type: " + getExposure() + " Date and Time: "
				+ dateTime + "\n";
	}
}