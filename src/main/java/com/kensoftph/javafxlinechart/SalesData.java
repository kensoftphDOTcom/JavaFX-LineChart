package com.kensoftph.javafxlinechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

public class SalesData {
    public static ObservableList<XYChart.Series<Number, Number>> getSalesData() {
        XYChart.Series<Number, Number> productOne = new XYChart.Series<>();
        productOne.setName("Product One");
        productOne.getData().addAll(new XYChart.Data<>(2020, 500));
        productOne.getData().addAll(new XYChart.Data<>(2021, 4000));
        productOne.getData().addAll(new XYChart.Data<>(2022, 3000));
        productOne.getData().addAll(new XYChart.Data<>(2023, 200));
        productOne.getData().addAll(new XYChart.Data<>(2024, 1000));
        productOne.getData().addAll(new XYChart.Data<>(2025, 900));
        productOne.getData().addAll(new XYChart.Data<>(2026, 2000));

        XYChart.Series<Number, Number> productTwo = new XYChart.Series<>();
        productTwo.setName("Product Two");
        productTwo.getData().addAll(new XYChart.Data<>(2020, 600));
        productTwo.getData().addAll(new XYChart.Data<>(2021, 2000));
        productTwo.getData().addAll(new XYChart.Data<>(2022, 4000));
        productTwo.getData().addAll(new XYChart.Data<>(2023, 900));
        productTwo.getData().addAll(new XYChart.Data<>(2024, 4000));
        productTwo.getData().addAll(new XYChart.Data<>(2025, 200));
        productTwo.getData().addAll(new XYChart.Data<>(2026, 500));

        XYChart.Series<Number, Number> productThree = new XYChart.Series<>();
        productThree.setName("Product Two");
        productThree.getData().addAll(new XYChart.Data<>(2020, 900));
        productThree.getData().addAll(new XYChart.Data<>(2021, 1000));
        productThree.getData().addAll(new XYChart.Data<>(2022, 3000));
        productThree.getData().addAll(new XYChart.Data<>(2023, 500));
        productThree.getData().addAll(new XYChart.Data<>(2024, 5000));
        productThree.getData().addAll(new XYChart.Data<>(2025, 6200));
        productThree.getData().addAll(new XYChart.Data<>(2026, 100));

        ObservableList<XYChart.Series<Number, Number>> data = FXCollections.observableArrayList();
        data.addAll(productOne, productTwo, productThree);
        return data;
    }
}
