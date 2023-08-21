package edu.disease.asn1;

import java.util.UUID;
import java.util.Arrays;
import java.util.Objects;

/**
 * The Patient class represents a patient with a unique patient ID, first name, last name, and associated data such as
 * max diseases and max exposures.
 */
public class Patient {
    private UUID patientId = UUID.randomUUID();
    private int maxDiseases, maxExposures;
    private String firstName, lastName;
    private UUID[] diseaseIds;

    /**
     * Creates an instance of Patient with the specified maximum number of diseases and exposures.
     *
     * @param maxDiseases   The maximum number of diseases a patient can have.
     * @param maxExposures  The maximum number of exposures a patient can have.
     * @throws IllegalArgumentException If the maximum number of diseases is less than 0.
     */
    public Patient(int maxDiseases, int maxExposures) {
        if (maxDiseases < 0) {
            throw new IllegalArgumentException("Value must be greater than or equal to 0");
        } else {
            this.maxDiseases = maxDiseases;
            this.maxExposures = maxExposures;
            this.diseaseIds = new UUID[maxDiseases];
        }
    }

    /**
     * Adds a disease ID to the patient.
     *
     * @param id The UUID of the disease to be added.
     */
    public void addDiseaseId(UUID id) {
        for (int i = 0; i < diseaseIds.length; i++) {
            diseaseIds[i] = id;
        }
    }

    /**
     * Sets the first name of the patient.
     *
     * @param firstName The first name of the patient.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the first name of the patient.
     *
     * @return The first name of the patient.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of the patient.
     *
     * @param lastName The last name of the patient.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the last name of the patient.
     *
     * @return The last name of the patient.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the maximum number of diseases a patient can have.
     *
     * @return The maximum number of diseases.
     */
    public int getMaxDiseases() {
        return maxDiseases;
    }

    /**
     * Retrieves the maximum number of exposures a patient can have.
     *
     * @return The maximum number of exposures.
     */
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
        return "Patient{" +
                "patientId=" + patientId +
                ", maxDiseases=" + getMaxDiseases() +
                ", maxExposures=" + getMaxExposures() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", diseaseIds=" + Arrays.toString(diseaseIds) +
                '}';
    }
}
