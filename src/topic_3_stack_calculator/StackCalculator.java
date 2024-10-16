package topic_3_stack_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculator extends JFrame implements ActionListener {

    private Stack<Integer> stack;
    private JTextArea display;

    public StackCalculator() {
        stack = new Stack<>();
        setupFrame();
        setupDisplay();
        setupButtons();
    }

    private void setupFrame() {
        setTitle("Stack Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);
    }

    private void setupDisplay() {
        display = new JTextArea(3, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 16));
        display.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(display);
        add(scrollPane, BorderLayout.NORTH);
    }

    private void setupButtons() {
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 1; i <= 9; i++) {
            addButton(buttonPanel, String.valueOf(i));
        }
        addButton(buttonPanel, "0");

        addButton(buttonPanel, "+");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "/");

        add(buttonPanel, BorderLayout.CENTER);
    }

    private void addButton(JPanel panel, String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.addActionListener(this);
        panel.add(button);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0))) {
            stack.push(Integer.parseInt(command));
            displayStack();
        } else {
            performOperation(command);
        }
        
    }

}
