import javax.swing.*;
import java.awt.*;

public class AllTheBestColors extends JFrame {
    public AllTheBestColors() {
        setTitle("All The Best in Colors");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        String text = "All The Best";
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA ,Color.CYAN,Color.BLACK};
        int y = 80;
        for (Color c : colors) {
            g.setColor(c);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString(text, 100, y);
            y += 40;
        }
    }

    public static void main(String[] args) {
        AllTheBestColors frame = new AllTheBestColors();
        frame.setVisible(true);
    }
}