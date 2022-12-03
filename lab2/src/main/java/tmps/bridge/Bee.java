package tmps.bridge;

import tmps.flyweight.WorldObj;

public class Bee extends Npc {

    int attackStrength, speed, defense;

    public Bee(String name, String threeDimensionalModel, int x, int y, int z, int hp, int attackStrength, int speed) {
        super(name, threeDimensionalModel, x, y, z, hp);
        this.attackStrength = attackStrength;
        this.speed = speed;
    }

    public void attack(Npc npc) {
        npc.hp -= attackStrength;
        System.out.printf("'%s' attacks '%s' with %d DMG\n", this.name, npc.name, this.attackStrength);
    }

    public void attack(WorldObj tree) {
        System.out.printf("%s destroyed %s\n", this.name, tree.askName());
        tree.isDestroyed = true;
    }

}