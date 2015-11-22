package dummy;

import org.junit.Test;



public class BestFirstTest extends BaseTest {

    /**
     * A diferencia de forward, aqu� no incluye atributos irrelevantes para la predicci�n
     */
    @Test
    public void BestFirstWithStartSetOverloadedBackward() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setDirection(BACKWARD);
        bf.setStartSet("1,4");
        selectAttributes(bf, null);
    }

    /**
     * No realiza un filtrado �ptimo porque el atributo 3, que incluye en el resultado es redundante
     */
    @Test
    public void BestFirstWithStartSetOverloaded() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setStartSet("1,2,4");
        selectAttributes(bf, null);
    }

    /**
     * N�tese que B no contine toda la informaci�n para la predicci�n, por lo que se incluye C en el
     * resultado
     */
    @Test
    public void BestFirstWithStartSet() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setStartSet("1,3");
        selectAttributes(bf, null);
    }

    /**
     * Por defecto, coge todo el cunjunto de atributos y va eliminando
     */
    @Test
    public void filtradoBestFirstBackward() throws Exception {
        BestFirst bf = new BestFirst();
        bf.setDirection(BACKWARD);
        selectAttributes(bf, null);
    }

    /**
     * BestFirst por defecto. Lo hace forward partiendo de un conjunto vac�o de atributos
     */
    @Test
    public void BestFirstPorDefecto() throws Exception {
        BestFirst bf = new BestFirst();
//        bf.setDirection(BIDIRECTIONAL);
        bf.setSearchTermination(50);;
        selectAttributes(bf, null);
    }
}
