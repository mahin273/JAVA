import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public TemperatureConverter() {
        // Set up the JFrame
        setTitle("Temperature Converter");
        setBackground(Color.RED);
        setSize(700, 600);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        convertButton.setBackground(Color.CYAN);
       
        resultLabel = new JLabel();
        
        // A
        add(inputField);
        add(convertButton);
        add(resultLabel);
        
        // Handle events
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputTemperature = Double.parseDouble(inputField.getText());

                    // Convert temperature
                    double celsius = (inputTemperature - 32) * 5 / 9;
                    double kelvin = celsius + 273.15;
                    double fahrenheit = (inputTemperature * 9 / 5) + 32;

                    // Display results
                    String result = "Celsius: " + celsius + "°C\n"
                            + "Kelvin: " + kelvin + "K\n"
                            + "Fahrenheit: " + fahrenheit + "°F";
                    resultLabel.setText(result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        // Set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TemperatureConverter();
            }
        });
    }
}