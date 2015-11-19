package dummy;

import org.junit.Test;

import weka.attributeSelection.RankSearch;
import weka.attributeSelection.WrapperSubsetEval;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.BayesNet;

public class WrapperSubsetEvalTest extends BaseTest {

    @Test
    public void WrapperSubsetEvalDefault() throws Exception {
        RankSearch s = new RankSearch();
        
        WrapperSubsetEval e = new WrapperSubsetEval();
        e.setFolds(3);
        
        Classifier c = new BayesNet();        
        e.setClassifier(c);
        
        selectAttributes(s, e);
    }
}
