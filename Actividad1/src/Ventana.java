import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
		//this.login();
		//this.registro();
		//this.admin();
		this.calculadora();
	}
	public void calculadora()
	{
		this.setTitle("Calculadora");
		this.setSize(455,670);
		JPanel calculadoraF= new JPanel();
		calculadoraF.setSize(460,670);
		calculadoraF.setLocation(0, 0);
		calculadoraF.setBackground(Color.BLACK);
		calculadoraF.setLayout(null);
		this.add(calculadoraF);
		
		JLabel panelOP=new JLabel("0", 0);
		panelOP.setFont(new Font("Impact",Font.BOLD,28));
		panelOP.setSize(427, 120);
		panelOP.setForeground(Color.white);
		panelOP.setLocation(5, 5);
		panelOP.setOpaque(true);
		panelOP.setBackground(new Color(49, 49, 49));
		calculadoraF.add(panelOP);
		
		JButton c=new JButton("C");
		c.setBounds(5, 130, 103, 95);
		c.setFont(new Font("Impact",Font.BOLD,22));
		c.setBackground(new Color(136, 136, 136));
		c.setForeground(Color.WHITE);
		calculadoraF.add(c);
		
		JButton signo=new JButton("+/-");
		signo.setBounds(113, 130, 103, 95);
		signo.setFont(new Font("Impact",Font.BOLD,18));
		signo.setBackground(new Color(136, 136, 136));
		signo.setForeground(Color.WHITE);
		calculadoraF.add(signo);
		
		JButton porcentaje=new JButton("%");
		porcentaje.setBounds(221, 130, 103, 95);
		porcentaje.setFont(new Font("Impact",Font.BOLD,24));
		porcentaje.setBackground(new Color(136, 136, 136));
		porcentaje.setForeground(Color.WHITE);
		calculadoraF.add(porcentaje);
		
		JButton division=new JButton("/");
		division.setBounds(329, 130, 103, 95);
		division.setFont(new Font("Impact",Font.BOLD,28));
		division.setBackground(new Color(207, 122, 0));
		division.setForeground(Color.WHITE);
		calculadoraF.add(division);
		
		JButton siete=new JButton("7");
		siete.setBounds(5, 230, 103, 95);
		siete.setFont(new Font("Impact",Font.BOLD,28));
		siete.setBackground(new Color(41, 41, 41));
		siete.setForeground(Color.WHITE);
		calculadoraF.add(siete);
		
		JButton ocho=new JButton("8");
		ocho.setBounds(113, 230, 103, 95);
		ocho.setFont(new Font("Impact",Font.BOLD,28));
		ocho.setBackground(new Color(41, 41, 41));
		ocho.setForeground(Color.WHITE);
		calculadoraF.add(ocho);
		
		JButton nueve=new JButton("9");
		nueve.setBounds(221, 230, 103, 95);
		nueve.setFont(new Font("Impact",Font.BOLD,28));
		nueve.setBackground(new Color(41, 41, 41));
		nueve.setForeground(Color.WHITE);
		calculadoraF.add(nueve);
		
		JButton multiplicacion=new JButton("X");
		multiplicacion.setBounds(329, 230, 103, 95);
		multiplicacion.setFont(new Font("Impact",Font.BOLD,28));
		multiplicacion.setBackground(new Color(207, 122, 0));
		multiplicacion.setForeground(Color.WHITE);
		calculadoraF.add(multiplicacion);
		
		JButton cuatro=new JButton("4");
		cuatro.setBounds(5, 330, 103, 95);
		cuatro.setFont(new Font("Impact",Font.BOLD,28));
		cuatro.setBackground(new Color(41, 41, 41));
		cuatro.setForeground(Color.WHITE);
		calculadoraF.add(cuatro);
		
		JButton cinco=new JButton("5");
		cinco.setBounds(113, 330, 103, 95);
		cinco.setFont(new Font("Impact",Font.BOLD,28));
		cinco.setBackground(new Color(41, 41, 41));
		cinco.setForeground(Color.WHITE);
		calculadoraF.add(cinco);
		
		JButton seis=new JButton("6");
		seis.setBounds(221, 330, 103, 95);
		seis.setFont(new Font("Impact",Font.BOLD,28));
		seis.setBackground(new Color(41, 41, 41));
		seis.setForeground(Color.WHITE);
		calculadoraF.add(seis);
		
		JButton resta=new JButton("-");
		resta.setBounds(329, 330, 103, 95);
		resta.setFont(new Font("Impact",Font.BOLD,28));
		resta.setBackground(new Color(207, 122, 0));
		resta.setForeground(Color.WHITE);
		calculadoraF.add(resta);
		
		JButton uno=new JButton("1");
		uno.setBounds(5, 430, 103, 95);
		uno.setFont(new Font("Impact",Font.BOLD,28));
		uno.setBackground(new Color(41, 41, 41));
		uno.setForeground(Color.WHITE);
		calculadoraF.add(uno);
		
		JButton dos=new JButton("2");
		dos.setBounds(113, 430, 103, 95);
		dos.setFont(new Font("Impact",Font.BOLD,28));
		dos.setBackground(new Color(41, 41, 41));
		dos.setForeground(Color.WHITE);
		calculadoraF.add(dos);
		
		JButton tres=new JButton("3");
		tres.setBounds(221, 430, 103, 95);
		tres.setFont(new Font("Impact",Font.BOLD,28));
		tres.setBackground(new Color(41, 41, 41));
		tres.setForeground(Color.WHITE);
		calculadoraF.add(tres);
		
		JButton suma=new JButton("+");
		suma.setBounds(329, 430, 103, 95);
		suma.setFont(new Font("Impact",Font.BOLD,28));
		suma.setBackground(new Color(207, 122, 0));
		suma.setForeground(Color.WHITE);
		calculadoraF.add(suma);
		
		JButton cero=new JButton("0");
		cero.setBounds(5, 530, 210, 95);
		cero.setFont(new Font("Impact",Font.BOLD,28));
		cero.setBackground(new Color(41, 41, 41));
		cero.setForeground(Color.WHITE);
		calculadoraF.add(cero);
		
		JButton punto=new JButton(".");
		punto.setBounds(221, 530, 103, 95);
		punto.setFont(new Font("Impact",Font.BOLD,28));
		punto.setBackground(new Color(41, 41, 41));
		punto.setForeground(Color.WHITE);
		calculadoraF.add(punto);
		
		JButton igual=new JButton("=");
		igual.setBounds(329, 530, 103, 95);
		igual.setFont(new Font("Impact",Font.BOLD,28));
		igual.setBackground(new Color(207, 122, 0));
		igual.setForeground(Color.WHITE);
		calculadoraF.add(igual);
	}
	public void admin() {
		//añadir panel
		JPanel adminPanel= new JPanel();
		adminPanel.setSize(this.getWidth(),this.getHeight());
		adminPanel.setLocation(0, 0);
		adminPanel.setBackground(new Color(255, 171, 106));
		adminPanel.setLayout(null);
		//añadir menu
		JMenuBar barra=new JMenuBar();
		JMenu menuFile=new JMenu("Archivo");
		JMenuItem openItem=new JMenuItem("Abrir archivo");
		JMenuItem crearItem=new JMenuItem("Crear archivo");
		//Contenido Panel
		JLabel usuarios=new JLabel("Usuarios", 0);
		usuarios.setFont(new Font("Impact",Font.BOLD,26));
		usuarios.setSize(920, 40);
		usuarios.setForeground(Color.white);
		usuarios.setLocation(0, 20);
		usuarios.setOpaque(true);
		usuarios.setBackground(new Color(255, 40, 40));
		adminPanel.add(usuarios);

		JLabel Titulowidget=new JLabel("Total de usuarios:");
		Titulowidget.setBounds(65, 80, 160, 80);
		Titulowidget.setOpaque(false); 
		Titulowidget.setBackground(new Color(255,255,255));
		adminPanel.add(Titulowidget);
		
		JLabel Usuarioswidget=new JLabel("100");
		Usuarioswidget.setBounds(105, 115, 160, 80);
		Usuarioswidget.setOpaque(false); 
		Usuarioswidget.setBackground(new Color(255,255,255));
		adminPanel.add(Usuarioswidget);
		
		JLabel widget=new JLabel("");
		widget.setBounds(40, 100, 160, 80);
		widget.setOpaque(true); 
		widget.setBackground(new Color(255, 243, 124));
		adminPanel.add(widget);
		
		
		
		JButton download=new JButton("Exportar");
		download.setBounds(730, 180, 140, 30);
		download.setBackground(new Color(231, 0, 0));
		download.setForeground(Color.WHITE);
		adminPanel.add(download);
		
		JButton añadir=new JButton("Añadir");
		añadir.setBounds(585, 180, 140, 30);
		añadir.setBackground(new Color(231, 0, 0));
		añadir.setForeground(Color.WHITE);
		adminPanel.add(añadir);
		
		String[] title= {"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"};
		String[][] datos= {
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"},
				{"No. Control","Nombre","Apellido", "Semestre", "Promedio", "Acciones"}
		};
		
		JTable tablaDatos=new JTable(datos,title);
		tablaDatos.setBounds(40, 210, 830, 200);
		JScrollPane table_scroll = new JScrollPane(tablaDatos);
		table_scroll.setBounds(40, 210, 830, 200);
		adminPanel.add(table_scroll);
		
		JLabel Tablawidget=new JLabel("");
		Tablawidget.setBounds(40, 210, 830, 200);
		Tablawidget.setOpaque(true); 
		Tablawidget.setBackground(new Color(255,255,255));
		adminPanel.add(Tablawidget);
		//añadir tabla
		barra.add(menuFile);
		menuFile.add(openItem);
		menuFile.add(crearItem);
		this.setJMenuBar(barra);
		this.add(adminPanel);
	}
	public void registro() {
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(460, 0);
		registro.setBackground(new Color(217, 181, 255));
		registro.setLayout(null);
		
		JLabel registroT=new JLabel("Registro", 0);
		registroT.setFont(new Font("Impact",Font.BOLD,26));
		registroT.setSize(460, 40);
		registroT.setForeground(Color.white);
		registroT.setLocation(0, 20);
		registroT.setOpaque(true);
		registroT.setBackground(new Color(172, 38, 222));
		registro.add(registroT);
		
		JLabel usuarioR=new JLabel("Nombre de Usuario",0);
		usuarioR.setFont(new Font("Arial",Font.BOLD,16));
		usuarioR.setBackground(new Color(90, 101, 241));
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
		bio.setBackground(new Color(90, 101, 241));
		bio.setSize(200,30);
		bio.setLocation(130,210);
		bio.setOpaque(true);
		registro.add(bio);
		
		JTextArea bioUser=new JTextArea();
		bioUser.setBounds(130, 240, 200, 80);
		registro.add(bioUser);
		
		JLabel preferencias=new JLabel("Preferencias",0);
		preferencias.setFont(new Font("Arial",Font.BOLD,16));
		preferencias.setBackground(new Color(90, 101, 241));
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
		terminos.setBackground(new Color(90, 101, 241));
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
		
		locacion.setBounds(130, 440, 200, 30);
		locacion.setFont(new Font("Arial",Font.BOLD,14));
		locacion.setOpaque(false);
		registro.add(locacion);
		
		this.add(registro);
	}
	public void login()
	{
		JPanel login= new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(new Color(134, 216, 201));
		login.setLayout(null);
		
		JLabel loginTitulo=new JLabel("Acceder", 0);
		loginTitulo.setFont(new Font("Impact",Font.BOLD,26));
		loginTitulo.setSize(460, 40);
		loginTitulo.setLocation(0, 20);
		loginTitulo.setOpaque(true);
		loginTitulo.setBackground(new Color(4, 0, 142));
		loginTitulo.setForeground(new Color(255,255,255));
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
		iniciar.setBackground(new Color(149, 105, 197));
		iniciar.setForeground(Color.WHITE);
		login.add(iniciar);
		
		this.add(login);
	}

}
