/*import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class ColorBall implements ActionListener {

	JFrame frame;
	
	public static void main(String[] args) {
		
		ColorBall ball = new ColorBall();
		ball.launch();
		
	}
	
	public void launch() {
		
		frame = new JFrame();
		ColorChange changeObject = new ColorChange();
		JButton button = new JButton("NEW COLOR!");
		JButton exit = new JButton("EXIT");
		JFrame window = new JFrame("Let's change colors!!");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(this);		

		
		frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, changeObject);
		frame.setSize(1000,1000);
		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent event) {
			
		frame.repaint();
	}
	
}
*/