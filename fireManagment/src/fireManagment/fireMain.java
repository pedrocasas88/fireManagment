package fireManagment;

import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fireMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		JButton button = new JButton("Towns above 50,000");
		button.setBounds(10, 10, 200, 30);
		
		JButton button1 = new JButton("Towns above 100,000");
		button1.setBounds(10, 50, 200, 30);
		
		JButton button2 = new JButton("Fire Name");
		button2.setBounds(10, 90, 200, 30);
		
		JButton button3 = new JButton("Resources avaliavle");
		button3.setBounds(10, 130, 200, 30);
		
		JButton button4 = new JButton("Fire size");
		button4.setBounds(10, 170, 200, 30);
		
		JButton button5 = new JButton("Percent Contained");
		button5.setBounds(10, 210, 200, 30);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
	
		panel.add(button1);
		panel.add(button2);
		panel.add(button);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button5);
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 700;
		final int FRAME_HEIGHT = 600;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Fire managment System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.add(panel);
	
			
	}

}
