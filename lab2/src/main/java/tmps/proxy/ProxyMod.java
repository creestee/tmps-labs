package tmps.proxy;

import tmps.facade.Save;

public class ProxyMod {

    public void turnOnOffServer() {
        Cloud.serverStatus = !Cloud.serverStatus;
    }

    public void loadToServerSave (Save save ) {

        String response = Cloud.loadSave( save );

        if ( response.equals("Success") ) {

            System.out.println("Save has been successfully loaded");

        } else {

            System.out.println( "Error: Couldn't load Save file to server.\nReason: Server's status is 'Offline'.");
        }

    }


}