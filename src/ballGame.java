import javax.swing.*;
import java.awt.*;


    public class ballGame extends JFrame {
        Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
        Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");


        double x = 100;
        double y = 100;
        boolean right = true;

        public void paint(Graphics g){
            System.out.println("hua le");
            g.drawImage(desk, 0, 0, null);
            g.drawImage(ball, (int)x, (int)y, null);

            if (right)
                x = x + 10;
            else
                x = x - 10;

            if (x > 856-40-30)
                right = false;

            if (x < 40)
                right = true;
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
            System.out.println("wo shi ni yeye");
            ballGame game = new ballGame();
            game.launchFrame();
        }
    }


