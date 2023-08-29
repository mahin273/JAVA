import java.util.ArrayList;
class Batter extends Cricketer {
    private ArrayList<Integer> runScored;

    public Batter() {
        runScored = new ArrayList<>();
    }

    public Batter(String name, int day, int month, int year, String country, ArrayList<Integer> runScored) throws InvalidAgeException, InvalidCountryException {
        super(name, day, month, year, country);
        this.runScored = runScored;
    }

    public ArrayList<Integer> getRunScored() {
        return runScored;
    }

    public void setRunScored(ArrayList<Integer> runScored) {
        this.runScored = runScored;
    }

    @Override
    public double getAverage() {
        if (runScored.size() == 0) {
            return 0.0;
        }

        int totalRuns = 0;
        for (int run : runScored) {
            totalRuns += run;
        }

        return (double) totalRuns / runScored.size();
    }

    @Override
    public String toString() {
        return "Batter{" +
                "name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth().getTime() +
                ", country='" + getCountry() + '\'' +
                ", runScored=" + runScored +
                '}';
    }
}