package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + ", Brand: " + brand);
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries: " + getName() + ", Expiry: " + expiryDate);
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + getName() + ", Material: " + material);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtils {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Phone", "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", "2025-01-10"));
        groceriesStorage.addItem(new Groceries("Bread", "2025-01-05"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("---- All Electronics ----");
        WarehouseUtils.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n---- All Groceries ----");
        WarehouseUtils.displayAllItems(groceriesStorage.getItems());

        System.out.println("\n---- All Furniture ----");
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}

