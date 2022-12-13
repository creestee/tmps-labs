package tmps;

import tmps.strategy.BuildTownStrategy;
import tmps.strategy.BuildVillageStrategy;
import tmps.strategy.Resource;
import tmps.template.Template;
import tmps.template.GameAiTemplate;

public class Main {
    public static void main(String[] args) {

        Template aiPlayer = new GameAiTemplate();
        aiPlayer.executeTurn();

        Resource resource1 = new Resource("Wood", new BuildVillageStrategy());
        Resource resource2 = new Resource("Stone", new BuildTownStrategy());

        System.out.println(resource1);
        System.out.println(resource2);
    }
}