import java.util.ArrayList;
class Bowler extends Cricketer {
    private ArrayList<Integer> runConceded;
    private ArrayList<Integer> wicketsTaken;

    public Bowler() {
        runConceded = new ArrayList<>();
        wicketsTaken = new ArrayList<>();
    }

    public Bowler(String name, int day, int month, int year, String country, ArrayList<Integer> runConceded, ArrayList<Integer> wicketsTaken) throws InvalidAgeException, InvalidCountryException {
        super(name, day, month, year, country);
        this.runConceded = runConceded;
        this.wicketsTaken = wicketsTaken;
    }

    public ArrayList<Integer> getRunConceded() {
        return runConceded;
    }

    public void setRunConceded(ArrayList<Integer> runConceded) {
        this.runConceded = runConceded;
    }

    public ArrayList<Integer> getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(ArrayList<Integer> wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    @Override
    public double getAverage() {
        if (wicketsTaken.size() == 0) {
            return 0.0;
        }

        int totalRunsConceded = 0;
        for (int run : runConceded) {
            totalRunsConceded += run;
        }

        return (double) totalRunsConceded / wicketsTaken.size();
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth().getTime() +
                ", country='" + getCountry() + '\'' +
                ", runConceded=" + runConceded +
                ", wicketsTaken=" + wicketsTaken +
                '}';
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}