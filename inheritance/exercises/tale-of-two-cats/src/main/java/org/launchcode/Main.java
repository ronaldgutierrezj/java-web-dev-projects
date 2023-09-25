package org.launchcode;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13


        HouseCat cheshireCat = new HouseCat("Cheshire", 12);


        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"
        Cat suki = new HouseCat("Suki", 8);
       suki.noise();
        System.out.println(((HouseCat) suki).isSatisfied());
       ;



    }
}
