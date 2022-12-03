package tmps;

import tmps.adapter.NpcInfo;
import tmps.bridge.Bee;
import tmps.bridge.Spider;
import tmps.facade.LoadGame;
import tmps.facade.Save;
import tmps.facade.SaveGame;
import tmps.flyweight.ObjectType;
import tmps.flyweight.WorldObj;
import tmps.proxy.ProxyMod;

import static tmps.adapter.NpcInfo.getData;

public class Main {
    public static void main(String[] args) {

        System.out.println("Game started!");
        // Flyweight
        ObjectType Diamond = new ObjectType("Diamond", "Blue");

        WorldObj WorldObj = new WorldObj(33, 55, -2, 11, 3, 1, Diamond);
        WorldObj.check();

        System.out.println();

        ObjectType Drop = new ObjectType("Drop", "Gold");

        WorldObj worldObj = new WorldObj(54, 24, 16, 1, 4, 6, Drop);
        worldObj.check();

        System.out.println();

        Spider Spider = new Spider("Spider", "Spiders", 15, 15, 0, 100, 14, 3);
        Spider.checkHPstatus();


        Bee Bee = new Bee("Bee", "Bees", 55, 155, 0, 350, 45, 2);
        Bee.checkHPstatus();

        Bee.attack(WorldObj);

        if (WorldObj.isDestroyed)
            System.out.println("WorldObj is destroyed");

        Spider.attack(Bee);
        Bee.checkHPstatus();

        NpcInfo.printNPCInfo(getData( Bee ));

        Save save = SaveGame.createSaveFile();

        LoadGame.loadFromSaveFile(save);

        System.out.println("______( E N D )_______\n");

        ProxyMod proxyMod = new ProxyMod();

        proxyMod.loadToServerSave(save);

        proxyMod.turnOnOffServer();

        proxyMod.loadToServerSave(save);
    }
}