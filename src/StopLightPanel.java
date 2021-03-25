import javafx.scene.effect.Light;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopLightPanel extends JPanel {


    StoplightDrawing light = new StoplightDrawing();

    public StopLightPanel(){
        JButton changeButton = new JButton("Sun and sky Button");
        changeButton.setBounds(0,100,100,50);
        light.setPreferredSize(new Dimension(800,800));


        buttonListener l = new buttonListener();
        changeButton.addActionListener(l);

        add(light);
        add(changeButton);
    }

    
    class buttonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            light.changeColor();

        }
    }
}
