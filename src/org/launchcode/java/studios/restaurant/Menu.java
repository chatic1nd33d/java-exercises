package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by summe on 5/22/2017.
 */
public class Menu {
    private ArrayList<MenuItem> menuItem;
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
