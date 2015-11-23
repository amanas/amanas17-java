package amanas17.java.md.p2_1;

import org.junit.Test;

import weka.attributeSelection.LinearForwardSelection;
import weka.attributeSelection.RandomSearch;

public class RandomSearchTest extends BaseTest {

    /**
     * No elimina la el atributo C que es redundante
     */
    @Test
    public void LinearForwardSelectionWithStartSet() throws Exception {
        LinearForwardSelection lfs = new LinearForwardSelection();
        lfs.setOptions(new String[] { "-P", "1,4" });
        selectAttributes(lfs, null);
    }

    /**
     * No filtra bien los atributos porque A y C no son suficientes para calcular Y
     */
    @Test
    public void LinearForwardSelectionDefault() throws Exception {
        RandomSearch rs = new RandomSearch();
        rs.setSearchPercent(100);
        selectAttributes(rs, null);
    }
}
