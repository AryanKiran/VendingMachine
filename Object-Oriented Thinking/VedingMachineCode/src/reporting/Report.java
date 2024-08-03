package reporting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Report {
    private String type;
    private DateRange dateRange;
    private Map<String, Object> data;

    public Report(String type, DateRange dateRange) {
        this.type = type;
        this.dateRange = dateRange;
        this.data = new HashMap<>();
    }

    public void generateSalesReport() {
        // Simulate generating a sales report
        data.put("Total Sales", 1000.0);
        data.put("Most Popular Item", "Coffee");
        System.out.println("Generated sales report for " + dateRange);
    }

    public void generateInventoryReport() {
        // Simulate generating an inventory report
        data.put("Low Stock Items", Arrays.asList("Coffee Beans", "Cups"));
        data.put("Fully Stocked Items", Arrays.asList("Tea Bags", "Sugar"));
        System.out.println("Generated inventory report for " + dateRange);
    }
}
