package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    final ArrayList<MenuItem> items = new ArrayList<>();



    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem( MenuItem item) {
        boolean isItemNew = false;

        for (int i = 0; i < items.size(); i++){
                if (items.get(i).equals(item)){
                    isItemNew = true;
                    System.out.println("Item already exist");
                    break;
                }
            }
        if (!isItemNew){
            items.add(item);
        }

    }
    public void removeItem ( MenuItem item){
        items.remove(item);
    }



}
