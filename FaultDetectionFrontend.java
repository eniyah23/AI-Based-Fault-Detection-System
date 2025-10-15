import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FaultDetectionFrontend {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("AI-Based Fault Detection System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JLabel vibrationLabel = new JLabel("Vibration:");
        JTextField vibrationField = new JTextField();

        JLabel temperatureLabel = new JLabel("Temperature (°C):");
        JTextField temperatureField = new JTextField();

        JLabel pressureLabel = new JLabel("Pressure:");
        JTextField pressureField = new JTextField();

        JButton detectButton = new JButton("Detect Fault");
        JLabel resultLabel = new JLabel();
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        detectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double vibration = Double.parseDouble(vibrationField.getText());
                    double temperature = Double.parseDouble(temperatureField.getText());
                    double pressure = Double.parseDouble(pressureField.getText());

                    String result;
                    if (vibration > 0.1 || temperature > 100 || pressure > 2.0) {
                        result = "Fault Detected! Please inspect the machine.";
                        resultLabel.setForeground(Color.RED);
                    } else {
                        result = "System Normal.";
                        resultLabel.setForeground(new Color(0, 128, 0));
                    }
                    resultLabel.setText(result);

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Enter numeric values only.");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(vibrationLabel);
        panel.add(vibrationField);
        panel.add(temperatureLabel);
        panel.add(temperatureField);
        panel.add(pressureLabel);
        panel.add(pressureField);
        panel.add(new JLabel());
        panel.add(detectButton);
        panel.add(new JLabel("Result:"));
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
