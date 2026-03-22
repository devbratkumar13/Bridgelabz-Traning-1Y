package com.gla.Interface.DefaultMethodsInterfaces;

public class Runner {
    public static void main(String[] args) {

        Exportable report = new Report();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
