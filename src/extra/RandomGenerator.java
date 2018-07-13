package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class RandomGenerator implements ActionListener{
	JLabel label = new JLabel();	
	JFrame frame = new JFrame();
	
	
public static void main(String[] args) {
	RandomGenerator a = new RandomGenerator();
}
RandomGenerator(){
	
	frame.setVisible(true);
	JPanel panel = new JPanel();
	JButton button = new JButton();
	panel.add(button);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	button.addActionListener(this);
	frame.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

int r = 0;
Random gen = new Random();
r = gen.nextInt(100);
label.setText(""+ r);
frame.pack();
}


}
