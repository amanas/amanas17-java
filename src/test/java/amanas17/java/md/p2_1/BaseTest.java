package amanas17.java.md.p2_1;

import static weka.attributeSelection.BestFirst.TAGS_SELECTION;

import java.io.File;

import org.junit.BeforeClass;

import weka.attributeSelection.ASEvaluation;
import weka.attributeSelection.ASSearch;
import weka.attributeSelection.AttributeSelection;
import weka.clusterers.ClusterEvaluation;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.converters.CSVLoader;

public class BaseTest {

    static SelectedTag BACKWARD = new SelectedTag(0, TAGS_SELECTION);

    static SelectedTag FORWARD = new SelectedTag(1, TAGS_SELECTION);

    static SelectedTag BIDIRECTIONAL = new SelectedTag(2, TAGS_SELECTION);

    static Instances data;

    static void log(Object o) {
        System.out.println(o);
    }

    static void log(ClusterEvaluation eval) {
        log(eval.clusterResultsToString());
    }

    // void selectAttributes(ASSearch ass) throws Exception {
    // AttributeSelection as = new AttributeSelection();
    // as.setSearch(ass);
    // as.SelectAttributes(data);
    // log(as.toResultsString());
    // }

    void selectAttributes(ASSearch ass, ASEvaluation ase) throws Exception {
        AttributeSelection as = new AttributeSelection();
        as.setSearch(ass);
        if (ase != null)
            as.setEvaluator(ase);

        as.SelectAttributes(data);
        log(as.toResultsString());
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        File file = new File("src/test/resources/md/p2_1/p2_1.csv");
        CSVLoader loader = new CSVLoader();
        // loader.setOptions(new String[] { "-N", "1-4,6" });
        loader.setFile(file);
        data = loader.getDataSet();
        data.setClassIndex(data.numAttributes() - 1);
        // log(data);
    }

}
