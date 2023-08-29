import java.text.SimpleDateFormat;
import java.util.*;

class Cricketer {
    private String name;
    private Calendar dateOfBirth;
    private String country;

    public Cricketer() {
    }

    public Cricketer(String name, int day, int month, int year, String country) throws InvalidAgeException, InvalidCountryException {
        this.name = name;
        this.country = country;
        this.dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(year, month - 1, day);

        if (isUnderage()) {
            throw new InvalidAgeException("The player is not old enough!");
        }

        if (!isValidCountry()) {
            throw new InvalidCountryException("Country did not match");
        }
    }

    private boolean isUnderage() {
        Calendar today = Calendar.getInstance();
        today.add(Calendar.YEAR, -18);
        return dateOfBirth.after(today);
    }

    private boolean isValidCountry() {
        String[] validCountries = {"Bangladesh", "India", "Pakistan", "Sri Lanka", "England", "Australia", "New Zealand", "South Africa", "West Indies"};
        for (String validCountry : validCountries) {
            if (validCountry.equalsIgnoreCase(country)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateFormat.format(dateOfBirth.getTime()) +
                ", country='" + country + '\'' +
                '}';
    }

    public double getAverage() {
        return 0.0; // Default average for Cricketer class
    }
}