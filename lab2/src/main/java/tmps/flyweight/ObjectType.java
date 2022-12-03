package tmps.flyweight;

public class ObjectType {
    String name;
    private String color;

    public ObjectType(String name, String color) {
        this.name = name;
        this.color = color;
        check();
    }

    public void check() {
        System.out.printf("ObjectType with name '%s' which has params: color = '%s' was created.%n", this.name, this.color);
    }
}
