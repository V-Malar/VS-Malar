package Week;
import java.util.UUID;

public abstract class Disease {

    UUID diseaseId;
    String name;

    abstract String[] getExamples();

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setDiseaseId(UUID id) {
        this.diseaseId = id;
    }

    UUID getDiseaseId() {
        return diseaseId;
    }

    public String toString() {
        return "\nName: " + getName() + " Disease-ID: " + diseaseId.hashCode();
    }
}

class InfectiousDisease extends Disease {

    @Override
    String[] getExamples() {
        return new String[]{"Influenza", "COVID-19", "Malaria", "Tuberculosis"};
    }
}

class NonInfectiousDisease extends Disease {

    @Override
    String[] getExamples() {
        return new String[]{"Diabetes", "Cancer", "Heart Disease", "Asthma"};
    }
}
