import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// A GUI is a graphical user interface
// It is a system of interactive visual components for computer software
// A GUI displays objects that convey info & represent actions that can be taken by the user.
// The object may change color, size or visibility when interacted with.
public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    JFrame frame;
    JPanel panel;

    // GUI stands for graphical user interface.
    // GUI's are like the graphics you see for WoW or Adobe Photoshop.

    public GUI(){
        // Create a J Frame Object
      frame = new JFrame();

        // Creates a J Button
        JButton button = new JButton("Click Me");
        // Sets up the button.
        button.addActionListener(this);

        // Adds a label
       label = new JLabel("Number of Clicks: 0");

        // Creates a J Panel Object.
        panel = new JPanel();

        // The next two lines will handle the setup of the JPanel.
        // Chiefly it will set up the border & the layout.
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        // Adds the button to the panel.
        panel.add(button);
        // Adds the label to the panel.
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        // Set what happens when they close the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the title of the Window.
        frame.setTitle("Our GUI");
        // Sets the window to match a certain size.
        frame.pack();
        // Sets the window to be visible and in focus.
        frame.setVisible(true);
    }

    public static void main(String [] args){
        // TODO Auto
        new GUI();
    }


    // This is all tied to our button object.
    @Override
    public void actionPerformed(ActionEvent e) {
    count ++;
    label.setText("Number of clicks: " + count);
    }
}
