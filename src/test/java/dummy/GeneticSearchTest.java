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
        selectAttributes(gs, null);
    }

    /**
     * Fatal - no entiendo por qu�
     */
    @Test
    public void GeneticSearchDefault() throws Exception {
        GeneticSearch gs = new GeneticSearch();
        selectAttributes(gs, null);
    }
}
