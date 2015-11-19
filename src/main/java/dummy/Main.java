package dummy;

import static weka.attributeSelection.BestFirst.TAGS_SELECTION;

import java.io.File;
import java.io.IOException;

import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.BestFirst;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.EM;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

public class Main {

    private static final SelectedTag BACKWARD = new SelectedTag(0, TAGS_SELECTION);

    private static final SelectedTag FORWARD = new SelectedTag(1, TAGS_SELECTION);

    private static final SelectedTag BIDIRECTIONAL = new SelectedTag(2, TAGS_SELECTION);

    private static Instances data;

    public static void main(String... args) throws Exception {

        loadData();

        filtradoBestFirst_2();

    }

    private static void filtradoBestFirst_2() throws Exception {
        AttributeSelection as = new AttributeSelection();
        BestFirst bf = new BestFirst();
        bf.setDirection(FORWARD);
        bf.setStartSet("1,2");
        as.setSearch(bf);
        as.SelectAttributes(data);
        log(as.toResultsString());
    }

    private static void filtradoBestFirst_1() throws Exception {
        AttributeSelection as = new AttributeSelection();
        BestFirst bf = new BestFirst();
        bf.setDirection(BACKWARD);
        as.setSearch(bf);
        as.SelectAttributes(data);
        log(as.toResultsString());
    }

    /**
     * BestFirst por defecto
     */
    private static void filtradoBestFirst_0() throws Exception {
        AttributeSelection as = new AttributeSelection();
        as.setSearch(new BestFirst());
        as.SelectAttributes(data);
        log(as.toResultsString());
    }

    private static void example4() throws Exception {
        Remove filter = new Remove();
        filter.setAttributeIndices("" + (data.classIndex() + 1));
        filter.setInputFormat(data);
        Instances dataClusterer = Filter.useFilter(data, filter);
        EM clusterer = new EM();
        clusterer.buildClusterer(dataClusterer);
        ClusterEvaluation eval = new ClusterEvaluation();
        eval.setClusterer(clusterer);
        eval.evaluateClusterer(data);
        log(eval);
    }

    private static void log(Object o) {
        System.out.println(o);
    }

    private static void log(ClusterEvaluation eval) {
        log(eval.clusterResultsToString());
    }

    private static void loadData() throws Exception, IOException {
        File file = new File("C:/Users/amm15752/.groovy/grapes/ai/amanas17/resources/md-p1.dat");
        CSVLoader loader = new CSVLoader();
        loader.setOptions(new String[] { "-H" });
        loader.setFile(file);
        data = loader.getDataSet();
        data.setClassIndex(data.numAttributes() - 1);
    }
}
