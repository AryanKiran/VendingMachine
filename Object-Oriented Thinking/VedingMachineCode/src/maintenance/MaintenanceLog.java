package maintenance;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceLog {
    private List<String> entries;

    public MaintenanceLog() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
        System.out.println("Added maintenance log entry: " + entry);
    }

    public String getLastMaintenance() {
        return entries.isEmpty() ? "No maintenance recorded" : entries.get(entries.size() - 1);
    }
}
