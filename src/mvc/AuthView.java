package mvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthView {
	JPanel panel;
	AuthModel modelo;
	public AuthView() {
		panel=new JPanel();
		modelo=new AuthModel();
	}
	
	public JPanel login() {
		panel.setBorder(BorderFactory.createLineBorder(new Color(0, 9, 198),10));
		panel.setBackground(new Color(13, 114, 203));
		panel.setLayout(null);
	
	    JLabel marco = new JLabel();
	    marco.setSize(385, 390);
	    marco.setLocation(55, 120);
	    marco.setOpaque(false);
	    marco.setBackground(new Color(13, 114, 203));
	    marco.setBorder(BorderFactory.createLineBorder(Color.black));
	    panel.add(marco);
	
	    JLabel loginT = new JLabel("Bienvenido", 0);
	    loginT.setFont(new Font("Impact", Font.PLAIN, 26));
	    loginT.setSize(385, 190);
	    loginT.setForeground(Color.white);
	    loginT.setLocation(55, 70);
	    loginT.setOpaque(false);
	    panel.add(loginT);
	
	    JLabel usuarioLabel = new JLabel("Nombre de Usuario", 2);
	    usuarioLabel.setFont(new Font("Arial", Font.BOLD, 16));
	    usuarioLabel.setSize(200, 30);
	    usuarioLabel.setForeground(Color.white);
	    usuarioLabel.setLocation(100, 200);
	    usuarioLabel.setOpaque(false);
	    panel.add(usuarioLabel);
	
	    JTextField usuarioField = new JTextField();
	    usuarioField.setBounds(100, 230, 300, 30);
	    usuarioField.setHorizontalAlignment(0);
	    panel.add(usuarioField);
	
	    JLabel contraseñaLabel = new JLabel("Contraseña", 2);
	    contraseñaLabel.setFont(new Font("Arial", Font.BOLD, 16));
	    contraseñaLabel.setSize(120, 30);
	    contraseñaLabel.setForeground(Color.white);
	    contraseñaLabel.setLocation(100, 280);
	    contraseñaLabel.setOpaque(false);
	    panel.add(contraseñaLabel);
	
	    JPasswordField contraseñaField = new JPasswordField();
	    contraseñaField.setBounds(100, 310, 300, 30);
	    contraseñaField.setHorizontalAlignment(0);
	    panel.add(contraseñaField);
	
	    JButton loginButton = new JButton("Iniciar Sesión");
	    loginButton.setBounds(100, 370, 300, 40);
	    loginButton.setBackground(new Color(137, 202, 206));
	    loginButton.setForeground(Color.black);
	    loginButton.setFocusable(false);
	    panel.add(loginButton);
	
	    loginButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String contraseña = new String(contraseñaField.getPassword());
	            if(modelo.login(usuarioField.getText(),contraseña)){
	            	System.out.println("Bienvenido");
	            }else {
	            	System.out.println("r");
	            }
	            
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
		panel.add(yaTienesCuenta);
		yaTienesCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
			panel.add(olvidasteC);
			olvidasteC.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
				
			});
	return panel;
}
	public JPanel registro() {
		panel.setBackground(Color.green);
		return panel;
	}
}
