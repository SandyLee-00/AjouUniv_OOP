import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyDrawPanel extends JPanel implements ActionListener {
    private Polyline mPolyline;

    public void setPolyLine(Polyline pline) {
        mPolyline = this.add(pline);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        Graphics2D	g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(3));

        g.fillRect(this.getX(), this.getY(), 10,10);
        //  draw each edge with g.drawLine()
        g.drawLine();
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JButton btn = (JButton) e.getSource();
        if (btn.getText() == "clear") {
            mPolyline.clear();
        }
    }

}
