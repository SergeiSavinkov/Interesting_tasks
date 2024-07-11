import javax.swing.*;
import java.awt.*;

public class Homework9 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("hello world");
        myFrame.setSize(400, 400);

        //Create layout
        myFrame.setLayout(new GridLayout(10, 1));

        //Создание кнопки
        JButton button = new JButton("hello world");
        myFrame.add(button);

        //Создание текстового поля
        JTextField textField = new JTextField("hello world");
        myFrame.add(textField);

        //Create label
        JLabel label = new JLabel("hello world");
        myFrame.add(label);

        //Create check box
        JCheckBox checkBox = new JCheckBox("hello world");
        myFrame.add(checkBox);

        //Create Text Area
        JTextArea textArea = new JTextArea("hello world");
        myFrame.add(new JScrollPane(textArea));

        //Create combo box
        JComboBox<String> comboBox = new JComboBox<>(new String[] {"hello world"});
        myFrame.add(comboBox);

        //Create list
        JList<String> list = new JList<>(new String[]{"hello world"});
        myFrame.add(new JScrollPane(list));

        //Create menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("hello world");
        myFrame.add(menuBar);
        myFrame.add(menu);
        myFrame.add(menuItem);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
