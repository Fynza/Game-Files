/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrava;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Character {
//Races. Add more as needed.
    public enum Race {
        Human, Demon
    };
//MAybe more specific?
    public enum Affinity {
        Offensive, Healing, Support, Defensive
    };

//Basic info
    String charName = "default";
    int age;
    Affinity affinity;
    Race race;

//Inventory
    int lastEmpty = 0;
    boolean fullInventory = false;
    int inventorySize = 5;
    public Item[] Inventory = new Item[inventorySize];
    //Create new and copy when size changes

//Armour
    public Armour helm = new Armour();
    public Armour chestplate = new Armour();
    public Armour legs = new Armour();
    public Armour boots = new Armour();
    public Armour gloves = new Armour();
    public Armour backpack = new Armour();

//Weapons
    public Weapon mainHand = new Weapon();
    public Weapon offHand = new Weapon();
    public Weapon ranged = new Weapon();
    public Weapon ammo = new Weapon();

    //Others
    public Accessory ringR = new Accessory();
    public Accessory ringL = new Accessory();
    public Accessory earrings = new Accessory();
    public Accessory bracer = new Accessory();
    //Perks

    public ArrayList<Perk> perkList = new ArrayList<>();

    //Stats
    //SPECIAL
    public int Strength;
    public int Perception;
    public int Endurance;
    public int Charisma;
    public int Inteligence;
    public int Agility;
    public int Luck;

    //Skills
    //Accessing certian skills? Index through input maybe array.get(i)
    //Combat Skills
    public ArrayList<CombatSkill> cSkills = new ArrayList<>();

    //Non-Combat Skills
    public ArrayList<NonCombatSkill> ncSkills = new ArrayList<>();

    //Add items to inventory
    public void addItem(Item i) {
        if (!fullInventory) {
            Inventory[lastEmpty] = i;
            if (lastEmpty < Inventory.length) {
                lastEmpty++;
            } else {
                fullInventory = true;
            }

        }else{
            System.out.println("Full Inventory");
        }
    }
    //Equiping items

    public void equipHelm(Armour helm) {
        this.helm = helm;
    }

    public void equipChestplate(Armour chestplate) {
        this.chestplate = chestplate;
    }

    public void equipLegs(Armour legs) {
        this.helm = legs;
    }

    public void equipBoots(Armour boots) {
        this.boots = boots;
    }

    public void equipGloves(Armour gloves) {
        this.gloves = gloves;
    }

    public void equipBackpack(Armour backpack) {
        this.backpack = backpack;
    }

    public void equipMHWeapon(Weapon mhWeapon) {
        this.mainHand = mhWeapon;
    }
//Printing info

    public void printName() {
        System.out.println(charName);
    }

    public void printEquip() {
        System.out.println("Equiped: ");
    }

    public void printInventory() {
        System.out.println("Inventory: ");
        for (int i = 0; i < lastEmpty; i++) {
            System.out.print(i + " " + Inventory[i].getName() + "\n");
        }
        System.out.println();
    }
//Inventory space calculation

    public int calcInventory() {
        /* Calculate inventory size from armour, stats and perks */
        int size = 0;
        return size;
    }
    
    //Setters and getters. Equip under this i guess. TONS of these

}
