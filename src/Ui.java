import java.util.Scanner;

public class Ui {
  Scanner scan = new Scanner(System.in);

  void printMessage(String message) {
    System.out.println(message);
  }

  String getInput() {
    return this.scan.nextLine();
  }

  void printMenu() {
    printMessage("Welcome to DungeonCrawler");
    printMessage("1. Start new game");
    printMessage("2. Load game");
    printMessage("3. Exit");
  }

  void gameMenu(){
    printMessage("1. Move on the the next room");
    printMessage("2. Investigate");
    printMessage("3. Open inventory");
    printMessage("4. Go back");
    printMessage("5. Save and quit");
  }

}
