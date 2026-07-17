import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Exercise3Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mouse Event Painter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setLocationRelativeTo(null);

            List<Point> points = new ArrayList<>();

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.BLUE);
                    for (Point p : points) {
                        g.fillOval(p.x - 5, p.y - 5, 10, 10);
                    }
                }
            };
            panel.setPreferredSize(new Dimension(500, 400));
            panel.setBackground(Color.WHITE);

            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    points.add(e.getPoint());
                    panel.repaint();
                }
            });

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
