package org.launchcode;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

	// write your code here




        Menu menu1 = new Menu();

        MenuItem item1 = new MenuItem("Guacamole","Made in-house with fresh Hass avocados.",8.9,"Appetizers");
        MenuItem item2 = new MenuItem("Salsa","One pint of daily hand roasted salsa. Served with Homemade chips.",6.1,"Appetizers");
        MenuItem item3 = new MenuItem("Nachos Especial","Individual Chips w/ refried beans, Monterrey jack & Cheddar cheese.",15.2,"Appetizers");
        MenuItem item4 = new MenuItem("Carne Asada","Hand-cut marinated 21-day aged skirt steak*",31.0,"Main Course");
        MenuItem item5 = new MenuItem("Pechuga De Pollo","Mesquite grilled chicken breast with sautéed peppers and onions.",21.9,"Main Course");
        MenuItem item6 = new MenuItem("Honey Chipotle Salmon","Mesquite grilled salmon filet topped with honey chipotle glaze.",24.6,"Main Course");
        MenuItem item7 = new MenuItem("Churros","A dozen churros with chocolate sauce.",7.5,"Desserts");
        MenuItem item8 = new MenuItem("Sopapillas","Puffed Mexican pastries dusted with cinnamon.",8.9,"Desserts");
        MenuItem item9 = new MenuItem("tres leches","three types of milk: whole milk, condensed milk, and evaporated milk.",12.0,"Desserts");

        menu1.addItem(item1);
        menu1.addItem(item2);
        menu1.addItem(item3);
        menu1.addItem(item4);
        menu1.addItem(item5);
        menu1.addItem(item6);
        menu1.addItem(item7);
        menu1.addItem(item8);
        menu1.addItem(item9);

        System.out.println("2. Print the entire, updated menu to the screen.");
        System.out.println(menu1.getItems());
        System.out.println("*******");

        System.out.println("3. Print an individual menu item to the screen.");

        System.out.println(item2);
        System.out.println("*******");

        System.out.println("4. Delete an item from a menu, then reprint the menu.");
        menu1.removeItem(item3);
        System.out.println(menu1.getItems());

        System.out.println("\nBonus\n");

        MenuItem item11 = new MenuItem("Guacamole","Made in-house with fresh Hass avocados.",8.9,"Appetizers");
        menu1.addItem(item11);

    }

}
