import javax.swing.*;
import java.awt.*;



public class Main {
    public static void main(String[] args) {

// creates frame
JFrame frame = new JFrame("Pomodoro Timer");

// center text label
JLabel textLabel = new JLabel("Click start/stop timer button to start the timer.");

//make panel to hold the buttons
JPanel timerPanel = new JPanel();

//Start timer button
        JButton startstopTimer = new JButton("Start/Stop Timer");
startstopTimer.addActionListener(e -> System.out.println("start/stop Pomodoro Timer"));

//Reset timer button
        JButton reset = new JButton("Reset");
        reset.addActionListener(e -> System.out.println("reset Pomodoro Timer"));

//centers the text from test jlabel
textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.VERTICAL);
frame.add(textLabel);

//add buttons to panel
       timerPanel.add(startstopTimer);
        timerPanel.add(reset);

//add panels to frame
frame.add(timerPanel, BorderLayout.NORTH);


//displays the window
frame.setSize(300, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

    }
}