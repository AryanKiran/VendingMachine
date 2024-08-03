package user;

import core.Product;
import reporting.DateRange;
import reporting.Report;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private String id;
    private String name;
    private int accessLevel;

    public Administrator(String id, String name, int accessLevel) {
        this.id = id;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public void updatePrices(Product product, double newPrice) {
        // In a real implementation, this would update the price in a database
        System.out.println("Updated price of " + product.getName() + " to $" + newPrice);
    }

    public List<Report> viewReports() {
        List<Report> reports = new ArrayList<>();
        reports.add(new Report("Sales", new DateRange(LocalDate.now().minusMonths(1), LocalDate.now())));
        reports.add(new Report("Inventory", new DateRange(LocalDate.now().minusMonths(1), LocalDate.now())));
        return reports;
    }

}

