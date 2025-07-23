package Generics;

import java.util.ArrayList;
import java.util.List;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    @Override
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category.getCategoryName());
    }
}

class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
        System.out.println("Applied " + percentage + "% discount on " + product.getName());
    }

    public static void displayCatalog(List<Product<? extends Category>> catalog) {
        for (Product<? extends Category> product : catalog) {
            product.displayInfo();
        }
    }
}

public class DynamicMarketplace {
    public static void main(String[] args) {
        List<Product<? extends Category>> catalog = new ArrayList<>();

        Product<BookCategory> book = new Product<>("Java Programming", 499.99, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 299.49, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 14999.00, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 15);
        MarketplaceUtils.applyDiscount(phone, 5);

        System.out.println("\n--- Catalog After Discounts ---");
        MarketplaceUtils.displayCatalog(catalog);
    }
}

