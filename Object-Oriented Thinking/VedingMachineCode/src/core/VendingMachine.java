package core;

import maintenance.MaintenanceLog;
import payment.PaymentSystem;
import reporting.DateRange;
import reporting.Report;
import ui.UserInterface;

import java.util.*;
import java.time.LocalDate;

public class VendingMachine {
    private String id;
    private String location;
    private String status;
    private Inventory inventory;
    private PaymentSystem paymentSystem;
    private UserInterface userInterface;
    private MaintenanceLog maintenanceLog;
    private List<Product> products;

    public VendingMachine(String id, String location) {
        this.id = id;
        this.location = location;
        this.status = "Operational";
        this.inventory = new Inventory();
        this.paymentSystem = new PaymentSystem();
        this.userInterface = new UserInterface();
        this.maintenanceLog = new MaintenanceLog();
        this.products = new ArrayList<>();
    }

    public void dispenseBeverage(Product product) {
        if (inventory.checkStock(product) > 0) {
            inventory.updateStock(product, -1);
            userInterface.displayMessage("Dispensing " + product.getName() + ". Enjoy!");
        } else {
            userInterface.displayMessage("Sorry, " + product.getName() + " is out of stock.");
        }
    }

    public boolean acceptPayment(double amount, String method) {
        return paymentSystem.processPayment(amount, method);
    }

    public Report generateReport() {
        Report report = new Report("Sales", new DateRange(LocalDate.now().minusMonths(1), LocalDate.now()));
        report.generateSalesReport();
        return report;
    }
}
