/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Arrava {

    public static void main(String[] args) {
        Character Fynza = new Character();
        Fynza.addItem(new Weapon());
        Fynza.addItem(new Armour()); 
        Fynza.printInventory();
        Fynza.printEquip();
        Fynza.printName();
        }

    }


