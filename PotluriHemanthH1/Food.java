/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/14/2016
 * 
 * Food Class: extends Item
 */

public class Food extends Item {
  
  private int nutrition;
  private int quantity;

  //Constructor
  public Food(String name, int weight, int nutrition, int quantity) {
    super(name, weight);
    this.nutrition = nutrition;
    this.quantity = quantity;
    }

  // Set Nutrition method
  public void setNutrition(int nutrition) {
    this.nutrition = nutrition;
    }

  // Get nutrition method
  public int getNutrition() {
    return nutrition;
    }

  // Set Quantity method
  public void setQuantity(int quantity) {
    this.quantity = quantity;
    }
  
  // Get quantity method
  public int getQuantity() {
    return quantity;
    }
    
  @Override
  public void examine() {
    
    // print name and weight
    super.examine();
  
    //print quantity and nutrition    
    System.out.println("Quantity: " + this.quantity + "\nNutrition: " + this.nutrition);

    }
}