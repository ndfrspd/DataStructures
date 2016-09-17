/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/17/2016
 *
 * This class tests the Item, Food, Armor, and Weapon classes.
 */

public class Test {

    public static void main(String[] args){
 
        // Item object creator and tester
        Item testItem = new Item("Ring", 69);
        testItem.examine();
        System.out.println(testItem.getName());
        System.out.println(testItem.getWeight());
        System.out.println('\n');
       
        // Food object creator and tester 
        Food testFood = new Food("Chocolate", 25, 500, 5);
        testFood.examine();
        System.out.println(testFood.getName());
        System.out.println(testFood.getWeight());
        System.out.println(testFood.getNutrition());
        System.out.println(testFood.getQuantity());
        System.out.println('\n');
    
        // Armor object creator and tester
        Armor testArmor = new Armor(45, "Plate Armor", 62);
        testArmor.examine();
        System.out.println(testArmor.getName());
        System.out.println(testArmor.getWeight());
        System.out.println(testArmor.getDefense());
        System.out.println('\n');
        
         // Create a Weapon object and test it
        Weapon testWeapon = new Weapon("Rapier", 23, 54);
        testWeapon.examine();
        System.out.println(testWeapon.getName());
        System.out.println(testWeapon.getWeight());

        // Change damage and print the new value
        testWeapon.setDamage(65);
        System.out.println(testWeapon.getDamage());
        System.out.println('\n');
    
    }
}