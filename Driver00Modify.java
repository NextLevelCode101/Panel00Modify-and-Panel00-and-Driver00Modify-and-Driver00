import javax.swing.*;

public class Driver00Modify extends JPanel {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Lab00Modify");
    frame.setSize(700, 575);
    frame.setLocation(100, 50);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new Panel00Modify());
    frame.setVisible(true);
  }
}
