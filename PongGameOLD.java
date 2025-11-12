import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
class PongGame {

    public static void main(String[] args) {

        GameFrame frame = new GameFrame();

    }
}

/*********************************/

//USING ADVANCED GUI FOR TS. PLEASE NO DUMB MISTAKES SNTZ

// TRUST ME 9 BRO

class GameFrame extends JFrame{

@@ -19,7 +20,7 @@

    GameFrame(){

        panel = new GamePanel();

        this.add(panel);


        this.setTitle("Pong Game");


        this.setTitle("Pong Pinged Game");

        this.setResizable(false);

        this.setBackground(Color.black);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

@@ -28,7 +29,8 @@

        this.setLocationRelativeTo(null);

    }

}


//**********************************************************


//Bro black such an obscure color tho?


// Dont worry



class GamePanel extends JPanel implements Runnable{



@@ -68,7 +70,8 @@

        paddle1 = new Paddle(0,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,1);

        paddle2 = new Paddle(GAME_WIDTH-PADDLE_WIDTH,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,2);

    }





//Difficulties here crashing/4 times


    // Error count 12 = fixed (Did not specify newBall's return)

    public void paint(Graphics g) {

        image = createImage(getWidth(),getHeight());

        graphics = image.getGraphics();

@@ -116,6 +119,7 @@

            ball.xVelocity++; //optional for more difficulty

            if(ball.yVelocity>0)

                ball.yVelocity++; //optional for more difficulty


                // Lets not make it too difficult shall we?

            else

                ball.yVelocity--;

            ball.setXDirection(-ball.xVelocity);

@@ -308,4 +312,5 @@

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);

        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);

    }


}





}
