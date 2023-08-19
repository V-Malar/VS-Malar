package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

public class Exposure {
	String exposureType;
	LocalDateTime dateTime;
	UUID patientId;

	public Exposure(String exposureType, LocalDateTime dateTime, UUID patientId) {
		if (!Pattern.matches("[DI]", exposureType)) {
			throw new IllegalArgumentException("Value must be either D or I");
		} else {
			this.exposureType = exposureType;
		}
		this.dateTime = dateTime;
		this.patientId = patientId;
	}

	public void setExposure(String exposureType) {
		this.exposureType = exposureType;
	}

	public String getExposure() {
		return exposureType;
	}

	public String toString() {
		return "PatientID: " + patientId.hashCode() + " Exposure Type: " + getExposure() + " Date and Time: " + dateTime;
	}
}
