package com.kensoftph.javafxlinechart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private LineChart<Number, Number> lineChart;
    @FXML
    private NumberAxis xAxis;
    @FXML
    private NumberAxis yAxis;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        xAxis.setLabel("Year");
        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(2020);
        xAxis.setUpperBound(2026);
        xAxis.setTickUnit(1);

        yAxis.setLabel("Sales in Dollars");
        yAxis.setAutoRanging(true);

        lineChart.setTitle("Product Sales");
        lineChart.setData(SalesData.getSalesData());
    }
}