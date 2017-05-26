package org.launchcode.java.studios.restaurant;

/**
 * Created by summe on 5/22/2017.
 */
public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }


    public String toString() {
        return name + " (Description: " + this.description + ", Price: " + this.price + ", Category: " + this.category + ", New Item:" + this.isNew;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    public String getCategory() {

        return category;
    }
    public boolean isNew() {

        return isNew;
    }
    public void setNew(boolean aNew) {

        isNew = aNew;
    }
}

