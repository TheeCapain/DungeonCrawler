import Map.Map;
import Player.Player;

public class Game {

  void newGame(Ui ui, Player player, Controller controller, Map map) {
    resetPlayer(ui);
    map.roomDetails(0);
    gameRunning(controller,map,ui,player);


  }

  void gameRunning(Controller controller, Map map, Ui ui, Player player) {
    boolean run = true;
    while (run) {
      controller.playerController(ui, map, player);
      if (map.map.get(player.getPosition()).getName().equals("Exit")) {
        ui.printMessage("You Win!");
        run = false;
      }
    }


  }

  void moveToNextRoom(Player player, Map map) {
    map.getMapPosition(player.setPosition((player.getPosition() + 1)));
  }

  void moveBackARoom(Player player, Map map) {
    map.getMapPosition(player.setPosition((player.getPosition() - 1)));
  }


  void resetPlayer(Ui ui) {
    ui.printMessage("What is your name?: ");
    String name = ui.getInput();
    ui.printMessage("Welcome " + name);


  }


  void loadGame() {

  }
}
