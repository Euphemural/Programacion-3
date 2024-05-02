package mvc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class AuthControler {
	
	private JFrame frame;
	private AuthView view;
	
	public AuthControler()
	{	
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 456, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 1));
		
		view = new AuthView();
	}
	
	public void Login() 
	{
		frame.add(view.Login());
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

}
