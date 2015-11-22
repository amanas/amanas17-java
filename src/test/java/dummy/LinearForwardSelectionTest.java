package dummy;

import org.junit.Test;

import weka.attributeSelection.LinearForwardSelection;

public class LinearForwardSelectionTest extends BaseTest {

    /**
     * No elimina el atributo C que es redundante
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
        LinearForwardSelection lfs = new LinearForwardSelection();
        selectAttributes(lfs, null);
    }
}
