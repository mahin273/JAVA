import java.text.SimpleDateFormat;
import java.util.*;
class Building {
    private int id;
    private int noOfFloors;
    private int floorSize;
    private int noOfUnits;
    private double perSquareFeetPrice;
    private Calendar dateBuilt;

    public Building() {
    }

    public Building(int id, int noOfFloors, int floorSize, int noOfUnits, int day, int month, int year) throws BuildingException {
        if (noOfFloors < 5) {
            throw new BuildingException("Not enough floors!");
        }
        if (noOfUnits < 2) {
            throw new BuildingException("Not enough units!");
        }
        if (floorSize < 1800) {
            throw new BuildingException("Not big enough!");
        }

        this.id = id;
        this.noOfFloors = noOfFloors;
        this.floorSize = floorSize;
        this.noOfUnits = noOfUnits;
        this.dateBuilt = Calendar.getInstance();
        this.dateBuilt.set(year, month - 1, day);
    }

    // Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public int getFloorSize() {
        return floorSize;
    }

    public void setFloorSize(int floorSize) {
        this.floorSize = floorSize;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public double getPerSquareFeetPrice() {
        return perSquareFeetPrice;
    }

    public void setPerSquareFeetPrice(double perSquareFeetPrice) {
        this.perSquareFeetPrice = perSquareFeetPrice;
    }

    public Calendar getDateBuilt() {
        return dateBuilt;
    }

    public void setDateBuilt(Calendar dateBuilt) {
        this.dateBuilt = dateBuilt;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd / MM / yyyy");
        return "Building [id=" + id + ", noOfFloors=" + noOfFloors + ", floorSize=" + floorSize + ", noOfUnits="
                + noOfUnits + ", perSquareFeetPrice=" + perSquareFeetPrice + ",  dateBuilt="
                + dateFormat.format(dateBuilt.getTime()) + "]";
    }
}