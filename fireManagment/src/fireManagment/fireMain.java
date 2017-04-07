package fireManagment;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fireMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		JButton button = new JButton("im a button");
		JButton button1 = new JButton("button 2");
		JButton button2 = new JButton("button 3");
		JButton button3 = new JButton("button 4");
		JButton button4 = new JButton("Button 5");
		JButton button5 = new JButton("Button 6");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,3, 400, 10));
		
		
	
		panel.add(button1, BorderLayout.WEST);
		panel.add(button2, BorderLayout.WEST);
		panel.add(button, BorderLayout.WEST);
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
