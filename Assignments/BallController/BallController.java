import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BallController {
    public void go() {
        JFrame	frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);


        JButton leftbutton = new JButton("left");
        JButton rightbutton = new JButton("right");
        JButton upbutton = new JButton("up");
        JButton downbutton = new JButton("down");
        BallViewer ball = new BallViewer();

        //ball.paintComponent();

        leftbutton.addActionListener(ball);
        rightbutton.addActionListener(ball);
        upbutton.addActionListener(ball);
        downbutton.addActionListener(ball);

        frame.getContentPane().add(BorderLayout.WEST,leftbutton);
        frame.getContentPane().add(BorderLayout.EAST,rightbutton);
        frame.getContentPane().add(BorderLayout.NORTH,upbutton);
        frame.getContentPane().add(BorderLayout.SOUTH,downbutton);
        frame.getContentPane().add(BorderLayout.CENTER,ball);


        frame.setVisible(true);

    }


}
