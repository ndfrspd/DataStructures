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

  // Get damage method
  public int getDamage() {
    return damage;
    }

  // Set damage mehtod
  public void setDamage(int damage) {
    this.damage = damage;
    }
   
  @Override   
  public void examine() {    
    
    // Print name and weight
    super.examine();    
    
    // Print damage    
    System.out.println("Damage: " + this.damage);
    }
}
