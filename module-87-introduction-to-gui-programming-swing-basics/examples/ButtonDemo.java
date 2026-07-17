import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JLabel label = new JLabel("Click the button");
            JButton button = new JButton("Click Me");

            button.addActionListener(new ActionListener() {
                private int clickCount = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    clickCount++;
                    label.setText("Button clicked " + clickCount + " time(s)");
                }
            });

            panel.add(label);
            panel.add(button);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
