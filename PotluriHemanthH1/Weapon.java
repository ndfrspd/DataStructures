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

  public int getDamage() {
    return damage;
    }

  public void setDamage(int damage) {
    this.damage = damage;
    }

   
  @Override   
  public void examine() {    
    super.examine();    
    // Print damage    
    System.out.println("Damage: " + this.damage);
    }
}
