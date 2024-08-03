import core.Product;
import core.VendingMachine;
import reporting.Report;
import user.Administrator;
import user.Technician;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine("VM001", "University Library");
        Product coffee = new Product("P001", "Coffee", 1.50, 50);

        vm.dispenseBeverage(coffee);
        vm.acceptPayment(1.50, "Credit Card");

        Administrator admin = new Administrator("A001", "John Doe", 1);
        admin.updatePrices(coffee, 1.75);

        Technician tech = new Technician("T001", "Jane Smith", "Mechanical");
        tech.performMaintenance();
        tech.updateLog("Performed routine maintenance");

        Report report = vm.generateReport();
    }
}