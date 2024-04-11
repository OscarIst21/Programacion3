import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
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
		//this.setLayout(null);
		this.iniciarComponentes();
		this.setVisible(true);
	}
	
	
	public void iniciarComponentes() {
		//this.login();
		//this.registro();
		//this.admin();
		//this.calculadora();
		//this.calculadoraInteres();
		this.repaint();
		this.revalidate();
	}
	
	public void paint(Graphics g)
	{
		this.setLocationRelativeTo(null);
	 	this.setTitle("Paint");
	    this.setSize(1300, 700);
	    JPanel panel= new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0, 0);
		panel.setLayout(null);
	    
		Color azulFondo=new Color(3, 90, 185);
		Color azulClaro=new Color(198,227,231);
		Color azulClaroSombra=new Color(149,193,199);
		Color azul=new Color(118,178,215);
		Color azulSombra=new Color(18,81,117);
		Color tubo=new Color(110,107,183);
		Color sombraNube=new Color(178,211,214);
		Color pasto=new Color(24,178,42);
		Color verdeArbol=new Color(6,251,9);
		Color pastoSombra=new Color(32, 124, 0);
		Color tierra=new Color(207,158,95);
		Color tierraMancha=new Color(235,189,98);
		Color gris=new Color(195,191,199);
		Color grisSombra=new Color(120,117,123);
		Color amarillo=new Color(249,220,54);
		Color amarilloSombra=new Color(208,163,74);
		
	    super.paint(g);
	    Graphics2D g2d=(Graphics2D) g;
	    g2d.setColor(azulFondo); 
	    g2d.fillRect(0,0,1300,700);
	    
	    g2d.setColor(azulClaroSombra);
	    g2d.fillRect(100, 250, 170, 400);
	    g2d.fillArc(100, 150, 170, 200,0,180);
	    g2d.setColor(azulClaro);
	    g2d.fillRect(100, 250, 150, 400);
	    g2d.fillArc(100, 150, 150, 200,0,180);

	    g2d.setColor(azulClaroSombra);
	    g2d.fillRect(500, 250, 170, 400);
	    g2d.fillArc(500, 150, 170, 200,0,180);
	    g2d.setColor(azulClaro);
	    g2d.fillRect(500, 250, 150, 400);
	    g2d.fillArc(500, 150, 150, 200,0,180);

	    g2d.setColor(azulClaroSombra);
	    g2d.fillRect(670, 200, 170, 400);
	    g2d.fillArc(670, 100, 170, 200,0,180);
	    g2d.setColor(azulClaro);
	    g2d.fillRect(670, 200, 150, 400);
	    g2d.fillArc(670, 100, 150, 200,0,180);
	    
	    g2d.setColor(azulClaroSombra);
	    g2d.fillRoundRect(0, 250, 200, 60, 70, 40);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(0, 250, 190, 50, 70, 40);

	    g2d.setColor(azulClaroSombra);
	    g2d.fillRoundRect(400, 300, 250, 60, 70, 40);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(400, 300, 240, 50, 70, 40);
	    
	    g2d.setColor(azulClaroSombra);
	    g2d.fillRoundRect(600, 370, 200, 60, 70, 40);
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(600, 370, 190, 50, 70, 40);

	    g2d.setColor(azulSombra);
	    g2d.fillRect(0, 550, 170, 400);
	    g2d.fillArc(0, 450, 170, 200,0,180);
	    g2d.setColor(azul);
	    g2d.fillRect(0, 550, 150, 400);
	    g2d.fillArc(0, 450, 150, 200,0,180);
	    
	    g2d.setColor(azulSombra);
	    g2d.fillRect(500, 550, 250, 400);
	    g2d.fillArc(500, 450, 250, 200,0,180);
	    g2d.setColor(azul);
	    g2d.fillRect(500, 550, 230, 400);
	    g2d.fillArc(500, 450, 230, 200,0,180);
	    
	    g2d.setColor(azulSombra);
	    g2d.fillRect(750, 300, 250, 400);
	    g2d.fillArc(750, 200, 250, 200,0,180);
	    g2d.setColor(azul);
	    g2d.fillRect(750, 300, 230, 400);
	    g2d.fillArc(750, 200, 230, 200,0,180);
	    
	    g2d.setColor(azulSombra);
	    g2d.fillRect(1050, 400, 250, 400);
	    g2d.fillArc(1050, 300, 250, 200,0,180);
	    g2d.setColor(azul);
	    g2d.fillRect(1050, 400, 230, 400);
	    g2d.fillArc(1050, 300, 230, 200,0,180);;
	    
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(950, 530, 60, 40, 5, 5);
	    g2d.setColor(grisSombra);
	    g2d.fillRoundRect(952, 532, 56, 36, 5, 5);
	    g2d.setColor(gris);
	    g2d.fillRoundRect(952, 532, 48, 28, 5, 5);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(950, 490, 60, 40, 5, 5);
	    g2d.setColor(grisSombra);
	    g2d.fillRoundRect(952, 492, 56, 36, 5, 5);
	    g2d.setColor(gris);
	    g2d.fillRoundRect(952, 492, 48, 28, 5, 5);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(950, 450, 60, 40, 5, 5);
	    g2d.setColor(grisSombra);
	    g2d.fillRoundRect(952, 452, 56, 36, 5, 5);
	    g2d.setColor(gris);
	    g2d.fillRoundRect(952, 452, 48, 28, 5, 5);

	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(950, 410, 60, 40, 5, 5);
	    g2d.setColor(grisSombra);
	    g2d.fillRoundRect(952, 412, 56, 36, 5, 5);
	    g2d.setColor(gris);
	    g2d.fillRoundRect(952, 412, 48, 28, 5, 5);

	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(1010, 410, 60, 40, 5, 5);
	    g2d.setColor(amarilloSombra);
	    g2d.fillRoundRect(1010, 412, 56, 36, 5, 5);
	    g2d.setColor(amarillo);
	    g2d.fillRoundRect(1010, 412, 48, 28, 5, 5);
	    g2d.setColor(Color.black);
	    g2d.fillOval(1025, 420, 7, 15);
	    g2d.fillOval(1045, 420, 7, 15);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(1070, 410, 60, 40, 5, 5);
	    g2d.setColor(amarilloSombra);
	    g2d.fillRoundRect(1070, 412, 56, 36, 5, 5);
	    g2d.setColor(amarillo);
	    g2d.fillRoundRect(1070, 412, 48, 28, 5, 5);
	    g2d.setColor(Color.black);
	    g2d.fillOval(1085, 420, 7, 15);
	    g2d.fillOval(1105, 420, 7, 15);

	    g2d.fillArc(230, 530, 50, 70, 0, 360);
	    g2d.fillArc(270, 510, 50, 70, 0, 360);
	    g2d.fillArc(300, 500, 100, 80, 0, 360);
	    g2d.fillArc(330, 530, 110, 80, 0, 360);
	    
	    g2d.setColor(verdeArbol);
	    g2d.fillArc(232, 533, 50, 70, 0, 360);
	    g2d.fillArc(272, 513, 50, 70, 0, 360);
	    g2d.fillArc(302, 503, 95, 80, 0, 360);
	    g2d.fillArc(332, 533, 106, 78, 0, 360);

	    g2d.setColor(pasto);
	    g2d.fillRect(0, 570, 1300, 30);
	    g2d.setColor(tierra);
	    g2d.fillRect(0, 600, 1300, 100);
	    for(int i=0;i<=1300; i+=36)
	    {
	    	g2d.setColor(Color.black);
		    g2d.fillArc(0+i, 580, 40, 30, 180, 180);
		    g2d.setColor(pastoSombra);
		    g2d.fillArc(0+i, 580, 37, 27, 180, 180);
		    g2d.setColor(pasto);
		    g2d.fillArc(0+i, 580, 34, 24, 180, 180);
		    g2d.setColor(tierraMancha);
		    g2d.fillArc(0+i, 610, 8, 8, 0, 360);
		    g2d.fillArc(-10+i, 620, 10, 10, 0, 360);
		    g2d.fillArc(10+i, 650, 5, 5, 0, 360);
		    g2d.fillArc(30+i, 660, 10, 10, 0, 360);
		    
	    }
	}
	public void calculadoraInteres() {
	    this.setTitle("Calculadora de Interes");
	    this.setSize(470, 420);
	    JPanel panel = new JPanel();
	    panel.setSize(460, 670);
	    panel.setLocation(0, 0);
	    panel.setBackground(new Color(192, 255, 248));
	    panel.setLayout(new BorderLayout());
	    
	    JLabel text = new JLabel("      Interes", 2);
	    text.setBackground(Color.white);
	    text.setOpaque(true);
	    text.setFont(new Font("Arial", Font.BOLD, 26));
	    text.setForeground(new Color(254, 123, 0));
	    panel.add(text, BorderLayout.NORTH);

	    JLabel west = new JLabel("             ");
	    west.setBackground(Color.white);
	    west.setVisible(true);
	    west.setOpaque(true);
	    west.setLayout(new BorderLayout());
	    panel.add(west, BorderLayout.WEST);
	    
	    JLabel east = new JLabel("             ");
	    east.setBackground(Color.white);
	    east.setVisible(true);
	    east.setOpaque(true);
	    east.setLayout(new BorderLayout());
	    panel.add(east, BorderLayout.EAST);
	    
	    
	    JLabel sur = new JLabel("             ");
	    sur.setBackground(Color.white);
	    sur.setVisible(true);
	    sur.setOpaque(true);
	    sur.setLayout(new BorderLayout());
	    panel.add(sur, BorderLayout.SOUTH);
	    
	    JPanel centroP=new JPanel();
	    centroP.setLayout(new GridLayout(2,1));
	    panel.add(centroP,BorderLayout.CENTER);
	    
	    JPanel centro=new JPanel();
	    centro.setBackground(new Color(157, 220, 149));
	    centro.setOpaque(true);
	    centro.setLayout(new BorderLayout());
	    centroP.add(centro);
	    
	    JLabel text2 = new JLabel(" Calcular interes", 2);
	    text2.setBackground(new Color(157, 220, 149));
	    text2.setOpaque(true);
	    text2.setFont(new Font("Arial", Font.BOLD, 16));
	    centro.add(text2,BorderLayout.NORTH);
	    
	    JPanel contenido6=new JPanel();
	    contenido6.setLayout(new GridLayout(7,2));
	    centro.add(contenido6);
	    
	    JLabel v=new JLabel("   ");
	    v.setBackground(new Color(157, 220, 149));
	    v.setOpaque(true);
	    contenido6.add(v);
	    JLabel vv=new JLabel("   ");
	    vv.setBackground(new Color(157, 220, 149));
	    vv.setOpaque(true);
	    contenido6.add(vv);
	    
		JLabel textC = new JLabel("    Capaciadad", 2);
	    textC.setBackground(new Color(157, 220, 149));
	    textC.setOpaque(true);
	    textC.setFont(new Font("Arial", Font.BOLD, 12));
	    contenido6.add(textC);

	    JTextField capacidad=new JTextField();
	    capacidad.setBounds(130, 180, 200, 30);
	    capacidad.setHorizontalAlignment(0);
	    contenido6.add(capacidad);
	    
	    JLabel v1=new JLabel("   ");
	    v1.setBackground(new Color(157, 220, 149));
	    v1.setOpaque(true);
	    contenido6.add(v1);
	    JLabel vv1=new JLabel("   ");
	    vv1.setBackground(new Color(157, 220, 149));
	    vv1.setOpaque(true);
	    contenido6.add(vv1);
		
	    JLabel textT = new JLabel("    Tiempo", 2);
	    textT.setBackground(new Color(157, 220, 149));
	    textT.setOpaque(true);
	    textT.setFont(new Font("Arial", Font.BOLD, 12));
	    contenido6.add(textT);

	    JTextField tiempo=new JTextField();
	    tiempo.setHorizontalAlignment(0);
	    contenido6.add(tiempo);
	    
	    JLabel v2=new JLabel("   ");
	    v2.setBackground(new Color(157, 220, 149));
	    v2.setOpaque(true);
	    contenido6.add(v2);
	    JLabel vv2=new JLabel("   ");
	    vv2.setBackground(new Color(157, 220, 149));
	    vv2.setOpaque(true);
	    contenido6.add(vv2);
		
		JLabel textTI = new JLabel("    Tasa de Interes", 2);
	    textTI.setBackground(new Color(157, 220, 149));
	    textTI.setOpaque(true);
	    textTI.setFont(new Font("Arial", Font.BOLD, 12));
	    contenido6.add(textTI);

	    JTextField tasaInteres=new JTextField();
	    tasaInteres.setHorizontalAlignment(0);
	    contenido6.add(tasaInteres);
	    
	    
	    
	    JButton calcular=new JButton("Calcular");
	    calcular.setBackground(Color.black);
	    calcular.setForeground(Color.WHITE);
	    calcular.setBorderPainted(true); //Agregar borde
		calcular.setBorder(BorderFactory.createLineBorder(new Color(157, 220, 149), 3));
	    contenido6.add(calcular);
	    
	    JButton cancelar=new JButton("Cancelar");
	    cancelar.setBackground(Color.black);
	    cancelar.setForeground(Color.WHITE);
	    cancelar.setBorderPainted(true); //Agregar borde
		cancelar.setBorder(BorderFactory.createLineBorder(new Color(157, 220, 149), 3));
	    contenido6.add(cancelar);
	    
	    JLabel west2 = new JLabel("                       ");
	    west2.setBackground(new Color(157, 220, 149));
	    west2.setVisible(true);
	    west2.setOpaque(true);
	    west2.setLayout(new BorderLayout());
	    centro.add(west2, BorderLayout.WEST);
	    
	    JLabel east2 = new JLabel("                       ");
	    east2.setBackground(new Color(157, 220, 149));
	    east2.setVisible(true);
	    east2.setOpaque(true);
	    east2.setLayout(new BorderLayout());
	    centro.add(east2, BorderLayout.EAST);
	    
	    JPanel panelRosa=new JPanel();
	    panelRosa.setLayout(new BorderLayout());
	    centroP.add(panelRosa,BorderLayout.SOUTH);
	    
	    JLabel cuadroBlanco=new JLabel(" ");
	    cuadroBlanco.setBackground(Color.WHITE);
	    cuadroBlanco.setOpaque(true);
	    panelRosa.add(cuadroBlanco,BorderLayout.NORTH);
	    
	    JLabel cuadroRosa=new JLabel("                       ");
	    cuadroRosa.setBackground(Color.PINK);
	    cuadroRosa.setOpaque(true);
	    panelRosa.add(cuadroRosa,BorderLayout.WEST);
	    
	    JLabel cuadroRosa2=new JLabel("                       ");
	    cuadroRosa2.setBackground(Color.PINK);
	    cuadroRosa2.setOpaque(true);
	    panelRosa.add(cuadroRosa2,BorderLayout.EAST);
	    
	    
	    JLabel cuadroRosa4=new JLabel("                       ");
	    cuadroRosa4.setBackground(Color.WHITE);
	    cuadroRosa4.setOpaque(true);
	    panelRosa.add(cuadroRosa4,BorderLayout.SOUTH);
	    
	    JPanel cuatroComponenentes=new JPanel();
	    cuatroComponenentes.setLayout(new GridLayout(5,2));
	    panelRosa.add(cuatroComponenentes,BorderLayout.CENTER);
	    
	    JLabel rosa=new JLabel("   ");
	    rosa.setBackground(Color.PINK);
	    rosa.setOpaque(true);
	    cuatroComponenentes.add(rosa);
	    JLabel rosa1=new JLabel("   ");
	    rosa1.setBackground(Color.PINK);
	    rosa1.setOpaque(true);
	    cuatroComponenentes.add(rosa1);
	    
	    JLabel textMonto = new JLabel("     Interes", 2);
	    textMonto.setBackground(Color.PINK);
	    textMonto.setOpaque(true);
	    textMonto.setFont(new Font("Arial", Font.BOLD, 12));
	    cuatroComponenentes.add(textMonto);

	    JTextField montoI=new JTextField();
	    montoI.setHorizontalAlignment(0);
	    cuatroComponenentes.add(montoI);
	    
	    JLabel rosa2=new JLabel("   ");
	    rosa2.setBackground(Color.PINK);
	    rosa2.setOpaque(true);
	    cuatroComponenentes.add(rosa2);
	    JLabel rosa3=new JLabel("   ");
	    rosa3.setBackground(Color.PINK);
	    rosa3.setOpaque(true);
	    cuatroComponenentes.add(rosa3);
	    
	    JLabel textMonto2 = new JLabel("     Monto ", 2);
	    textMonto2.setBackground(Color.PINK);
	    textMonto2.setOpaque(true);
	    textMonto2.setFont(new Font("Arial", Font.BOLD, 12));
	    cuatroComponenentes.add(textMonto2);

	    JTextField monto=new JTextField();
	    monto.setHorizontalAlignment(0);
	    cuatroComponenentes.add(monto);

	    JLabel rosa4=new JLabel("   ");
	    rosa4.setBackground(Color.PINK);
	    rosa4.setOpaque(true);
	    cuatroComponenentes.add(rosa4);
	    JLabel rosa5=new JLabel("   ");
	    rosa5.setBackground(Color.PINK);
	    rosa5.setOpaque(true);
	    cuatroComponenentes.add(rosa5);
	    
	    this.add(panel);
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
