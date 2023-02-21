import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Polyline implements MouseListener{
    private ArrayList<Point> mPts = new ArrayList<Point>();


    public void clear() {
        mPts.clear();
    }

    public int getNumPts() {
        return mPts.size();
    }

    public Point getPoint(int i) {
        return mPts.get(i);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        ((JPanel)(e.getSource())).repaint();
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

}
