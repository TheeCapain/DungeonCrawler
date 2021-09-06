import Map.Map;
import Character.Player;

public class Controller {
  Game game = new Game();


  void MenuController(Ui ui, Game game, Player player, Controller controller, Map map) {
    boolean run = true;
    do {
      ui.printMenu();
      switch (ui.getInput()) {
        case "1" -> game.newGame(ui, player, controller, map);
        case "2" -> game.loadGame();
        case "3" -> {
          ui.printMessage("Quitting...");
          run = false;
        }
      }

    } while (run);
  }

  void playerController(Ui ui, Map map, Player player) {
    ui.gameMenu();
    switch (ui.getInput()) {
      case "1" -> {
        ui.printMessage("You move on to the next room");
        game.moveToNextRoom(player, map);
        map.roomDetails(player.getPosition());
      }
      case "2" -> System.out.println("You investigate the area");
      case "3" -> System.out.println("You open your inventory");
      case "4" -> {
        System.out.println("You move back to the previous room");
        game.moveBackARoom(player, map);
        map.roomDetails(player.getPosition());
      }
    }


  }

}
