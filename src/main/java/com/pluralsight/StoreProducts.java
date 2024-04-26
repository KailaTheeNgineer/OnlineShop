package com.pluralsight;

public class StoreProducts {
    private int sku;
    private String productName;
    private double price;
    private String department;

    public StoreProducts(int sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public int getSku() {
        return sku;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }

}
