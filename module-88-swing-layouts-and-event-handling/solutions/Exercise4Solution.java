import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Exercise4Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Key Event Monitor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setLocationRelativeTo(null);

            JTextField textField = new JTextField();
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    String line = "Key typed: " + e.getKeyChar()
                        + " | Key code: " + e.getKeyCode() + "\n";
                    textArea.append(line);
                }
            });

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(textField, BorderLayout.NORTH);
            panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
