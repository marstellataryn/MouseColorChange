import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseColorChange extends JFrame {

    private Color circleColor;

    //constructor
    public MouseColorChangeolorChange() {
        circleColor = Color.BLACK; // circle begins black

        // add mouse listener to change circle color
        addMouseListener(new MouseAdapter() {
            //event handler
            @Override
            public void mousePressed(MouseEvent e) {
                circleColor = Color.BLACK; // change color on press
                repaint(); 
            }

            // event handler for mouse release
            @Override 
            public void mouseReleased(MouseEvent e) {
                circleColor = Color.WHITE; // change to white upon release
                repaint(); // refresh window
            }
        });
        // basic window setup
        setSize(300, 300);
        setDefaultCloseOperation(JFRame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // method to paint circle on window
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(circleColor);
        g.fillOval(50, 50, 200, 200);
    }

    //main method

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseColorChange());
    }
    
}
