import javax.swing.JOptionPane;

public class LCDCalculator {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first positive integer:");
        int n1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Enter the second positive integer:");
        int n2 = Integer.parseInt(input2);
        int lcd = findLCD(n1, n2);
        JOptionPane.showMessageDialog(null, "The LCD of " + n1 + " and " + n2 + " is: " + lcd);
    }

    public static int findLCD(int n1, int n2) {
        int lcd = (n1 * n2) / findGCD(n1, n2);
        return lcd;
    }

    public static int findGCD(int n1, int n2) {
        int d = Math.min(n1, n2);
        while (d >= 1) {
            if (n1 % d == 0 && n2 % d == 0) {
                return d;
            }
            d--;
        }
        return 1; // If no common divisor is found, 1 is the GCD
    }
}