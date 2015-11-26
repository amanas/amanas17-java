package amanas17.java.md.p2_1;

import org.junit.Test;

import weka.attributeSelection.PrincipalComponents;
import weka.attributeSelection.Ranker;



public class CFATest extends BaseTest {
 
    @Test
    public void BestFirstPorDefecto() throws Exception {
        PrincipalComponents bf = new PrincipalComponents();
        Ranker r = new Ranker();
        selectAttributes(r, bf);
    }
}
