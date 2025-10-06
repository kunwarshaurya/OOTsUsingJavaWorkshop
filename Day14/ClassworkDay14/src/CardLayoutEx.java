import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card One"));

        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card Two"));


        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");

        JPanel buttonPanel = new JPanel();
        JButton btn1 = new JButton("Show Card 1");
        JButton btn2 = new JButton("Show Card 2");
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);

        btn1.addActionListener(e -> cardLayout.show(cardPanel, "Card 1"));
        btn2.addActionListener(e -> cardLayout.show(cardPanel, "Card 2"));

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
