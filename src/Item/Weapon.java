package Item;

import java.util.ArrayList;

public class Weapon extends Item {
  ArrayList<Weapon> weapons = new ArrayList<>();
  private String name;
  private int damage;

  Weapon(String name, int damage) {
    this.name = name;
  }

  @Override
  void useItem() {
    super.useItem();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
}
