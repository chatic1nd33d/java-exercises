package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by summe on 5/22/2017.
 */
public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {

        this.menuItems = menuItems;
    }
    public Date getLastUpdated() {

        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {

        this.lastUpdated = lastUpdated;
    }
    public Menu(ArrayList<MenuItem> items, Date lastUpdated){
        this.menuItems = items;
        this.lastUpdated = lastUpdated;
    }
    public Menu(){
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }
    public Menu(ArrayList<MenuItem> items) {
        this.menuItems = items;
        this.lastUpdated = new Date;
    }

    public void removeMenuItem(MenuItem oldItem){
        this.menuItems.remove(oldItem);
        this.lastUpdated = new Date();
    }
    public void addMenuItem (MenuItem newItem){
        this.menuItems.add(newItem);
        this.lastUpdated = new Date();
    }
    public boolean isMenuItemNew(MenuItem aMenuItem){
        return aMenuItem.isNew();
    }
    public String toString() {
        String result = "";
        for(MenuItem item : this.menuItems){
            result += item.toString();
        }
        return result;
    }
}
