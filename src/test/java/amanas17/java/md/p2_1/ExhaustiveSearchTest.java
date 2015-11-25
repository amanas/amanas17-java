package amanas17.java.md.p2_1;

import org.junit.Test;

import weka.attributeSelection.GeneticSearch;

public class ExhaustiveSearchTest extends BaseTest {
	@Test
	public void ExaustiveSearchConsistencySubsetEval() throws Exception {
		ExhaustiveSearch s = new ExhaustiveSearch();
//		s.setVerbose(true);
		ConsistencySubsetEval e = new ConsistencySubsetEval();
		selectAttributes(s, e);
	}

	/**
	 * Fatal - no entiendo por qu�
	 */
	@Test
	public void ExaustiveSearchDefault() throws Exception {
		ExhaustiveSearch gs = new ExhaustiveSearch();
		selectAttributes(gs, null);
	}
}
