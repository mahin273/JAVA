import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cricketer> cricketers = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Batter " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Day of birth: ");
                int day = scanner.nextInt();

                System.out.print("Month of birth: ");
                int month = scanner.nextInt();

                System.out.print("Year of birth: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Country: ");
                String country = scanner.nextLine();

                ArrayList<Integer> runScored = new ArrayList<>();
                System.out.print("Enter number of runs scored (separated by space): ");
                String runsInput = scanner.nextLine();
                String[] runsArray = runsInput.split(" ");
                for (String run : runsArray) {
                    runScored.add(Integer.parseInt(run));
                }

                Batter batter = new Batter(name, day, month, year, country, runScored);
                cricketers.add(batter);
                System.out.println("Batter added successfully.\n");
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Bowler " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Day of birth: ");
                int day = scanner.nextInt();

                System.out.print("Month of birth: ");
                int month = scanner.nextInt();

                System.out.print("Year of birth: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Country: ");
                String country = scanner.nextLine();

                ArrayList<Integer> runConceded = new ArrayList<>();
                System.out.print("Enter number of runs conceded (separated by space): ");
                String runsConcededInput = scanner.nextLine();
                String[] runsConcededArray = runsConcededInput.split(" ");
                for (String run : runsConcededArray) {
                    runConceded.add(Integer.parseInt(run));
                }

                ArrayList<Integer> wicketsTaken = new ArrayList<>();
                System.out.print("Enter number of wickets taken (separated by space): ");
                String wicketsTakenInput = scanner.nextLine();
                String[] wicketsTakenArray = wicketsTakenInput.split(" ");
                for (String wicket : wicketsTakenArray) {
                    wicketsTaken.add(Integer.parseInt(wicket));
                }

                Bowler bowler = new Bowler(name, day, month, year, country, runConceded, wicketsTaken);
                cricketers.add(bowler);
                System.out.println("Bowler added successfully.\n");
            }

            System.out.println("Cricketer Details:");
            for (Cricketer cricketer : cricketers) {
                System.out.println(cricketer);
                System.out.println("Average: " + cricketer.getAverage());
                System.out.println();
            }

            Collections.sort(cricketers, new Comparator<Cricketer>() {
                @Override
                public int compare(Cricketer c1, Cricketer c2) {
                    int year1 = c1.getDateOfBirth().get(Calendar.YEAR);
                    int year2 = c2.getDateOfBirth().get(Calendar.YEAR);
                    if (year1 != year2) {
                        return year1 - year2;
                    }

                    int month1 = c1.getDateOfBirth().get(Calendar.MONTH);
                    int month2 = c2.getDateOfBirth().get(Calendar.MONTH);
                    if (month1 != month2) {
                        return month1 - month2;
                    }

                    return c1.getName().compareTo(c2.getName());
                }
            });

            System.out.println("Sorted Cricketer Details:");
            for (Cricketer cricketer : cricketers) {
                System.out.println(cricketer);
                System.out.println("Average: " + cricketer.getAverage());
                System.out.println();
            }

            double maxAverage = 0.0;
            String batterWithMaxAverage = "";
            double minAverage = Double.MAX_VALUE;
            String bowlerWithMinAverage = "";

            for (Cricketer cricketer : cricketers) {
                if (cricketer instanceof Batter) {
                    double average = cricketer.getAverage();
                    if (average > maxAverage) {
                        maxAverage = average;
                        batterWithMaxAverage = cricketer.getName();
                    }
                } else if (cricketer instanceof Bowler) {
                    double average = cricketer.getAverage();
                    if (average < minAverage) {
                        minAverage = average;
                        bowlerWithMinAverage = cricketer.getName();
                    }
                }
            }

            System.out.println("Batter with the highest average: " + batterWithMaxAverage);
            System.out.println("Bowler with the lowest average: " + bowlerWithMinAverage);

        } catch (InvalidAgeException | InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}