package tmps;

import tmps.mediator.Chat;
import tmps.mediator.Player;
import tmps.strategy.BuildTownStrategy;
import tmps.strategy.BuildVillageStrategy;
import tmps.strategy.Resource;
import tmps.template.Template;
import tmps.template.GameAiTemplate;

public class Main {
    public static void main(String[] args) {

        Template aiPlayer = new GameAiTemplate();
        aiPlayer.executeTurn();

        Chat chat = new Chat();
        Player humanPlayer = new Player("Player1", chat);

        System.out.println();
        humanPlayer.sendMessage("I have to take a turn");

        System.out.println();
        System.out.println("[ Player 1 is taking his turn ]");
        System.out.println();

        Resource resource1 = new Resource("Wood", new BuildVillageStrategy());
        Resource resource2 = new Resource("Stone", new BuildTownStrategy());

        System.out.println(resource1);
        System.out.println(resource2);
    }
}