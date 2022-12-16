package tmps.mediator;

public class Player {

    private String name;
    private Chat mediator;

    public Player(String name, Chat mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        mediator.showMessage(this, message);
    }

}