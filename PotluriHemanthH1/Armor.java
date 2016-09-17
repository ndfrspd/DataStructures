/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/17/2016
 * 
 * Armor Class: extends Item
 */

public class Armor extends Item {
  
  private int defense;
  private String name;
  private int weight;
  
  //Constructor
  public Armor(int defense, String name, int weight){
    super(name, weight);
    this.defense = defense;
    }
  
  // Get defense method
  public int getDefense(){
    return defense;
    }
  
  // Override Item.examine
  public void examine(){
    // print name and weight
    super.examine();
    
    //print defense
    System.out.println("Defense:" + defense);
  }
}
