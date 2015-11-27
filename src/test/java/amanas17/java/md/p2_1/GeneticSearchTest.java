package amanas17.java.md.p2_1;

import org.junit.Test;

import weka.attributeSelection.ConsistencySubsetEval;
import weka.attributeSelection.GeneticSearch;

public class GeneticSearchTest extends BaseTest {

        @Test
        public void GeneticSearchDefault() throws Exception {
            GeneticSearch s = new GeneticSearch();
            ConsistencySubsetEval e = new ConsistencySubsetEval();
            selectAttributes(s, e);
        }
}
