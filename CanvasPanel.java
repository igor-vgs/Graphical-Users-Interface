import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private  int tubes = 1;
    private int wheels = 3;
    private int color = 1;

    public void setColor(int c) {
        color = c;
        repaint();
    }

    public void setWheels(int w) {
        wheels = w;
        repaint();
    }

    public void setTubes(int t){
        tubes = t;
        repaint();
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (color==1){
            g.setColor(Color.BLACK);
        }
        if (color==2){
            g.setColor(Color.BLUE);
        }
        if (color==3){
            g.setColor(Color.RED);
        }
        if (color==4){
            g.setColor(Color.YELLOW);
        }
        g.drawRect(0, 50, 100, 50);
        int r = 100 / wheels;
        for(int i = 0; i < wheels; i++){
            g.drawOval(i*r,100 , r, r);
        }
        int h = 10;
        int w = 50/tubes;
        for(int i = 0; i < tubes; i++){
            g.drawRect(i * w + 2*i, 50 - h ,w , h);
        }
    }
}
