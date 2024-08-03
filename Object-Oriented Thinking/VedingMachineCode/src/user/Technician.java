package user;
public class Technician {
    private String id;
    private String name;
    private String specialization;

    public Technician(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void performMaintenance() {
        System.out.println("Performing maintenance...");
        // Simulating maintenance tasks
        System.out.println("Cleaned brewing system");
        System.out.println("Checked water filters");
        System.out.println("Calibrated dispensing mechanism");
    }

    public void updateLog(String entry) {
        System.out.println("Technician " + name + " updated log: " + entry);
    }
}
