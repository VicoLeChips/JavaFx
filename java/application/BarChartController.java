package application;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class BarChartController implements Initializable {

    @FXML
    private BarChart<String, Integer> GradeChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Create series `grades`
        XYChart.Series<String, Integer> grades = new XYChart.Series<>();

        // Add data to `grades`
        grades.getData().add(new XYChart.Data<>("Project", 20));
        grades.getData().add(new XYChart.Data<>("Quiz", 10));
        grades.getData().add(new XYChart.Data<>("Midterm", 30));
        grades.getData().add(new XYChart.Data<>("Final", 40));

        // Add `grades` to the chart
        GradeChart.getData().addAll(grades);
    }
}
