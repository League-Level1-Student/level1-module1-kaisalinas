package extra;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MathButtons {

MathButtons(){
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField textfield = new JTextField();
frame.setVisible(true);
panel.add(textfield);
frame.add(panel);
}

public static void main(String[] args) {
	
}

}