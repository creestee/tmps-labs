package tmps.mediator;

import java.util.Date;

public class Chat {

    public void showMessage(Player player, String message){
        System.out.println(new Date().toString() + " [" + player.getName() + "] : " + message);
    }
}