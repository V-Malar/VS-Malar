package asn6;

import java.time.LocalDateTime;

import asn6.Patient;

public class PatientZero {
	private Patient patient;
	private LocalDateTime exposureDateTime;
	private boolean exposed;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient p)  {
		this.patient = p;
	}

	public LocalDateTime getExposureDateTime() {
		return exposureDateTime;
	}

	public void setExposureDateTime(LocalDateTime exposureDateTime) {
		this.exposureDateTime = exposureDateTime;
	}

	public boolean isExposed() {
		return exposed;
	}

	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

}
