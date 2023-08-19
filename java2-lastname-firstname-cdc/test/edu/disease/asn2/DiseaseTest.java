package Week;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiseaseTest {

    @Test
    public void testInfectiousDiseaseExamples() {
        InfectiousDisease infectiousDisease = new InfectiousDisease();
        String[] examples = infectiousDisease.getExamples();
        assertNotNull(examples);
        assertEquals(4, examples.length);
        assertEquals("Influenza", examples[0]);
        assertEquals("COVID-19", examples[1]);
        assertEquals("Malaria", examples[2]);
        assertEquals("Tuberculosis", examples[3]);
    }

    @Test
    public void testNonInfectiousDiseaseExamples() {
        NonInfectiousDisease nonInfectiousDisease = new NonInfectiousDisease();
        String[] examples = nonInfectiousDisease.getExamples();
        assertNotNull(examples);
        assertEquals(4, examples.length);
        assertEquals("Diabetes", examples[0]);
        assertEquals("Cancer", examples[1]);
        assertEquals("Heart Disease", examples[2]);
        assertEquals("Asthma", examples[3]);
    }
}
