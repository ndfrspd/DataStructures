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

  //Constructor
  public Armor(int defense, String name, int weight){
    super(name, weight);
    this.defense = defense;
    }
}
