import javax.swing.*;

public class Frame {
    JFrame frame;
    // Constructor______________________________________________________________________________________________________
    Frame(){
        // build the frame
        this.frame = new JFrame();
        this.frame.setSize(1400, 800);
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addLabel();
    }

    public void addLabel(){
        JLabel label = new JLabel("ooo a label"); // Create a label with the text as the parameter
        label.setLocation(500, 500);
        this.frame.add(label); // Adds the created label to the frame
    }
}
