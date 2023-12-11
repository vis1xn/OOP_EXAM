package ie.atu;

public class TRAWLER extends SHIP{
    private int Capacity;

    public TRAWLER(String name, String year, int crewNum, int capacity) {
        super(name, year, crewNum);
        Capacity = capacity;
    }
    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}
