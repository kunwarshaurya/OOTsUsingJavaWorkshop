import javax.swing.*;
import java.awt.*;

public class BoxLayoutEx{
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("Button 1"));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(new JButton("Button 2"));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(new JButton("Button 3"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
