package mvc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class AuthController {
	private JFrame frame;
	private AuthView view;
	public AuthController() {
		frame=new JFrame();
		frame.setVisible(false);
		frame.setBounds(100,100,520,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		frame.setLocationRelativeTo(null);
		view=new AuthView();
	}
	public void login() {
		frame.add(view.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
	}
	public void registro() {
		frame.add(view.registro());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
	}
}

