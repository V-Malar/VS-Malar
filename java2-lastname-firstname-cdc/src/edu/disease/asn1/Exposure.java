package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * The Exposure class represents an exposure with details including exposure type, date and time, and associated patient ID.
 */
public class Exposure {
    private String exposureType;
    private LocalDateTime dateTime;
    private UUID patientId;

    /**
     * Creates an instance of Exposure with the given exposure type, date and time, and patient ID.
     *
     * @param exposureType The exposure type (either "D" for direct or "I" for indirect).
     * @param dateTime     The date and time of the exposure.
     * @param patientId    The UUID of the associated patient.
     * @throws IllegalArgumentException If the exposure type is not "D" or "I".
     */
    public Exposure(String exposureType, LocalDateTime dateTime, UUID patientId) {
        if (!Pattern.matches("[DI]", exposureType)) {
            throw new IllegalArgumentException("Value must be either D or I");
        } else {
            this.exposureType = exposureType;
        }
        this.dateTime = dateTime;
        this.patientId = patientId;
    }

    /**
     * Sets the exposure type.
     *
     * @param exposureType The exposure type to set (either "D" for direct or "I" for indirect).
     */
    public void setExposure(String exposureType) {
        this.exposureType = exposureType;
    }

    /**
     * Retrieves the exposure type.
     *
     * @return The exposure type (either "D" for direct or "I" for indirect).
     */
    public String getExposure() {
        return exposureType;
    }

    /**
     * Returns a string representation of the Exposure object.
     *
     * @return A string containing the patient's UUID, exposure type, and date and time.
     */
    @Override
    public String toString() {
        return "PatientID: " + patientId.hashCode() + " Exposure Type: " + getExposure() + " Date and Time: " + dateTime;
    }
}
