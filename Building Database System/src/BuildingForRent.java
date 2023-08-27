import java.util.*;
class BuildingForRent extends Building {
    public BuildingForRent(int id, int noOfFloors, int floorSize, int noOfUnits, int day, int month, int year) throws BuildingException {
        super(id, noOfFloors, floorSize, noOfUnits, day, month, year);
    }

    public double getPrice() {
        double basePrice = getFloorSize() * getPerSquareFeetPrice();
        return (basePrice / 600) + ((basePrice / 600) * 0.5);
    }
}

class BuildingException extends Exception {
    public BuildingException(String message) {
        super(message);
    }
}