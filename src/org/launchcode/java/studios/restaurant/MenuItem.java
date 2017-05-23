package org.launchcode.java.studios.restaurant;

/**
 * Created by summe on 5/22/2017.
 */
public class MenuItem {
    private double price;
    private String description;
    private static String category;
    private boolean isNew;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public static String getCategory() {
        return category;
    }
    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

