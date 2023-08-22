package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

public class Exposure {
	String exposureType;
	LocalDateTime dateTime;
	UUID patientId;

	public Exposure(UUID patientId) {
		setPatientId(patientId);

	}

//	public void setExposure(String exposureType) {
//		if (!Pattern.matches("[DI]", exposureType)) {
//			throw new IllegalArgumentException("Value must be either D or I");
//		} else {
//			this.exposureType = exposureType;
//		}
//	}

	public String getExposure() {
		return exposureType;
	}

	public String toString() {
		//PatientID: 123e4567-e89b-12d3-a456-426655440000 Exposure Type: I Date and Time: " + dateTime
		return "PatientID: " + patientId.hashCode() + " Exposure Type: " + getExposure() + " Date and Time: " + dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		if (dateTime !=null)
		{
			this.dateTime = dateTime;
		}
		else
		{
			throw new NullPointerException("Null value found for Date and Time");
		}
		
		
	}
	public LocalDateTime getDateTime()
	{
		return dateTime;
	}

	public void setExposureType(String exposureType) {
		if (!Pattern.matches("[DI]", exposureType)) {
			throw new IllegalArgumentException("Value must be either D or I");
		} else {
			this.exposureType = exposureType;
		}
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		if (patientId !=null)
		{
		this.patientId = patientId;
		}
		else
		{
			throw new NullPointerException("Null value found for ID");
		}
		
	}

	public String getExposureType() {
		return exposureType;
	}
}
