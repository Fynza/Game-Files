/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrava;

/**
 *
 * @author User
 */
public class Item {
    
    public enum Rarity {Trash, Normal, Unusual, Legendary, Unique, Special};

    public double value;
    public int weight;
    private String name;
    public Rarity rarity;
    public int ammount;
    public double durability;

    public Item(double startValue, String startName) {
        value = startValue;
        name = startName;
    }
    
    public Item() {
        value = 0;
        name = "default";
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
