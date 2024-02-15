import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	//Define los valores base de mi ventana.
	public Ventana() {
		this.setTitle("no");
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocation(120, 120);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(600,600));
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		JPanel login= new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.blue);
		this.add(login);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
