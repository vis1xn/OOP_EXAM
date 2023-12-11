package ie.atu;

public class FERRY extends SHIP{
    private int passNum;

    public FERRY(String name, String year, int crewNum, int passNum) {
        super(name, year, crewNum);
        this.passNum = passNum;
    }
    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }
}
