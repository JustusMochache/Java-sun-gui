import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {

    public static void main (String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new StopLightPanel();

        frame.add(panel);
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
