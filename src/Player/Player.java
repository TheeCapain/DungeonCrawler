package Player;

import java.util.ArrayList;

public class Player {
  private int health;
  private String name;
  private int position;
  private ArrayList<String> inventory = new ArrayList<>();

  public Player(String name, int health, int position) {
    this.name = name;
    this.health = health;
    this.position = position;
  }

  public Player() {

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int setPosition(int position) {
    this.position = position;
    return position;
  }

  public int getPosition() {
    return position;
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }
}
