package tmps.template;

public class GameAiTemplate extends Template {
    @Override
    public void collectResources() {
        System.out.println("-- Resources collected --");
    }

    @Override
    public void buildStructures() {
        System.out.println("-- Structures built --");
    }

    @Override
    public void buildUnits() {
        System.out.println("-- Units build --");
    }

    @Override
    public void attack() {
        System.out.println("-- Game AI has attacked and finished its turn --");
    }
}