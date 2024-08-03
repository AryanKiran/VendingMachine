package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> stockLevels;

    public Inventory() {
        this.stockLevels = new HashMap<>();
    }

    public int checkStock(Product product) {
        return stockLevels.getOrDefault(product, 0);
    }

    public void updateStock(Product product, int quantity) {
        stockLevels.put(product, checkStock(product) + quantity);
    }

    public List<Product> alertLowStock() {
        List<Product> lowStockProducts = new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : stockLevels.entrySet()) {
            if (entry.getValue() < 5) {  // Assuming 5 is the low stock threshold
                lowStockProducts.add(entry.getKey());
            }
        }
        return lowStockProducts;
    }
}

