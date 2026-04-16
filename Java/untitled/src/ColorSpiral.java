import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSpiral extends JPanel{
    private float hue = 0.0f;

    public ColorSpiral(){
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.translate(getWidth()/2,getHeight()/2);
        for (int i = 0; i<75; i++){
            g2d.setColor(Color.getHSBColor(hue, 1.0f,1.0f));
            hue += 0.002f;
            if (hue > 1.0f) hue -= 1.0f;

            g2d.rotate(Math.toRadians(1));
            g2d.drawLine(0,0,1,0);
        }
        for (int i = 0; i<2; i++){
            g2d.rotate(Math.toRadians(2));
            g2d.drawOval(-140,-140,280,280);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Spiral");
        ColorSpiral panel = new ColorSpiral();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600,600);
        frame.add(panel);
        frame.setVisible(true);
    }
}