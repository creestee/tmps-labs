package tmps.facade;

public class MapOfWorld {
    Time time;
    String nameOfWorld;
    int xSize, ySize, zSize;

    MapOfWorld( String nameOfWorld,int xSize, int ySize, int zSize, Time time ) {

        this.nameOfWorld = nameOfWorld;
        this.xSize = xSize;
        this.ySize = ySize;
        this.zSize = zSize;
        this.time = time;
    }
}