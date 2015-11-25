package amanas17.java.md.p2_1;

import org.junit.Test;

import weka.attributeSelection.GeneticSearch;

public class GeneticSearchTest extends BaseTest {
	@Test
	public void ConsistencySubsetEval() throws Exception {
		GeneticSearch s = new GeneticSearch();
		ConsistencySubsetEval e = new ConsistencySubsetEval();
		selectAttributes(s, e);
	}

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
