package dummy;

import org.junit.Test;

import weka.attributeSelection.GeneticSearch;

public class GeneticSearchTest extends BaseTest {

    /**
     * Igual de mal
     */
    @Test
    public void GeneticSearchWithStartSet() throws Exception {
        GeneticSearch gs = new GeneticSearch();
        gs.setStartSet("1,4");
        selectAttributes(gs);
    }

    /**
     * Fatal - no entiendo por qué
     */
    @Test
    public void GeneticSearchDefault() throws Exception {
        GeneticSearch gs = new GeneticSearch();
        selectAttributes(gs);
    }
}
