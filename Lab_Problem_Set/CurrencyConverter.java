import javax.swing.JOptionPane;
 public class CurrencyConverter {
    public static void main(String[] args) {
        // Prompt the user to enter the exchange rate
        String exchangeRateString = JOptionPane.showInputDialog(null, "Enter the exchange rate from USD to BDT:",
                "Currency Converter", JOptionPane.QUESTION_MESSAGE);
        double exchangeRate = Double.parseDouble(exchangeRateString);
         // Prompt the user to choose the conversion direction
        String[] options = { "USD to BDT", "BDT to USD" };
        int conversionDirection = JOptionPane.showOptionDialog(null, "Choose the conversion direction:", "Currency Converter",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
         // Prompt the user to enter the amount
        String amountString = JOptionPane.showInputDialog(null, "Enter the amount to convert:", "Currency Converter",
                JOptionPane.QUESTION_MESSAGE);
        double amount = Double.parseDouble(amountString);
         // Convert the amount based on the chosen conversion direction
        double convertedAmount;
        if (conversionDirection == 0) {
            convertedAmount = amount * exchangeRate;
            JOptionPane.showMessageDialog(null, amount + " USD is equal to " + convertedAmount + " BDT",
                    "Currency Converter", JOptionPane.INFORMATION_MESSAGE);
        } else {
            convertedAmount = amount / exchangeRate;
            JOptionPane.showMessageDialog(null, amount + " BDT is equal to " + convertedAmount + " USD",
                    "Currency Converter", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}