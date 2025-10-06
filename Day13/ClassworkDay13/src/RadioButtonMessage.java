import javax.swing.*;
import java.awt.*;

public class RadioButtonMessage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel messageLabel = new JLabel("Choose your favorite language:");
        JRadioButton javaButton = new JRadioButton("Java");
        JRadioButton pythonButton = new JRadioButton("Python");
        JRadioButton cppButton = new JRadioButton("C++");
        JRadioButton cButton = new JRadioButton("C");

        // ensures only one radio button  selected at a time.
        ButtonGroup group = new ButtonGroup();
        group.add(javaButton);
        group.add(pythonButton);
        group.add(cppButton);
        group.add(cButton);
        frame.add(messageLabel);
        frame.add(javaButton);
        frame.add(pythonButton);
        frame.add(cppButton);
        frame.add(cButton);

        frame.setVisible(true);
    }
}
