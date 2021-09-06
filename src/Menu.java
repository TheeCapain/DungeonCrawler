import Map.Map;
import Player.Player;

public class Menu {
  Ui ui = new Ui();
  Controller controller = new Controller();
  Game game = new Game();
  Player player = new Player();
  Map map = new Map();

  public void runMenu() {
    map.addRoomsToMap();
    controller.MenuController(ui, game, player, controller, map);
  }
}
