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
 
        // Food object creator and tester 
        Food testFood = new Food("Chocolate", 25, 500, 5);
        testFood.examine();
        System.out.println(testFood.getName());
        System.out.println(testFood.getWeight());
        System.out.println(testFood.getNutrition());
        System.out.println(testFood.getQuantity());
        System.out.println('\n');
    
    
    }
}