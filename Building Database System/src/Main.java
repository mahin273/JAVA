import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Building> buildings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Building #" + (i + 1));
                System.out.print("Enter building type (1 for sell, 2 for rent): ");
                int buildingType = scanner.nextInt();
                System.out.print("Enter building ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter number of floors: ");
                int noOfFloors = scanner.nextInt();
                System.out.print("Enter floor size (in square feet): ");
                int floorSize = scanner.nextInt();
                System.out.print("Enter number of units: ");
                int noOfUnits = scanner.nextInt();
                System.out.print("Enter day of building construction: ");
                int day = scanner.nextInt();
                System.out.print("Enter month of building construction: ");
                int month = scanner.nextInt();
                System.out.print("Enter year of building construction: ");
                int year = scanner.nextInt();

                if (buildingType == 1) {
                    BuildingForSell building = new BuildingForSell(id, noOfFloors, floorSize, noOfUnits, day, month, year);
                    building.setPerSquareFeetPrice(5000);
                    buildings.add(building);
                } else if (buildingType == 2) {
                    BuildingForRent building = new BuildingForRent(id, noOfFloors, floorSize, noOfUnits, day, month, year);
                    building.setPerSquareFeetPrice(5000);
                    buildings.add(building);
                }
            }

            Collections.sort(buildings, new Comparator<Building>() {
                @Override
                public int compare(Building b1, Building b2) {
                    if (b1.getDateBuilt().equals(b2.getDateBuilt())) {
                        return b2.getFloorSize() - b1.getFloorSize();
                    }
                    return b2.getDateBuilt().compareTo(b1.getDateBuilt());
                }
            });

            for (Building building : buildings) {
                if (building instanceof BuildingForSell) {
                    BuildingForSell buildingForSell = (BuildingForSell) building;
                    System.out.println("For sell: " + buildingForSell + ", Total Price: " + buildingForSell.getPrice()+" BDT");
                } else if (building instanceof BuildingForRent) {
                    BuildingForRent buildingForRent = (BuildingForRent) building;
                    System.out.println("For rent: " + buildingForRent + ", Total Price: " + buildingForRent.getPrice()+" BDT");
                }
            }
        } catch (BuildingException e) {
            System.out.println("Building Exception: " + e.getMessage());
        }
    }
}