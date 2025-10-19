import javax.swing.*;
import java.awt.*;



public class Main {
    public static void main(String[] args) {

// creates frame
JFrame frame = new JFrame("Pomodoro Timer");

//this is a text label that goes somewhere in the interface idk where yet.
JLabel textLabel = new JLabel("test");

//make panel to hold the buttons
JPanel timerPanel = new JPanel();

//Start timer button
        JButton startTimer = new JButton("Start Timer");

startTimer.addActionListener(e -> System.out.println("Start Pomodoro Timer"));

//centers the text from test jlabel
textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.VERTICAL);
frame.add(textLabel);

//add button
        frame.add(startTimer);

//add panel to frame
frame.add(timerPanel, BorderLayout.NORTH);


//displays the window
frame.setSize(300, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

    }
}