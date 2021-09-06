package Map;

import java.util.ArrayList;

public class Room {
  String name;
  String description;
  public static ArrayList<String> roomNames = new ArrayList<>();
  public static ArrayList<String> roomDescriptions = new ArrayList<>();

  Room(String name, String description) {
    this.name = name;
    this.description = description;
  }


  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public void addArrayWords() {
    roomNames.add("Entrance");
    roomNames.add("Forsaken cave");
    roomNames.add("Dark Prison");
    roomNames.add("Sleepy Hollow");
    roomNames.add("Underground lake");
    roomNames.add("Disgusting pit");
    roomNames.add("Secret shop");
    roomNames.add("Hope of the lost king");
    roomNames.add("Crater of darkness");
    roomNames.add("Bob's house");
    roomNames.add("Exit");

    roomDescriptions.add("You have lost your memory, but find yourself at the entrance of a cave. Do you dare enter?");
    roomDescriptions.add("With Close to no light you walk slowly through the cave, but there's nothing but darkness around you.");
    roomDescriptions.add("A modest pair of granite doors in a murky forest marks the entrance to this dungeon. Beyond the pair of granite doors lies a grand, foggy room. It's covered in dirt, crawling insects and puddles of water.");
    roomDescriptions.add("You enter the next room and see a big hollow tree that sends shivers down your spine.");
    roomDescriptions.add("A small light enters from the roof of the cave and you find yourself at a lake");
    roomDescriptions.add("While walking, you trip and stumble into a hole. You land in something soggy and smelly.... you cant make out what it is.... but its disgusting");
    roomDescriptions.add("A dim light catches your eye, and you hear the faint sound of music. A man calls you over.\nThe man is a merchant and runs a small shop, he asks you to look around but never to tell anyone about him.");
    roomDescriptions.add("You find a door with a big Statue seemingly guarding it, however it is just a statue right?");
    roomDescriptions.add("Its very dark you cant see anything");
    roomDescriptions.add("You find a house... in such a dark place?");
    roomDescriptions.add("Congratulations you survived the Dungeon");
  }

  @Override
  public String toString() {
    return
        "You are now at the: " + name + "\n" +
            "description:'" + description;
  }
}
