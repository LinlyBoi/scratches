import javax.swing.*;
import java.awt.*;

class Scratch {
    public static void main(String[] args) {
        Frame69 f = new Frame69();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); //wether it should run in background or not

    }
    static class Frame69 extends JFrame //sub class of JFrame which is the GUI class
    {
        public Frame69() {
            setTitle("69 is best"); //this is title
            setSize(690,420);
            setLocation(100,100);
            Panel69 panel = new Panel69();
            Container cp = getContentPane(); //containers can do a lot in JFrame
            cp.add(panel);

        }
        class Panel69 extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponents(g);
            g.drawString("Hi", 75 ,100);
        }
    }
    }
}