import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;

public class SpecialEducationGraph {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = createDataset("SpecialEducationData.csv");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Special Education Enrollment by County",
                "County",
                "Special Education Enrollment",
                dataset);

        barChart.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.BLUE);

        JFrame frame = new JFrame("Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(barChart);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static DefaultCategoryDataset createDataset(String filename) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String county = data[0];
                int enrollment = Integer.parseInt(data[1].replaceAll(",", ""));
                dataset.addValue(enrollment, "Enrollment", county);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataset;
    }
}
