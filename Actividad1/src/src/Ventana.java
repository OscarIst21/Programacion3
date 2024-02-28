import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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
import javax.swing.ImageIcon;
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
		this.setSize(465,670);
		JPanel panel= new JPanel();
		panel.setSize(460,670);
		panel.setLocation(0, 0);
		panel.setBackground(new Color(192, 255, 248));
		panel.setLayout(new BorderLayout());
		
		JLabel text=new JLabel("999.00   ",4);
		text.setBackground(new Color(255,255,255));
		text.setOpaque(true);
		text.setFont(new Font("Impact",Font.BOLD,26));
		panel.add(text,BorderLayout.NORTH);
		
		JLabel centro=new JLabel("");
		centro.setBackground(Color.darkGray);
		centro.setLayout(new GridLayout(4,3));
		panel.add(centro,BorderLayout.CENTER);
		
		String botones[]= {"7","8","9","4","5","6","1","2","3","0","."};
		for(int i=0;i<=10;i++)
		{
			JButton boton=new JButton(botones[i]);
			boton.setFont(new Font("Impact",Font.BOLD,26));
			boton.setFocusable(false);
			boton.setBackground(new Color(182, 182, 182));
			centro.add(boton);
		}
		JPanel east=new JPanel();
		east.setBackground(Color.darkGray);
		east.setLayout(new GridLayout(3,1));
		panel.add(east,BorderLayout.EAST);
		this.add(panel);
		String operadores[]= {"  +  ","  -  ","  =  "};
		
		for(int i=0;i<3;i++)
		{
			JButton boton=new JButton(operadores[i]);
			boton.setFont(new Font("Impact",Font.BOLD,26));
			boton.setFocusable(false);
			boton.setBackground(new Color(92, 92, 92));
			east.add(boton);
		}
		JPanel west=new JPanel();
		west.setBackground(Color.darkGray);
		west.setLayout(new GridLayout(4,1));
		panel.add(west,BorderLayout.WEST);
		this.add(panel);
		String op[]= {"AC","DEL","MC","M+"};
		
		for(int i=0;i<4;i++)
		{
			JButton boton=new JButton(op[i]);
			boton.setFont(new Font("Impact",Font.BOLD,26));
			boton.setFocusable(false);
			boton.setBackground(new Color(231, 124, 31));
			west.add(boton);
		}
		
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
		this.setSize(460, 560);
		JPanel login= new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(new Color(109, 115, 243));
		login.setLayout(null);
		
		JLabel loginTitulo=new JLabel("Acceder", 0);
		loginTitulo.setFont(new Font("Impact",Font.BOLD,26));
		loginTitulo.setSize(460, 40);
		loginTitulo.setLocation(0, 20);
		loginTitulo.setOpaque(false);
		loginTitulo.setForeground(new Color(255,255,255));
		login.add(loginTitulo);
		
		JLabel inicioSesion=new JLabel("Iniciar Sesión", 0);
		inicioSesion.setFont(new Font("Impact",Font.BOLD,26));
		inicioSesion.setSize(460, 40);
		inicioSesion.setLocation(0, 100);
		inicioSesion.setOpaque(false);
		inicioSesion.setBackground(new Color(33, 98, 236));
		inicioSesion.setForeground(new Color(227, 243, 74));
		login.add(inicioSesion);
		
		JLabel usuario=new JLabel("Nombre de Usuario",0);
		usuario.setFont(new Font("Arial",Font.BOLD,16));
		usuario.setSize(150,120);
		usuario.setForeground(Color.white);
		usuario.setLocation(160,100);
		usuario.setOpaque(false);
		login.add(usuario);
		
		JTextField nombreUsuario=new JTextField();
		nombreUsuario.setBounds(160, 180, 200, 30);
		login.add(nombreUsuario);
		
		JLabel logo=new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("iconoUser.png")));
		logo.setBounds(128, 180, 30, 30);
		login.add(logo);
		
		JLabel contraseña=new JLabel("Contraseña",0);
		contraseña.setFont(new Font("Arial",Font.BOLD,16));
		contraseña.setForeground(Color.white);
		contraseña.setSize(120,120);
		contraseña.setLocation(148,200);
		contraseña.setOpaque(false);
		login.add(contraseña);
		
		JPasswordField contraUsuario=new JPasswordField();
		contraUsuario.setBounds(160, 280, 200, 30);
		login.add(contraUsuario);
		
		JLabel candado=new JLabel();
		candado.setIcon(new ImageIcon(getClass().getResource("candado.png")));
		candado.setBounds(128, 280, 30, 30);
		login.add(candado);
		
		/*JCheckBox recordarme=new JCheckBox("Recordarme");
		recordarme.setFont(new Font("Arial",Font.BOLD,10));
		recordarme.setBounds(126, 300, 100, 50);
		recordarme.setOpaque(false);
		login.add(recordarme);
		
		JLabel olvidoContraseña=new JLabel("¿Olvido su contraseña?");
		olvidoContraseña.setBounds(226, 310, 140, 30);
		olvidoContraseña.setFont(new Font("Arial",Font.BOLD,10));
		olvidoContraseña.setOpaque(false);
		login.add(olvidoContraseña);*/
		
		JButton iniciar=new JButton("Iniciar Sesion");
		iniciar.setBounds(160, 350, 140, 30);
		iniciar.setBackground(new Color(249, 255, 123));
		iniciar.setForeground(Color.black);
		login.add(iniciar);
		
		JLabel notienesCuenta=new JLabel("¿No tienes cuenta?");
		notienesCuenta.setBounds(180, 400, 180, 30);
		notienesCuenta.setFont(new Font("Arial",Font.BOLD,10));
		notienesCuenta.setOpaque(false);
		login.add(notienesCuenta);
		
		JButton sinCuenta=new JButton("Registrarte");
		sinCuenta.setBounds(140, 420, 180, 30);
		sinCuenta.setBackground(new Color(249, 255, 123));
		sinCuenta.setForeground(Color.black);
		login.add(sinCuenta);
		
		JLabel fondoInicio=new JLabel("", 0);
		fondoInicio.setSize(360, 300);
		fondoInicio.setLocation(50, 100);
		fondoInicio.setOpaque(true);
		fondoInicio.setBackground(new Color(61, 64, 145));
		login.add(fondoInicio);
		
		this.add(login);
	}

}
