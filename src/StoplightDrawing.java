import javax.swing.*;
import java.awt.*;

public class StoplightDrawing extends JComponent {



    Color go = Color.gray;
    Color slow = Color.gray;
    Color stop = Color.yellow;
    Color sky = new Color(94, 133, 232);
    Color bkground = new Color(106, 232, 102);
    Color sunny = new Color(182, 64, 233);

    String activeLight = "red";
    String earth = "gray";

    public void paintComponent(Graphics g) {



        g.setColor(Color.BLUE);
        g.fillRect(0,0 , 1000,1000);

        g.setColor(Color.black);
        g.drawRect(0, 0 ,1000,1000);

        g.setColor(stop);
        g.fillOval(300,30,100,100);

        g.setColor(slow);
        g.fillOval(600,300,100,100);

        g.setColor(go);
        g.fillOval(50,170,100,100);

        // add another line
//        g.setColor(sky);
//        g.fillRect(0,600,800,100);

        g.setColor(bkground);
        g.fillRect(0,680,800,700);

//        g.setColor(sunny);
//        g.fillOval(100,170,50,50);
    }


    public void changeColor(){

        go = Color.blue;
        slow = Color.blue;
        stop = Color.blue;

        if(activeLight.equals("red")){
            activeLight = "green";
            go = Color.gray;
        } else if(activeLight.equals("green")){
            activeLight = "yellow";
            slow = Color.orange;
        } else{
            activeLight = "red";
            stop = Color.yellow;
        }

        repaint();
    }

}
