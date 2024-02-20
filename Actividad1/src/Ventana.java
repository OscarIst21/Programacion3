import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	//Define los valores base de mi ventana.
	public Ventana() {
		this.setTitle("no");
		this.setVisible(true);
		this.setSize(920, 560);
		this.setLocation(120, 120);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(600,600));
		this.setLayout(null);
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		JPanel login= new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		JLabel loginTitulo=new JLabel("Acceder", 0);
		loginTitulo.setFont(new Font("Arial",Font.BOLD,20));
		loginTitulo.setSize(300, 80);
		loginTitulo.setLocation(100, 20);
		loginTitulo.setOpaque(true);
		loginTitulo.setBackground(Color.cyan);
		login.add(loginTitulo);
		
		
		JLabel usuario=new JLabel("Nombre de Usuario",0);
		usuario.setFont(new Font("Arial",Font.BOLD,16));
		usuario.setSize(150,120);
		usuario.setLocation(10,120);
		login.add(usuario);
		
		//JTextField nombreUsuario=new JTextField();
		//nombreUsuario.setBounds(10, 150, 200, 40);
		//login.add(nombreUsuario);
		
		this.add(login);
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(460, 0);
		registro.setBackground(Color.red);
		this.add(registro);
		
		
	}
	

}
