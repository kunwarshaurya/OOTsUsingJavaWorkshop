import javax.swing.*;
import java.awt.event.*;

public class OKButtonHandler {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Handler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JButton okButton = new JButton("OK");

        // ActionListener
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "OK Button Clicked!");
            }
        });

        frame.getContentPane().add(okButton);
        frame.setVisible(true);
    }
}
