package Map;

import java.util.ArrayList;

public class Map {
  public ArrayList<Room> map = new ArrayList<>();

  public void printMap() {
    for (int i = 0; i < map.size(); i++) {
      System.out.println(map.get(i).toString());
    }
  }

  public void getMapPosition(int placement) {
    map.get(placement);
  }

  public void roomDetails(int placement) {
    System.out.println("Room: " + map.get(placement).getName() +"\nDescription: "+ map.get(placement).getDescription());
  }

  public void addRoomsToMap() {
    map.add(new Room("Entrance", "You have lost your memory, but find yourself at the entrance of a cave. Do you dare enter?"));
    map.add(new Room("Forsaken cave", "With Close to no light you walk slowly through the cave, but there's nothing but darkness around you."));
    map.add(new Room("Dark Prison", "A modest pair of granite doors in a murky forest marks the entrance to this dungeon. Beyond the pair of granite doors lies a grand, foggy room. It's covered in dirt, crawling insects and puddles of water."));
    map.add(new Room("Sleepy Hollow", "You enter the next room and see a big hollow tree that sends shivers down your spine."));
    map.add(new Room("Underground lake", "A small light enters from the roof of the cave and you find yourself at a lake"));
    map.add(new Room("Disgusting pit", "While walking, you trip and stumble into a hole. You land in something soggy and smelly.... you cant make out what it is.... but its disgusting"));
    map.add(new Room("Secret shop", "A dim light catches your eye, and you hear the faint sound of music. A man calls you over.\nThe man is a merchant and runs a small shop, he asks you to look around but never to tell anyone about him."));
    map.add(new Room("Hope of the lost king", "You find a door with a big Statue seemingly guarding it, however it is just a statue right?"));
    map.add(new Room("Crater of darkness", "Its very dark you cant see anything"));
    map.add(new Room("Bob's house", "You find a house... in such a dark place?"));
    map.add(new Room("Exit", "Congratulations you survived the Dungeon"));

  }


}
