import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BallViewer extends JPanel implements ActionListener {

    int setx = 30;
    int sety = 30;

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.YELLOW);
        g.fillOval(setx, sety,30,30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JButton btn = (JButton)e.getSource();
        if(btn.getText() == "left"){
            setx = setx - 10;
            repaint();
        }
        if(btn.getText() == "right"){
            setx = setx + 10;
            repaint();
        }
        if(btn.getText() == "up"){
            sety = sety - 10;
            repaint();
        }
        if(btn.getText() == "down"){
            sety = sety + 10;
            repaint();
        }

        repaint();
    }

}

