/**
 * Hemanth Potluri
 * 
 * ICSI 213
 * 
 * 9/17/2016
 * 
 * Weapon Class: extends Item
 */

public class Weapon extends Item {

  private int damage;
  
  //Constructor
  public Weapon(String name, int weight, int damage) {
    super(name, weight);
    this.damage = damage;
    }
  
  

}