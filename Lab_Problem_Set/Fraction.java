public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }

    public void add(Fraction fraction) {
        numerator = numerator * fraction.getDenominator() + fraction.getNumerator() * denominator;
        denominator = denominator * fraction.getDenominator();
    }

    public void sub(Fraction fraction) {
        numerator = numerator * fraction.getDenominator() - fraction.getNumerator() * denominator;
        denominator = denominator * fraction.getDenominator();
    }

    public void multiplication(Fraction fraction) {
        numerator = numerator * fraction.getNumerator();
        denominator = denominator * fraction.getDenominator();
    }

    public void division(Fraction fraction) {
        numerator = numerator * fraction.getDenominator();
        denominator = denominator * fraction.getNumerator();
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 5);
        System.out.println("Fraction 1: " + fraction1.toString());
        System.out.println("Fraction 2: " + fraction2.toString());
        fraction1.add(fraction2);
        System.out.println("After addition: " + fraction1.toString());
        fraction1.sub(fraction2);
        System.out.println("After subtraction: " + fraction1.toString());
        fraction1.multiplication(fraction2);
        System.out.println("After multiplication: " + fraction1.toString());
        fraction1.division(fraction2);
        System.out.println("After division: " + fraction1.toString());
    }
}