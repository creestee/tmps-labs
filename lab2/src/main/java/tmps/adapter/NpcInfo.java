package tmps.adapter;

import tmps.bridge.Npc;

public class NpcInfo {

    public static void printNPCInfo(String[] data) {
        System.out.printf("Name: '%s' HP: %s Type: %s \n", data[0], data[1], data[2]);
    }

    public static String[] getData(Npc npc) {

        String[] data = new String[3];
        data[0] = npc.name;
        data[1] = Integer.toString(npc.hp);
        data[2] = npc.getClass().getSimpleName();

        return data;
    }
}
