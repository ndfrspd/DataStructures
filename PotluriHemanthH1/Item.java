/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/17/2016
 * 
 * Item: superclass to Armor, Food, and Weapon
 */

public class Item {
  
  private String name;
  private int weight;
   
  //Constructor
  public Item(String name, int weight){
    this.name = name;
    this.weight = weight;
    }
  
  // Get weight method
  public int getWeight() {
    return weight;
    }

  // Get name method
  public String getName() {
    return name;
    }
    
  // prints the name and weight of the object
  public void examine(){
    System.out.println("Name: " + this.name + "\nWeight: " + this.weight);
    }
}