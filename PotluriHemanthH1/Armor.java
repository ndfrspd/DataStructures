/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/14/2016
 * 
 * Armor Class: extends Item
 */

public class Armor extends Item {
  
  private int defense;
  
  //Constructor
  public Armor(int defense, String name, int weight){
    super(name, weight);
    this.defense = defense;
    }
   
  // Set defense method
  public void setDefense(int defense) {
    this.defense = defense;
    } 
  
  // Get defense method
  public int getDefense(){
    return defense;
    }
  
  @Override
  public void examine(){
   
    // print name and weight
    super.examine();
    
    //print defense
    System.out.println("Defense:" + defense);
  }
}
