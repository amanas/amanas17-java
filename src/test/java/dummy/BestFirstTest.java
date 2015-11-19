package dummy;

import org.junit.Test;

import weka.attributeSelection.BestFirst;

public class BestFirstTest extends BaseTest {

    /**
     * A diferencia de forward, aqu� no incluye atributos irrelevantes para la predicci�n
     */
    @Test
    public void BestFirstWithStartSetOverloadedBackward() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setDirection(BACKWARD);
        bf.setStartSet("1,4");
        selectAttributes(bf);
    }

    /**
     * No realiza un filtrado �ptimo porque el atributo 3, que incluye en el resultado es redundante
     */
    @Test
    public void BestFirstWithStartSetOverloaded() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setStartSet("1,2,4");
        selectAttributes(bf);
    }

    /**
     * N�tese que B no contine toda la informaci�n para la predicci�n, por lo que se incluye C en el
     * resultado
     */
    @Test
    public void BestFirstWithStartSet() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setStartSet("1,3");
        selectAttributes(bf);
    }

    /**
     * Por defecto, coge todo el cunjunto de atributos y va eliminando
     */
    @Test
    public void filtradoBestFirstBackward() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setDirection(BACKWARD);
        selectAttributes(bf);
    }

    /**
     * BestFirst por defecto. Lo hace forward partiendo de un conjunto vac�o de atributos
     */
    @Test
    public void BestFirstPorDefecto() throws Exception {
        BestFirst bf = new BestFirst();
        selectAttributes(bf);
    }
}
