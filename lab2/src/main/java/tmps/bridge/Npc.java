package tmps.bridge;

public class Npc {

    public String name;
    String threeDimensionalModel;
    public int hp = 0;
    int x;
    int y;
    int z;

    public void death() {
    }

    public void attack(Npc npc) {
        npc.hp -= 0;
        System.out.printf("'%s' attacks %s with 0 DMG\n", this.name, npc.name);
    }

    public Npc(String name, String threeDimensionalModel, int x, int y, int z, int hp) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.threeDimensionalModel = threeDimensionalModel;
        this.hp = hp;
        System.out.printf("NPC with name: '%s' was created\n", this.name);
    }

    public void checkHPstatus() {
        System.out.printf("'%s' has %dHP%n\n", this.name, this.hp);
    }
}
