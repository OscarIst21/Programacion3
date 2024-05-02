package Graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginRegistro extends JFrame {
	
public LoginRegistro(){
	this.setTitle("no");
	this.setSize(520, 720);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setMinimumSize(new Dimension(250,250));
	this.setMaximumSize(new Dimension(600,600));
	
	this.iniciarComponentes();
	
	this.setVisible(true);
}


public void iniciarComponentes() {
	this.login();
	//this.registro();
}

public void registro() {
		menu();
		this.setTitle("Registro");
		JPanel registro= new JPanel();

		this.setLocationRelativeTo(null);
		registro.setSize(this.getWidth(),this.getHeight());
		registro.setLocation(0, 0);
		registro.setBackground(new Color(13, 114, 203));
		registro.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
		registro.setLayout(null);

		JLabel marco = new JLabel();
		marco.setSize(420, 520);
		marco.setLocation(45, 70);
		marco.setOpaque(false);
		marco.setBackground(new Color(13, 114, 203)); 
		marco.setBorder(BorderFactory.createLineBorder(Color.black));
		registro.add(marco);
		
		JLabel registroT=new JLabel("Registro", 0);
		registroT.setFont(new Font("Impact",Font.BOLD,26));
		registroT.setSize(420, 190);
		registroT.setForeground(Color.white);
		registroT.setLocation(45, 20);
		registroT.setOpaque(false);
		registro.add(registroT);
		
		JLabel usuarioR=new JLabel("Nombre",2);
		usuarioR.setFont(new Font("Arial",Font.BOLD,16));
		usuarioR.setSize(80,30);
		usuarioR.setForeground(Color.white);
		usuarioR.setLocation(80,150);
		usuarioR.setOpaque(false);
		registro.add(usuarioR);
		
		JTextField nombreUsuarioR=new JTextField();
		nombreUsuarioR.setBounds(80, 180, 150, 30);
		nombreUsuarioR.setHorizontalAlignment(0);
		registro.add(nombreUsuarioR);
		
		JLabel usuarioAR=new JLabel("Apellido",2);
		usuarioAR.setFont(new Font("Arial",Font.BOLD,16));
		usuarioAR.setSize(80,30);
		usuarioAR.setForeground(Color.white);
		usuarioAR.setLocation(280,150);
		usuarioAR.setOpaque(false);
		registro.add(usuarioAR);
		
		JTextField nombreUsuarioAR=new JTextField();
		nombreUsuarioAR.setBounds(280, 180, 150, 30);
		nombreUsuarioAR.setHorizontalAlignment(0);
		registro.add(nombreUsuarioAR);
		
		JLabel contraseña=new JLabel("Contraseña",2);
		contraseña.setFont(new Font("Arial",Font.BOLD,16));
		contraseña.setSize(120,30);
		contraseña.setForeground(Color.white);
		contraseña.setLocation(80,230);
		contraseña.setOpaque(false);
		registro.add(contraseña);
		
		JPasswordField contraUsuario=new JPasswordField();
		contraUsuario.setBounds(80, 260, 350, 30);
		contraUsuario.setHorizontalAlignment(0);
		registro.add(contraUsuario);
		
		JLabel contraseñaC=new JLabel("Confirmar contraseña",2);
		contraseñaC.setFont(new Font("Arial",Font.BOLD,16));
		contraseñaC.setSize(180,30);
		contraseñaC.setForeground(Color.white);
		contraseñaC.setLocation(80,320);
		contraseñaC.setOpaque(false);
		registro.add(contraseñaC);
		
		JPasswordField contraUsuarioC=new JPasswordField();
		contraUsuarioC.setBounds(80, 350, 350, 30);
		contraUsuarioC.setHorizontalAlignment(0);
		registro.add(contraUsuarioC);
		
		JCheckBox item_box=new JCheckBox("Acepto los terminos y condiciones hello kitty");
		item_box.setBounds(120, 400, 300, 30);
		item_box.setFont(new Font("Sitka", Font.BOLD,12));
		item_box.setForeground(Color.white);
		item_box.setOpaque(false);
		registro.add(item_box);
		
		JButton registroAceptar=new JButton("Registrarse");
		registroAceptar.setBounds(80, 450, 350, 40);
		registroAceptar.setBackground(new Color(137, 202, 206 ));
		registroAceptar.setForeground(Color.black);
		registroAceptar.setFocusable(false);
		registro.add(registroAceptar);
		
		registroAceptar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				 String nombre = nombreUsuarioR.getText();
			        String apellido = nombreUsuarioAR.getText();
			        String contrasena = new String(contraUsuario.getPassword());
			        String contrasenaConfirmada = new String(contraUsuarioC.getPassword());
			        boolean aceptoTerminos = item_box.isSelected();
			        if (!aceptoTerminos) {
		                item_box.setForeground(Color.RED);
		            }else {
		            	item_box.setForeground(Color.white);
		            }
			        if (nombre.isEmpty() || apellido.isEmpty() || contrasena.isEmpty() || contrasenaConfirmada.isEmpty()) {
			            nombreUsuarioR.setBorder(BorderFactory.createLineBorder(Color.RED,2));
			            nombreUsuarioAR.setBorder(BorderFactory.createLineBorder(Color.RED,2));
			            contraUsuario.setBorder(BorderFactory.createLineBorder(Color.RED,2));
			            contraUsuarioC.setBorder(BorderFactory.createLineBorder(Color.RED,2));
			            return;
			        }
			        if (nombre.isEmpty()) {
			        	nombreUsuarioR.setBorder(BorderFactory.createLineBorder(Color.red,5));
			           
			            return; 
			        }else if(apellido.isEmpty()) {
			        	nombreUsuarioAR.setBorder(BorderFactory.createLineBorder(Color.red,5));
			        }else {

			        	nombreUsuarioR.setBorder(BorderFactory.createLineBorder(Color.green,1));
			        	nombreUsuarioAR.setBorder(BorderFactory.createLineBorder(Color.green,1));
			        }
			        if (!contrasena.equals(contrasenaConfirmada)) {
			            contraUsuario.setBorder(BorderFactory.createLineBorder(Color.RED));
			            contraUsuarioC.setBorder(BorderFactory.createLineBorder(Color.RED));
			            
			            return;
			        }else {
			            contraUsuario.setBorder(BorderFactory.createLineBorder(Color.green));
			            contraUsuarioC.setBorder(BorderFactory.createLineBorder(Color.green));
			            
			        }
			        
			    }
			});
		JButton yaTienesCuenta=new JButton("<html><u>¿Ya tienes cuenta?</u><html>");
		yaTienesCuenta.setBounds(80, 490, 350, 40);
		yaTienesCuenta.setOpaque(false);
		yaTienesCuenta.setBorder(null);
		yaTienesCuenta.setContentAreaFilled(false);
		yaTienesCuenta.setBackground(new Color(137, 202, 206 ));
		yaTienesCuenta.setForeground(Color.black);
		yaTienesCuenta.setFocusable(false);
		registro.add(yaTienesCuenta);
		yaTienesCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
		        getContentPane().repaint();
		        getContentPane().revalidate();
		        login();
			}
			
		});
		this.add(registro);
}
public void menu() {
	JMenuBar barra = new JMenuBar();
    JMenu menuCuenta = new JMenu("Cuenta");
    JMenuItem loginItem = new JMenuItem("Login");
    loginItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        login();
		}
    	
    });
    JMenuItem registroItem = new JMenuItem("Registro");
    registroItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        registro();
		}
    	
    });
    JMenuItem recuperacionItem = new JMenuItem("Recuperacion de cuenta");
    recuperacionItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        recuperarCuenta();
		}
    	
    });
    menuCuenta.add(loginItem);
    menuCuenta.add(registroItem);
    menuCuenta.add(recuperacionItem);
    JMenu menuUsuario = new JMenu("Usuario");
    
    JMenuItem altaItem = new JMenuItem("Alta");
    altaItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        alta();
		}
    	
    });
    JMenuItem bajaItem = new JMenuItem("Baja");
    bajaItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        baja();
		}
    	
    });
    JMenuItem consultarItem = new JMenuItem("Consultar");
    consultarItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        consultar();
		}
    	
    });
    menuUsuario.add(altaItem);
    menuUsuario.add(bajaItem);
    menuUsuario.add(consultarItem);
    JMenu menuAyuda = new JMenu("Ayuda");
    JMenuItem crearUItem = new JMenuItem("¿Como crear un usuario?");
    crearUItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        comoCrearUsuario();
		}
    	
    });
    JMenuItem accederItem = new JMenuItem("¿Cómo acceder al sistema?");
    accederItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        comoAccederSistema();
		}
    	
    });
    JMenuItem QpasaItem = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
    QpasaItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        quePasaSiOlvideMicontraseña();
		}
    	
    });
    menuAyuda.add(crearUItem);
    menuAyuda.add(accederItem);
    menuAyuda.add(QpasaItem);
    
    barra.add(menuCuenta);
    barra.add(menuUsuario);
    barra.add(menuAyuda);
    setJMenuBar(barra);
    
}
public void login() {
		menu();
	    this.setTitle("Login");
	    JPanel login = new JPanel();
	    login.setSize(this.getWidth(), this.getHeight());
	    login.setLocation(0, 0);
	    login.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	    login.setBackground(new Color(13, 114, 203));
	    login.setLayout(null);
	
	    JLabel marco = new JLabel();
	    marco.setSize(385, 390);
	    marco.setLocation(55, 120);
	    marco.setOpaque(false);
	    marco.setBackground(new Color(13, 114, 203));
	    marco.setBorder(BorderFactory.createLineBorder(Color.black));
	    login.add(marco);
	
	    JLabel loginT = new JLabel("Bienvenido", 0);
	    loginT.setFont(new Font("Impact", Font.PLAIN, 26));
	    loginT.setSize(385, 190);
	    loginT.setForeground(Color.white);
	    loginT.setLocation(55, 70);
	    loginT.setOpaque(false);
	    login.add(loginT);
	
	    JLabel usuarioLabel = new JLabel("Nombre de Usuario", 2);
	    usuarioLabel.setFont(new Font("Arial", Font.BOLD, 16));
	    usuarioLabel.setSize(200, 30);
	    usuarioLabel.setForeground(Color.white);
	    usuarioLabel.setLocation(100, 200);
	    usuarioLabel.setOpaque(false);
	    login.add(usuarioLabel);
	
	    JTextField usuarioField = new JTextField();
	    usuarioField.setBounds(100, 230, 300, 30);
	    usuarioField.setHorizontalAlignment(0);
	    login.add(usuarioField);
	
	    JLabel contraseñaLabel = new JLabel("Contraseña", 2);
	    contraseñaLabel.setFont(new Font("Arial", Font.BOLD, 16));
	    contraseñaLabel.setSize(120, 30);
	    contraseñaLabel.setForeground(Color.white);
	    contraseñaLabel.setLocation(100, 280);
	    contraseñaLabel.setOpaque(false);
	    login.add(contraseñaLabel);
	
	    JPasswordField contraseñaField = new JPasswordField();
	    contraseñaField.setBounds(100, 310, 300, 30);
	    contraseñaField.setHorizontalAlignment(0);
	    login.add(contraseñaField);
	
	    JButton loginButton = new JButton("Iniciar Sesión");
	    loginButton.setBounds(100, 370, 300, 40);
	    loginButton.setBackground(new Color(137, 202, 206));
	    loginButton.setForeground(Color.black);
	    loginButton.setFocusable(false);
	    login.add(loginButton);
	
	    loginButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String usuario = usuarioField.getText();
	            String contraseña = new String(contraseñaField.getPassword());
	            
	        }
	    });
	    JButton yaTienesCuenta=new JButton("<html><u>¿Nuevo usuario?</u><html>");
		yaTienesCuenta.setBounds(100, 410, 300, 40);
		yaTienesCuenta.setOpaque(false);
		yaTienesCuenta.setBorder(null);
		yaTienesCuenta.setContentAreaFilled(false);
		yaTienesCuenta.setBackground(new Color(137, 202, 206 ));
		yaTienesCuenta.setForeground(Color.black);
		yaTienesCuenta.setFocusable(false);
		login.add(yaTienesCuenta);
		yaTienesCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
		        getContentPane().repaint();
		        getContentPane().revalidate();
		        registro();
			}
			
		});
		 JButton olvidasteC=new JButton("<html><u>¿Olvidaste tu contraseña?</u><html>");
		 olvidasteC.setBounds(100, 335, 130, 40);
		 olvidasteC.setFont(new Font("Arial", Font.BOLD, 10));
		 olvidasteC.setOpaque(false);
		 olvidasteC.setBorder(null);
		 olvidasteC.setContentAreaFilled(false);
		 olvidasteC.setBackground(new Color(137, 202, 206 ));
		 olvidasteC.setForeground(Color.black);
		 olvidasteC.setFocusable(false);
			login.add(olvidasteC);
			olvidasteC.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().removeAll();
			        getContentPane().repaint();
			        getContentPane().revalidate();
			        recuperarCuenta();
				}
				
			});
	    this.add(login);
}
public void recuperarCuenta() {
	menu();
    this.setTitle("Recuperar Cuenta");
    JPanel recuperarCuenta = new JPanel();
    recuperarCuenta.setSize(this.getWidth(), this.getHeight());
    recuperarCuenta.setLocation(0, 0);
    recuperarCuenta.setBorder(BorderFactory.createLineBorder(new Color(88, 93, 122),10));
    recuperarCuenta.setBackground(new Color(119, 129, 185));
    recuperarCuenta.setLayout(null);


    JLabel recuperarCuentaT = new JLabel("Recuperar Cuenta", 0);
    recuperarCuentaT.setFont(new Font("Impact", Font.PLAIN, 26));
    recuperarCuentaT.setSize(385, 190);
    recuperarCuentaT.setForeground(Color.black);
    recuperarCuentaT.setLocation(55, 90);
    recuperarCuentaT.setOpaque(false);
    recuperarCuenta.add(recuperarCuentaT);


    JLabel usuarioLabel = new JLabel("Correo electronico", 2);
    usuarioLabel.setFont(new Font("Arial", Font.BOLD, 16));
    usuarioLabel.setSize(200, 30);
    usuarioLabel.setForeground(Color.black);
    usuarioLabel.setLocation(100, 270);
    usuarioLabel.setOpaque(false);
    recuperarCuenta.add(usuarioLabel);

    JTextField usuarioField = new JTextField();
    usuarioField.setBounds(100, 300, 300, 30);
    usuarioField.setHorizontalAlignment(0);
    recuperarCuenta.add(usuarioField);
    
    JButton siguiente = new JButton("Siguiente");
    siguiente.setBounds(100, 380, 300, 40);
    siguiente.setBackground(new Color(95, 101, 140));
    siguiente.setForeground(Color.white);
    siguiente.setFocusable(false);
    recuperarCuenta.add(siguiente);

    JButton cancelar = new JButton("Cancelar");
    cancelar.setBounds(100, 430, 300, 40);
    cancelar.setBackground(new Color(162, 167, 194));
    cancelar.setForeground(Color.black);
    cancelar.setFocusable(false);
    recuperarCuenta.add(cancelar);
    cancelar.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			getContentPane().removeAll();
	        getContentPane().repaint();
	        getContentPane().revalidate();
	        login();
		}
		
	});
    JLabel marco = new JLabel();
    marco.setSize(385, 420);
    marco.setLocation(55, 120);
    marco.setOpaque(true);
    marco.setBackground(new Color(186, 197, 255));
    marco.setBorder(BorderFactory.createLineBorder(Color.black));
    recuperarCuenta.add(marco);
    
    this.add(recuperarCuenta);
}
public void alta() {
	menu();
	this.setTitle("Alta");
	JPanel altaP= new JPanel();

	this.setLocationRelativeTo(null);
	altaP.setSize(this.getWidth(),this.getHeight());
	altaP.setLocation(0, 0);
	altaP.setBackground(new Color(13, 114, 203));
	altaP.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	altaP.setLayout(null);

    JLabel titulo = new JLabel("Alta de usuario", 0);
    titulo.setFont(new Font("Impact", Font.PLAIN, 26));
    titulo.setSize(385, 90);
    titulo.setForeground(Color.black);
    titulo.setLocation(55, 20);
    titulo.setOpaque(false);
    altaP.add(titulo);
	
	this.add(altaP);
}
public void baja() {
	menu();
	this.setTitle("Baja");
	JPanel panelP= new JPanel();

	this.setLocationRelativeTo(null);
	panelP.setSize(this.getWidth(),this.getHeight());
	panelP.setLocation(0, 0);
	panelP.setBackground(new Color(13, 114, 203));
	panelP.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	panelP.setLayout(null);

    JLabel titulo = new JLabel("Baja de usuario", 0);
    titulo.setFont(new Font("Impact", Font.PLAIN, 26));
    titulo.setSize(385, 90);
    titulo.setForeground(Color.black);
    titulo.setLocation(55, 20);
    titulo.setOpaque(false);
    panelP.add(titulo);
	
	this.add(panelP);
}
public void consultar() {
	menu();
	this.setTitle("Consultar");
	JPanel panelP= new JPanel();

	this.setLocationRelativeTo(null);
	panelP.setSize(this.getWidth(),this.getHeight());
	panelP.setLocation(0, 0);
	panelP.setBackground(new Color(13, 114, 203));
	panelP.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	panelP.setLayout(null);

    JLabel titulo = new JLabel("Consultar Usuario", 0);
    titulo.setFont(new Font("Impact", Font.PLAIN, 26));
    titulo.setSize(385, 90);
    titulo.setForeground(Color.black);
    titulo.setLocation(55, 20);
    titulo.setOpaque(false);
    panelP.add(titulo);
	
	this.add(panelP);
}
public void comoCrearUsuario() {
	menu();
	this.setTitle("¿Cómo crear un usuario?");
	JPanel panelP= new JPanel();

	this.setLocationRelativeTo(null);
	panelP.setSize(this.getWidth(),this.getHeight());
	panelP.setLocation(0, 0);
	panelP.setBackground(new Color(13, 114, 203));
	panelP.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	panelP.setLayout(null);

    JLabel titulo = new JLabel("¿Cómo crear un usuario?", 0);
    titulo.setFont(new Font("Impact", Font.PLAIN, 26));
    titulo.setSize(385, 90);
    titulo.setForeground(Color.black);
    titulo.setLocation(55, 20);
    titulo.setOpaque(false);
    panelP.add(titulo);
	
	this.add(panelP);
}
public void comoAccederSistema() {
	menu();
	this.setTitle("¿Cómo crear un usuario?");
	JPanel panelP= new JPanel();

	this.setLocationRelativeTo(null);
	panelP.setSize(this.getWidth(),this.getHeight());
	panelP.setLocation(0, 0);
	panelP.setBackground(new Color(13, 114, 203));
	panelP.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	panelP.setLayout(null);

    JLabel titulo = new JLabel("¿Cómo acceder al sistema?", 0);
    titulo.setFont(new Font("Impact", Font.PLAIN, 26));
    titulo.setSize(385, 90);
    titulo.setForeground(Color.black);
    titulo.setLocation(55, 20);
    titulo.setOpaque(false);
    panelP.add(titulo);
	
	this.add(panelP);
}
public void quePasaSiOlvideMicontraseña() {
	menu();
	this.setTitle("¿Qué pasa si olvidé mi contraseña?");
	JPanel panelP= new JPanel();

	this.setLocationRelativeTo(null);
	panelP.setSize(this.getWidth(),this.getHeight());
	panelP.setLocation(0, 0);
	panelP.setBackground(new Color(13, 114, 203));
	panelP.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
	panelP.setLayout(null);

    JLabel titulo = new JLabel("¿Qué pasa si olvidé mi contraseña?", 0);
    titulo.setFont(new Font("Impact", Font.PLAIN, 26));
    titulo.setSize(385, 90);
    titulo.setForeground(Color.black);
    titulo.setLocation(55, 20);
    titulo.setOpaque(false);
    panelP.add(titulo);
	
	this.add(panelP);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LoginRegistro loginregistro=new LoginRegistro();
	}

}