package ISL;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	static JButton button;
	static JLabel label;
	static JFrame frame = new JFrame("FootBall");
	static JPanel panel;
	
	public static void main (String[]args) {
		GUI gui = new GUI();
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		label = new JLabel("ForEach Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("FootBall1");
		panel.add(button);
		button.addActionListener((ActionListener)gui); 
		panel.add(Box.createVerticalStrut(10));
		
		label = new JLabel("Parallel Streaming Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("FootBall2");
		panel.add(button);
		button.addActionListener((ActionListener) gui); 
		panel.add(Box.createVerticalStrut(10));

		label = new JLabel("Min, Map, Reduce, Collect Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("FootBall3");
		panel.add(button);
		button.addActionListener((ActionListener) gui); 
		panel.add(Box.createVerticalStrut(10));

		label = new JLabel("Filter & ForEach Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("FootBall4");
		panel.add(button);
		button.addActionListener((ActionListener) gui); 
		panel.add(Box.createVerticalStrut(10));

		label = new JLabel("Sorted Function");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("FootBall5");
		panel.add(button);
		button.addActionListener((ActionListener) gui); 
		panel.add(Box.createVerticalStrut(10));
		
		frame.setSize(450, 450);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand(); 
		if (s.equals("FootBall1")) { 
			FootBall1.readAndWrite();
		} else if (s.equals("FootBall2")) { 
			FootBall2.readAndWrite();
		} else if (s.equals("FootBall3")) { 
			FootBall3.readAndWrite();
		} else if (s.equals("FootBall4")) {
			FootBall4.readAndWrite();
		} else if (s.equals("FootBall5")) { 
			FootBall5.readAndWrite();
		} 
	}
}
