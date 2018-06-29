package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class POPQUIZ implements ActionListener{
	int c = 0;
	POPQUIZ(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);	
		
		panel.add(button);
		
		panel.add(button2);
		frame.pack();
		button.addActionListener(this);
		button2.addActionListener(this);
	}
public static void main(String[] args) {
	POPQUIZ a = new POPQUIZ();


}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if(e.getSource()==button) {
		c+=1;
	}
	if(e.getSource()==button2) {
		JOptionPane.showMessageDialog(null, c);
	}
}
JButton button = new JButton("increase");
JButton button2 = new JButton("show");
}
