package tmps.template;

public abstract class Template {
    public final void executeTurn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    public abstract void collectResources();
    public abstract void buildStructures();
    public abstract void buildUnits();
    public abstract void attack();
}