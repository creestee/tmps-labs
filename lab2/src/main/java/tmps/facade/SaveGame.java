package tmps.facade;

import tmps.bridge.Npc;
import tmps.flyweight.WorldObj;

public class SaveGame {

    public static Save createSaveFile() {
        History history = new History("Some data about save");
        Time time = new Time(2019, 12, 31, 13, 25);
        MapOfWorld mapOfWorld = new MapOfWorld("World-Z", 10000, 10000, 5000, time);
        World world = new World(mapOfWorld);
        WorldObj[] trees = new WorldObj[99];
        Npc[] npc = new Npc[99];

        System.out.printf("Game was saved with params: game time = %d:%d:%d, history = %s, name of map = '%s'\n",
                world.mapOfWorld.time.day, world.mapOfWorld.time.month, world.mapOfWorld.time.year,
                history.historyData, world.mapOfWorld.nameOfWorld);

        return new Save(world, history, trees, npc);
    }
}