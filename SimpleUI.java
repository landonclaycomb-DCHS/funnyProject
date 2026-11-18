import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleUI {
    public static void main(String[] args) {
        // 1. Create the main window
        JFrame frame = new JFrame("My First Java UI");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); // Organizes items left-to-right

        // 2. Create UI components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Greet Me");

        // 3. Add interactivity when the button is clicked
        button.addActionListener(e -> {
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
        });

        // 4. Add components to the window and make it visible
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setLocationRelativeTo(null); // Centers window on screen
        frame.setVisible(true);
    }
}
