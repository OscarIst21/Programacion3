import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
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
		
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(460, 0);
		registro.setBackground(new Color(238, 255, 116));
		registro.setLayout(null);
		
		JLabel registroT=new JLabel("Registro", 0);
		registroT.setFont(new Font("Impact",Font.BOLD,26));
		registroT.setSize(460, 40);
		registroT.setForeground(Color.white);
		registroT.setLocation(0, 20);
		registroT.setOpaque(true);
		registroT.setBackground(Color.BLACK);
		registro.add(registroT);
		
		JLabel usuarioR=new JLabel("Nombre de Usuario",0);
		usuarioR.setFont(new Font("Arial",Font.BOLD,16));
		usuarioR.setBackground(new Color(227, 74, 26));
		usuarioR.setSize(200,30);
		usuarioR.setLocation(130,150);
		usuarioR.setOpaque(true);
		registro.add(usuarioR);
		
		JTextField nombreUsuarioR=new JTextField();
		nombreUsuarioR.setBounds(130, 180, 200, 30);
		nombreUsuarioR.setHorizontalAlignment(0);
		registro.add(nombreUsuarioR);
		
		JLabel bio=new JLabel("Bio",0);
		bio.setFont(new Font("Arial",Font.BOLD,16));
		bio.setBackground(new Color(227, 74, 26));
		bio.setSize(200,30);
		bio.setLocation(130,210);
		bio.setOpaque(true);
		registro.add(bio);
		
		JTextArea bioUser=new JTextArea();
		bioUser.setBounds(130, 240, 200, 80);
		registro.add(bioUser);
		
		JLabel preferencias=new JLabel("Preferencias",0);
		preferencias.setFont(new Font("Arial",Font.BOLD,16));
		preferencias.setBackground(new Color(227, 74, 26));
		preferencias.setSize(200,30);
		preferencias.setLocation(130,320);
		preferencias.setOpaque(true);
		registro.add(preferencias);
		
		JCheckBox item_box=new JCheckBox("Dulces");
		item_box.setBounds(130, 350, 70, 30);
		item_box.setFont(new Font("Sitka", Font.BOLD,12));
		item_box.setOpaque(false);
		registro.add(item_box);
		
		JCheckBox item_box1=new JCheckBox("Salado");
		item_box1.setBounds(190, 350, 70, 30);
		item_box1.setFont(new Font("Sitka", Font.BOLD,12));
		item_box1.setOpaque(false);
		registro.add(item_box1);
		
		JCheckBox item_box2=new JCheckBox("Saludable");
		item_box2.setBounds(250, 350, 90, 30);
		item_box2.setFont(new Font("Sitka", Font.BOLD,12));
		item_box2.setOpaque(false);
		registro.add(item_box2);
		
		JLabel terminos=new JLabel("Terminos y condiciones",0);
		terminos.setFont(new Font("Arial",Font.BOLD,14));
		terminos.setBackground(new Color(227, 74, 26));
		terminos.setSize(200,30);
		terminos.setLocation(130,380);
		terminos.setOpaque(true);
		registro.add(terminos);
		
		JRadioButton aceptTerminos=new JRadioButton("Aceptar");
		aceptTerminos.setBounds(130,410,80, 30);
		aceptTerminos.setFont(new Font("Arial",Font.BOLD,14));
		aceptTerminos.setOpaque(false);
		registro.add(aceptTerminos);
		
		JRadioButton noAceptTerminos=new JRadioButton("No acepto");
		noAceptTerminos.setBounds(230,410,110, 30);
		noAceptTerminos.setFont(new Font("Arial",Font.BOLD,14));
		noAceptTerminos.setOpaque(false);
		registro.add(noAceptTerminos);
		
		ButtonGroup terms=new ButtonGroup();
		terms.add(aceptTerminos);
		terms.add(noAceptTerminos);
		
		String colonia[]={"Centro","Pedregal", "Camino Real","Tabachines"};
		JComboBox locacion=new JComboBox(colonia);
		
		locacion.setBounds(130, 440, 200, 40);
		locacion.setFont(new Font("Arial",Font.BOLD,14));
		locacion.setOpaque(false);
		registro.add(locacion);
		
		this.add(registro);
		

		this.login();
		
	}
	public void login()
	{
		JPanel login= new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		JLabel loginTitulo=new JLabel("Acceder", 0);
		loginTitulo.setFont(new Font("Impact",Font.BOLD,26));
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
	}

}
