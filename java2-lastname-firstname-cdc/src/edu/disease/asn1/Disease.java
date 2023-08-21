/**
 * The Disease class represents a disease with a unique disease ID and a name.
 */
public class Disease {

    private UUID diseaseId;
    private String name;

    /**
     * Sets the name of the disease.
     *
     * @param name The name of the disease.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the disease.
     *
     * @return The name of the disease.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the disease ID.
     *
     * @param id The disease ID.
     */
    public void setDiseaseId(UUID id) {
        this.diseaseId = id;
    }

    /**
     * Retrieves the disease ID.
     *
     * @return The disease ID.
     */
    public UUID getDiseaseId() {
        return diseaseId;
    }

    /**
     * Returns a string representation of the Disease object.
     *
     * @return A string containing the disease's name and ID.
     */
    @Override
    public String toString() {
        return "\nName: " + getName() + " Disease-ID: " + diseaseId.hashCode();
    }
}
