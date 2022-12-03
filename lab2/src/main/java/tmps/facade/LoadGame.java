package tmps.facade;

public  class LoadGame {


    public static void loadFromSaveFile( Save save ) {
        System.out.printf("Game loaded from save file with pararms: game time = %d:%d:%d, history = %s, name of map = '%s'\n",
                save.world.mapOfWorld.time.day, save.world.mapOfWorld.time.month,
                save.world.mapOfWorld.time.year, save.history.historyData,
                save.world.mapOfWorld.nameOfWorld);
    }
}