/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/14/2016
 * 
 * Item: superclass for Armor, Food, and Weapon
 */

public class Item {
  
  private String name;
  private int weight;
   
  //Constructor
  public Item(String name, int weight){
    this.name = name;
    this.weight = weight;
    }
 
  // Set weight mehtod
  public void setWeight(int weight) {
    this.weight = weight;
    }
  
  // Get weight method
  public int getWeight() {
    return weight;
    }

  // Set name mehtod
  public void setName(String name) {
    this.name = name;
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