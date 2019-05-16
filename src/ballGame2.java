import javax.swing.*;
import java.awt.*;


public class ballGame2 extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");


    double x = 100;
    double y = 100;
    boolean right = true;
    double degree = 3.14/3;
    boolean down = true;

    public void paint(Graphics g){ System.out.println("hua le");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
            if (down && right) {
            x = x + 10 * Math.cos(degree);
            y = y + 10 * Math.sin(degree);
            }
        //moving up
        if (right && !down) {
            x = x + 10*Math.cos(degree);
            y = y - 10*Math.sin(degree);
//sd
        }

        if (!right && down){
            x = x - 10*Math.cos(degree);
            y = y + 10*Math.sin(degree);
        }

        if (!right && !down){
            x = x - 10*Math.cos(degree);
            y = y - 10*Math.sin(degree);
        }
        if (y < 40)
            down = true;

        if (y > 500 - 40 - 30)
            down = false;

        if (x < 40)
            right = true;
        if (x > 856 - 30 - 40)
            right  = false;

    }

    void launchFrame() {
        setSize(856, 500);
        setLocation(400, 400);
        setVisible(true);

        while (true){
            repaint();
            try{
                Thread.sleep(40);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String args[]) {
        System.out.println("dierge");
        ballGame2 game = new ballGame2();
        game.launchFrame();
    }
}


