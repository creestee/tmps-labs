package tmps.proxy;


import tmps.facade.Save;

public class Cloud {

    public static boolean serverStatus = true;

    static String loadSave ( Save save ) {
        if( save != null && serverStatus) {
            return "Success";
        } else {
            return "Server is offline";
        }

    }

}
