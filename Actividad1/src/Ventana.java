import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana extends JFrame{
	//Define los valores base de mi ventana.
	public Ventana() {
		this.setTitle("no");
		this.setSize(920, 560);
		this.setLocation(120, 120);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(600,600));
		this.setLayout(null);
		this.iniciarComponentes();
		this.setVisible(true);
	}
	
	public void iniciarComponentes() {
		JPanel login= new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		JLabel loginTitulo=new JLabel("Acceder", 0);
		loginTitulo.setFont(new Font("Arial",Font.BOLD,26));
		loginTitulo.setSize(460, 40);
		loginTitulo.setLocation(0, 20);
		loginTitulo.setOpaque(true);
		loginTitulo.setBackground(Color.cyan);
		login.add(loginTitulo);
		
		
		JLabel usuario=new JLabel("Nombre de Usuario",0);
		usuario.setFont(new Font("Arial",Font.BOLD,16));
		usuario.setSize(150,120);
		usuario.setLocation(130,100);
		usuario.setOpaque(false);
		login.add(usuario);
		
		JTextField nombreUsuario=new JTextField();
		nombreUsuario.setBounds(130, 180, 200, 30);
		login.add(nombreUsuario);
		
		JLabel contraseña=new JLabel("Contraseña",0);
		contraseña.setFont(new Font("Arial",Font.BOLD,16));
		contraseña.setSize(120,120);
		contraseña.setLocation(115,200);
		contraseña.setOpaque(false);
		login.add(contraseña);
		
		JPasswordField contraUsuario=new JPasswordField();
		contraUsuario.setBounds(130, 280, 200, 30);
		login.add(contraUsuario);
		
		JCheckBox recordarme=new JCheckBox("Recordarme");
		recordarme.setFont(new Font("Arial",Font.BOLD,10));
		recordarme.setBounds(126, 300, 100, 50);
		recordarme.setOpaque(false);
		login.add(recordarme);
		
		JLabel olvidoContraseña=new JLabel("¿Olvido su contraseña?");
		olvidoContraseña.setBounds(226, 310, 140, 30);
		olvidoContraseña.setFont(new Font("Arial",Font.BOLD,10));
		olvidoContraseña.setOpaque(false);
		login.add(olvidoContraseña);
		
		JButton iniciar=new JButton("Iniciar Sesion");
		iniciar.setBounds(160, 410, 140, 30);
		login.add(iniciar);
		
		this.add(login);
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(460, 0);
		registro.setBackground(Color.red);
		this.add(registro);
		
		
	}
	

}
