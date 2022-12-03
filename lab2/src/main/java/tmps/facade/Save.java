package tmps.facade;

import tmps.bridge.Npc;
import tmps.flyweight.WorldObj;

public class Save {
    World world;
    History history;

    Save(World world, History history, WorldObj[] trees, Npc[] npc) {
        this.world = world;
        this.history = history;
    }

}