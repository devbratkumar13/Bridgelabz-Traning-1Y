package com.gla.Interface.DefaultMethodsInterfaces;
interface Exportable {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}
class Report implements Exportable {

    public void exportToCSV() {
        System.out.println("Exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Exported to PDF");
    }
}
