package ie.atu;

public class SHIP {
 private String name;
 private String year;
 private int crewNum;
 private String vesselDetails;

    public SHIP(String name, String year, int crewNum) {
        this.name = name;
        this.year = year;
        this.crewNum = crewNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {

        this.year = year;
    }

    public int getCrewNum() {
        return crewNum;
    }

    public void setCrewNum(int crewNum) {
        this.crewNum = crewNum;
    }




}
