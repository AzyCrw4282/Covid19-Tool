import java.awt.*;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.json.JSONException;
import org.json.JSONObject;

public class PieChartUtility extends JFrame {
    private ChartPanel chartPanel;


    public PieChartUtility(String title,JSONObject jsonObj) throws JSONException {
        super(title);
        // Create dataset
        PieDataset dataset = createDataset(jsonObj);

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                title,
                dataset,
                true,
                true,
                false);

        //Format Label
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "Marks {0} : ({1})", new DecimalFormat("0"), new DecimalFormat("0%"));
        ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint("Total Cases", Color.yellow);
        plot.setSectionPaint("Total Recovered", Color.green);
        plot.setSectionPaint("Total Death", Color.red);
        // Create Panel
        chartPanel = new ChartPanel(chart);
    }

    private PieDataset createDataset(JSONObject jsonObj) throws JSONException {

        DefaultPieDataset dataset=new DefaultPieDataset();
        dataset.setValue("Total Cases", Double.parseDouble(jsonObj.getString("total_cases").replace(",","")));
        dataset.setValue("Total Recovered", Double.parseDouble(jsonObj.getString("total_recovered").replace(",","")));
        dataset.setValue("Total Death", Double.parseDouble(jsonObj.getString("total_deaths").replace(",","")));

        return dataset;
    }


    public ChartPanel getChartPanel() {
        return chartPanel;
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            PieChartUtility example = new PieChartUtility("Covid");
//            example.setSize(800, 400);
//            example.setLocationRelativeTo(null);
//            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            example.setVisible(true);
//        });
    }




}  