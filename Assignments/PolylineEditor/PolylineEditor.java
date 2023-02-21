
import java.awt.BorderLayout;

import javax.swing.*;

public class PolylineEditor {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PolylineEditor gui = new PolylineEditor();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Polyline Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = (BorderLayout)frame.getContentPane().getLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        frame.setSize(800, 800);
        frame.setVisible(true);

        JButton Btn = new JButton("clear");
        MyDrawPanel line = new MyDrawPanel();

        Btn.addActionListener(line);

        frame.getContentPane().add(BorderLayout.SOUTH, Btn);

    }



}
