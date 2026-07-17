import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Exercise2Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Login Form");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
            JTextField usernameField = new JTextField();
            JPasswordField passwordField = new JPasswordField();

            centerPanel.add(new JLabel("Username:", JLabel.RIGHT));
            centerPanel.add(usernameField);
            centerPanel.add(new JLabel("Password:", JLabel.RIGHT));
            centerPanel.add(passwordField);

            JButton loginButton = new JButton("Login");
            loginButton.addActionListener(e -> {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if ("java".equals(password)) {
                    JOptionPane.showMessageDialog(frame,
                        "Welcome, " + username + "!",
                        "Login Successful",
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame,
                        "Access denied",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
                }
            });

            frame.add(centerPanel, BorderLayout.CENTER);
            frame.add(loginButton, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
