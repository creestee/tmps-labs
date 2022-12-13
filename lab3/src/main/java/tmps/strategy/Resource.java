package tmps.strategy;

public class Resource {
    private final String type;
    private final Strategy strategy;

    public Resource(String type, Strategy strategy) {
        this.type = type;
        this.strategy = strategy;
    }

    public String buildStructure() {
        return strategy.buildStructure();
    }

    @Override
    public String toString() {
        return "Resource {" +
                "type='" + type + "' " +
                this.strategy.buildStructure() + '\'' +
                '}';
    }
}
