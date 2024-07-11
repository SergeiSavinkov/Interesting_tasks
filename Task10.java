import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework10 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }
    private static void createAndShowGui() {
        //Create frame
        JFrame myFrame = new JFrame("Number button");
        myFrame.setSize(400, 400);
        myFrame.setLocationRelativeTo(null);

        //Create button
        JButton button = new JButton("1");
        Dimension buttonSize = new Dimension(400, 400);
        button.setPreferredSize(buttonSize);

        //Добавления обработчика действия
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(button.getText());
                button.setText(String.valueOf(currentValue+1));
            }
        });

        //Create layout
        myFrame.setLayout(new FlowLayout());

        //Create panel for button
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);

        myFrame.add(panel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
