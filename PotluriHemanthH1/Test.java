/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/14/2016
 *
 * This class tests the Item, Food, Armor, and Weapon classes.
 */

public class Test {

    public static void main(String[] args){
 
        // Item object creator and tester
        Item testItem = new Item("Ring", 69);
        testItem.examine();
        System.out.println('\n');
       
        // Food object creator and tester 
        Food testFood = new Food("Chocolate", 25, 500, 5);
        testFood.examine();
        System.out.println('\n');
    
        // Armor object creator and tester
        Armor testArmor = new Armor(45, "Plate Armor", 62);
        testArmor.examine();
        System.out.println('\n');
        
         // Create a Weapon object and test it
        Weapon testWeapon = new Weapon("Rapier", 23, 54);
        testWeapon.examine();

        // Change damage and print the new value
        testWeapon.setDamage(65);
        System.out.println('\n');
    
    }
}