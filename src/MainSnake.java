import java.awt.Color;

import javax.swing.JFrame;

public class MainSnake {

	public static void main(String []args) {
		
		JFrame frame = new JFrame();
		SnakePlay gameplay = new SnakePlay();
		
		frame.setBounds(10,10,905,700);
		frame.setBackground(Color.red);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gameplay);
		
		
		
	}

	
	
}
