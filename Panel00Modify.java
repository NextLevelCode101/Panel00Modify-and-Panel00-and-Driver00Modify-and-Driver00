import javax.swing.*;
import java.awt.*;

public class Panel00Modify extends JPanel {
  public void paintComponent(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(50, 50, 50, 50); 

    g.setColor(Color.BLUE);
    g.fillOval(150, 50, 30, 40); 

    g.setColor(Color.GREEN);
    g.fillRect(250, 50, 100, 100); 

    g.setColor(Color.ORANGE);
    g.fillOval(350, 50, 100, 30);
    g.setColor(Color.BLACK);

    g.setFont(new Font("Freestyle Script", Font.PLAIN, 20));
    g.drawString("Farhan", 50, 150);

    g.setFont(new Font("Palatino", Font.BOLD, 30));
    g.drawString("Khan", 150, 150);

    g.setFont(new Font("Book Antiqua", Font.ITALIC, 40));
    g.drawString("Hello", 250, 150);


    g.setFont(new Font("Cedarville Cursive", Font.BOLD | Font.ITALIC, 50));
    g.drawString("World", 350, 150);
  }
}