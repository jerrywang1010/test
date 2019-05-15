import javax.swing.*;
import java.awt.*;


public class ballGame2 extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");


    double x = 100;
    double y = 100;
    boolean right = true;
    double degree = 3.14/3;

    public void paint(Graphics g){
        System.out.println("hua le");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);


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


