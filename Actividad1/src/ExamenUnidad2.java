import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.Dimension;
public class ExamenUnidad2 extends JFrame {
	


	public ExamenUnidad2() {
		this.setTitle("Factura");
		this.setSize(660, 600);
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
		JPanel adminPanel= new JPanel();
		adminPanel.setSize(this.getWidth(),this.getHeight());
		adminPanel.setLocation(0, 0);
		adminPanel.setBackground(Color.white);
		adminPanel.setLayout(null);
		

		JLabel Usuarioswidget=new JLabel("  [Sin Base de datos]");
		Usuarioswidget.setBounds(20, 40, 700, 40);
		Usuarioswidget.setOpaque(false);
		Usuarioswidget.setBackground(new Color(0, 128, 176));
		Usuarioswidget.setFont(new Font("arial",Font.BOLD,11));
		Usuarioswidget.setForeground(Color.white);
		adminPanel.add(Usuarioswidget);
		
		JLabel valorDs=new JLabel("                    330.0");
		valorDs.setBounds(295, 450, 700, 40);
		valorDs.setOpaque(false);
		valorDs.setFont(new Font("arial",Font.BOLD,12));
		valorDs.setForeground(Color.black);
		adminPanel.add(valorDs);
		JLabel valorD=new JLabel(" Valor descontado:           ");
		valorD.setBounds(245, 450, 700, 40);
		valorD.setOpaque(false);
		valorD.setFont(new Font("arial",Font.PLAIN,12));
		valorD.setForeground(Color.black);
		adminPanel.add(valorD);
		
		JLabel Titulowidget=new JLabel("    Factura en Java - NetBeans - ArrayList y POO");
		Titulowidget.setBounds(0, 0, 700, 80);
		Titulowidget.setOpaque(true); 
		Titulowidget.setBackground(new Color(0, 128, 176));
		Titulowidget.setFont(new Font("arial",Font.BOLD,20));
		Titulowidget.setForeground(Color.white);
		adminPanel.add(Titulowidget);
		
		JLabel f=new JLabel("     ");
		f.setBounds(0, 550, 700, 20);
		f.setOpaque(true); 
		f.setBackground(new Color(0, 128, 176));
		f.setFont(new Font("arial",Font.BOLD,20));
		f.setForeground(Color.white);
		adminPanel.add(f);
		
		JButton download=new JButton("Exportar");
		download.setBounds(730, 180, 140, 30);
		download.setBackground(new Color(231, 0, 0));
		download.setForeground(Color.WHITE);
		adminPanel.add(download);
		
		
		String[] title= {"Producto","Cantidad","Valor", "Sub. total"};
		String[][] datos= {
				{"Agua"    , "99", "$500", "500.0"},
				{"Cereal"  , "2", "$20", "1000.0"},
				{"Leche"   , "5", "$10", "600.0"},
				{"CocaCola", "9", "$15", "200.0"}
		};
		
		JLabel Datos=new JLabel("Datos del cliente:");
		Datos.setBounds(25, 80, 700, 40);
		Datos.setOpaque(false);
		Datos.setFont(new Font("arial",Font.BOLD,12));
		Datos.setForeground(Color.black);
		adminPanel.add(Datos);
		
		JLabel documento=new JLabel("Documento:");
		documento.setBounds(35, 100, 100, 40);
		documento.setOpaque(false);
		documento.setFont(new Font("arial",Font.PLAIN,11));
		documento.setForeground(Color.black);
		adminPanel.add(documento);

		JTextField nombreUsuario=new JTextField("12345");
		nombreUsuario.setBounds(115, 110, 170, 20);
		adminPanel.add(nombreUsuario);
		
		JLabel direccion=new JLabel("Dirección:");
		direccion.setBounds(35, 130, 100, 40);
		direccion.setOpaque(false);
		direccion.setFont(new Font("arial",Font.PLAIN,11));
		direccion.setForeground(Color.black);
		adminPanel.add(direccion);

		JTextField direccionf=new JTextField("Calle #1 231");
		direccionf.setBounds(115, 140, 170, 20);
		adminPanel.add(direccionf);
		
		JLabel nombre=new JLabel("Nombre:");
		nombre.setBounds(335, 100, 100, 40);
		nombre.setOpaque(false);
		nombre.setFont(new Font("arial",Font.PLAIN,11));
		nombre.setForeground(Color.black);
		adminPanel.add(nombre);

		JTextField nombreU=new JTextField("Juan");
		nombreU.setBounds(415, 110, 170, 20);
		adminPanel.add(nombreU);
		
		JLabel telefono=new JLabel("Telefono:");
		telefono.setBounds(335, 130, 100, 40);
		telefono.setOpaque(false);
		telefono.setFont(new Font("arial",Font.PLAIN,11));
		telefono.setForeground(Color.black);
		adminPanel.add(telefono);

		JTextField telefonoF=new JTextField("432412");
		telefonoF.setBounds(415, 140, 170, 20);
		adminPanel.add(telefonoF);
		
		JLabel DatosF=new JLabel("Datos de factura:");
		DatosF.setBounds(25, 180, 700, 40);
		DatosF.setOpaque(false);
		DatosF.setFont(new Font("arial",Font.BOLD,12));
		DatosF.setForeground(Color.black);
		adminPanel.add(DatosF);
		
		JLabel nfactura=new JLabel("No. Factura:");
		nfactura.setBounds(35, 200, 100, 40);
		nfactura.setOpaque(false);
		nfactura.setFont(new Font("arial",Font.PLAIN,11));
		nfactura.setForeground(Color.black);
		adminPanel.add(nfactura);

		JTextField nfacturaf=new JTextField("1");
		nfacturaf.setBounds(115, 210, 170, 20);
		adminPanel.add(nfacturaf);
		
		JLabel fecha=new JLabel("Fecha:");
		fecha.setBounds(335, 200, 100, 40);
		fecha.setOpaque(false);
		fecha.setFont(new Font("arial",Font.PLAIN,11));
		fecha.setForeground(Color.black);
		adminPanel.add(fecha);

		JTextField fechaf=new JTextField("28/03/24");
		fechaf.setBounds(415, 210, 170, 20);
		adminPanel.add(fechaf);
		
		JLabel logo=new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("lista.png")));
		logo.setBounds(25, 255, 30, 30);
		adminPanel.add(logo);
		
		JLabel lista=new JLabel("Ver listado de facturas:");
		lista.setBounds(60, 250, 700, 40);
		lista.setOpaque(false);
		lista.setFont(new Font("arial",Font.BOLD,12));
		lista.setForeground(Color.black);
		adminPanel.add(lista);

		JButton añadir = new JButton("Añadir", new ImageIcon(getClass().getResource("nuevo.png")));
		añadir.setBounds(385, 260, 100, 25); 
		añadir.setBackground(Color.WHITE);
		añadir.setForeground(Color.BLACK);
		adminPanel.add(añadir);
		
		JButton eliminar = new JButton("Eliminar", new ImageIcon(getClass().getResource("mal.png")));
		eliminar.setBounds(500, 260, 120, 25);
		eliminar.setBackground(Color.WHITE);
		eliminar.setForeground(Color.BLACK);
		adminPanel.add(eliminar);
		
		JTable tablaDatos=new JTable(datos,title);
		tablaDatos.setBounds(10, 310, 600, 100);
		JScrollPane table_scroll = new JScrollPane(tablaDatos);
		table_scroll.setBounds(20, 290, 600, 140);
		adminPanel.add(table_scroll);
		
		JLabel subtotalF=new JLabel("                    6060.00");
		subtotalF.setBounds(85, 430, 700, 40);
		subtotalF.setOpaque(false);
		subtotalF.setFont(new Font("arial",Font.BOLD,12));
		subtotalF.setForeground(Color.black);
		adminPanel.add(subtotalF);
		JLabel subtotal=new JLabel("SubTotal:           ");
		subtotal.setBounds(35, 430, 700, 40);
		subtotal.setOpaque(false);
		subtotal.setFont(new Font("arial",Font.PLAIN,12));
		subtotal.setForeground(Color.black);
		adminPanel.add(subtotal);
		
		
		JLabel descuento=new JLabel("% Descuento: ");
		descuento.setBounds(35, 450, 100, 40);
		descuento.setOpaque(false);
		descuento.setFont(new Font("arial",Font.PLAIN,12));
		descuento.setForeground(Color.black);
		adminPanel.add(descuento);
		
		JTextField descuentoF=new JTextField("5");
		descuentoF.setBounds(145, 460, 45, 20);
		adminPanel.add(descuentoF);
		
		JCheckBox descuentoS=new JCheckBox();
		descuentoS.setBounds(205, 460, 35, 20);
		adminPanel.add(descuentoS);
		
		
		
		JLabel ivaf=new JLabel("                    1254.0");
		ivaf.setBounds(85, 470, 700, 40);
		ivaf.setOpaque(false);
		ivaf.setFont(new Font("arial",Font.BOLD,12));
		ivaf.setForeground(Color.black);
		adminPanel.add(ivaf);
		JLabel iva=new JLabel(" IVA 19%:           ");
		iva.setBounds(35, 470, 700, 40);
		iva.setOpaque(false);
		iva.setFont(new Font("arial",Font.PLAIN,12));
		iva.setForeground(Color.black);
		adminPanel.add(iva);
		
		JLabel totalF=new JLabel("                    7524.0");
		totalF.setBounds(85, 490, 700, 40);
		totalF.setOpaque(false);
		totalF.setFont(new Font("arial",Font.BOLD,12));
		totalF.setForeground(Color.black);
		adminPanel.add(totalF);
		JLabel total=new JLabel(" Total Factura:           ");
		total.setBounds(35, 490, 700, 40);
		total.setOpaque(false);
		total.setFont(new Font("arial",Font.PLAIN,12));
		total.setForeground(Color.black);
		adminPanel.add(total);
		
		JButton finalizar=new JButton("Finalizar factura");
		finalizar.setBounds(325, 520, 140, 20);
		finalizar.setBackground(Color.white);
		finalizar.setForeground(Color.BLACK);
		adminPanel.add(finalizar);
		
		JButton limpiar=new JButton("Limpiar");
		limpiar.setBounds(495, 520, 100, 20);
		limpiar.setBackground(Color.white);
		limpiar.setForeground(Color.BLACK);
		adminPanel.add(limpiar);
		
		this.add(adminPanel);
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	ExamenUnidad2 ventana=new ExamenUnidad2();
}
}