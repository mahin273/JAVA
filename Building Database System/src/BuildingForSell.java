import java.util.*;
class BuildingForSell extends Building {
    public BuildingForSell(int id, int noOfFloors, int floorSize, int noOfUnits, int day, int month, int year) throws BuildingException {
        super(id, noOfFloors, floorSize, noOfUnits, day, month, year);
    }

    public double getPrice() {
        double basePrice = getFloorSize() * getPerSquareFeetPrice();
        int yearsOld = Calendar.getInstance().get(Calendar.YEAR) - getDateBuilt().get(Calendar.YEAR);

        if (yearsOld > 30) {
            if (yearsOld <= 40) {
                return basePrice + (basePrice * 0.1);
            } else if (yearsOld <= 50) {
                return basePrice + (basePrice * 0.2);
            } else {
                return basePrice + (basePrice * 0.3);
            }
        }

        return basePrice;
    }
}