import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class RegistroDeUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroDeUsuarios frame = new RegistroDeUsuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroDeUsuarios() {
		setBackground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel = new JLabel("Registro de Usuario");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 21));
		lblNewLabel.setForeground(new Color(183, 74, 9));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 8, 8));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("      Datos Generales");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		lblNewLabel_1.setBackground(new Color(128, 255, 255));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(128, 255, 255));
		panel_1.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 8, 8));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(128, 255, 255));
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(128, 255, 255));
		panel_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("    Nombres:");
		lblNewLabel_4.setBackground(new Color(128, 255, 255));
		lblNewLabel_4.setOpaque(true);
		panel_5.add(lblNewLabel_4);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("     Apellido Paterno:");
		panel_5.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("     Apellido Materno:");
		panel_5.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("     Fecha Nacimiento:");
		panel_5.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("     Sexo:");
		panel_5.add(lblNewLabel_8);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 255, 255));
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setOpaque(false);
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setOpaque(false);
		panel_6.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("     Nacionalidad:");
		panel_5.add(lblNewLabel_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perú", "México", "Brazil", "Canada", "Cuernavaca"}));
		panel_5.add(comboBox);
		
		JLabel lblNewLabel_10 = new JLabel("");
		panel_5.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("        ");
		panel_1.add(lblNewLabel_11, BorderLayout.WEST);
		
		JLabel lblNewLabel_12 = new JLabel("         ");
		panel_1.add(lblNewLabel_12, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 128));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("     Perfil del Usuario");
		lblNewLabel_13.setBackground(new Color(255, 111, 111));
		lblNewLabel_13.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		panel_2.add(lblNewLabel_13, BorderLayout.NORTH);
		
		JLabel lblNewLabel_14 = new JLabel("           ");
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBackground(new Color(255, 128, 128));
		panel_2.add(lblNewLabel_14, BorderLayout.WEST);
		
		JLabel lblNewLabel_15 = new JLabel("          ");
		lblNewLabel_15.setBackground(new Color(255, 128, 128));
		panel_2.add(lblNewLabel_15, BorderLayout.EAST);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(0, 1, 5, 8));
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\Oscar\\Downloads\\hombre.png"));
		panel_7.add(lblNewLabel_16);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 128, 128));
		panel_2.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new GridLayout(0, 1, 10, 2));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de Nacimiento");
		chckbxNewCheckBox_1.setOpaque(false);
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(chckbxNewCheckBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 55, 55));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_17 = new JLabel("     Datos Opcionales");
		lblNewLabel_17.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		panel_3.add(lblNewLabel_17, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 55, 55));
		panel_3.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(0, 2, 5, -5));
		
		JLabel lblNewLabel_19 = new JLabel("     Descripción");
		lblNewLabel_19.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		panel_9.add(lblNewLabel_19);
		
		JLabel lblNewLabel_18 = new JLabel("Preferencias");
		lblNewLabel_18.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		panel_9.add(lblNewLabel_18);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_9.add(scrollPane);
		
		JTextArea txtrHolaMundoBien = new JTextArea();
		txtrHolaMundoBien.setText("NO CAP\r\n\r\n10 oclock\r\n\r\nDown to monoblock\r\n\r\nI shout Loud fuck the opps\r\n\r\nWe’re going to the top\r\n\r\nNever stop\r\n\r\nSeeing how he is in shock\r\n\r\nSi me ven Con to mis latinos entrando al club\r\n\r\nWdf\r\n\r\nDo you wanna dance or what?\r\n\r\nSáquenme esa mierda y que me pongan hip hop\r\n\r\nWest coast, south side, pa los crip pa los blood\r\n\r\nDespués seguro lo baila tu shorty por tik tok\r\n\r\nPapi esta devuelta en casa\r\n\r\nVino a mover las masas\r\n\r\nEsta va por mis wachos por mi gente por mi raza\r\n\r\nSacándole la chapa a todas estas caretas falsas\r\n\r\nQue aman a quien lo sigue\r\n\r\nPero odian a quien lo alcanza\r\n\r\nGengsta\r\n\r\nLlegan los reales a la fiesta\r\n\r\nAlgunos son Maliantes con pistolas que les prestan\r\n\r\nGengsta\r\n\r\nMuchos hablan pocos lo demuestran\r\n\r\nSalgo por la cuarta por la quinta y por la sexta\r\n\r\nNo cap\r\n\r\nReal facts\r\n\r\nSmoke weed hip hop and fuck it up\r\n\r\nDando vueltas en la ciudad\r\n\r\nNo soy tupac, pero todo el club all eyez on me\r\n\r\nNo cap\r\n\r\nReal facts\r\n\r\nSmoke weed hip hop and fuck it up\r\n\r\nDando vueltas en la ciudad\r\n\r\nLa la la la la la\r\n\r\nShake that that\r\n\r\nReady for Late nigth");
		scrollPane.setViewportView(txtrHolaMundoBien);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_9.add(scrollPane_1);
		
		JTextArea txtrOhhBabyTrueno = new JTextArea();
		txtrOhhBabyTrueno.setText("OHH BABY\r\nTrueno\r\nOh, baby, me tienes crazy\r\nEstoy loco con tu baile, me saca el aire\r\nOh, baby, I see you later\r\nY ahora que no está nadie, el aire vuelve (oh, baby)\r\n\r\nLa disco está encendía'\r\nYa estamo' bien to' los mío', I keep it real\r\nTranquila, que esta noche la ciudad es mía\r\nSi no nos ven, trae la mota, que es de día\r\nComo lo pedías\r\n\r\nOh, baby, me tienes crazy\r\nEstoy loco con tu baile, me saca el aire\r\nOh, baby, I see you later\r\nY ahora que no está nadie, el aire vuelve\r\n\r\nQuiero que pongan el mismo tema por última vez\r\nDame la mano y bailemo' por última vez\r\nSoy de bajar del aeropuerto y destruir ciudades\r\nPero cuando te veo el aire, se me sale (la disco está encendía')\r\n\r\nOh, y mi blunt también\r\nMami, hoy no me voy a portar bien\r\nElla con sus friends y yo con my men\r\nVamo' siempre steady, no me importa contra quién\r\n\r\nUn par de mirada' por ahí que me ven\r\nYo sigo fumando to' mi weed del Edén\r\nLa noche me llama y me lo piden again\r\nBaby, I don't give a fuck when I walk with them\r\n\r\nNo quiero ser descortés\r\nMami, solamente quiero que me des, won't dance\r\nSi venís pa'cá, estoy blessed\r\nSo clean, so fan, so fresh, so clean-clean-clean\r\n\r\nSo fan, so fresh, no dance");
		scrollPane_1.setViewportView(txtrOhhBabyTrueno);
		
		JLabel lblNewLabel_20 = new JLabel("       ");
		panel_3.add(lblNewLabel_20, BorderLayout.WEST);
		
		JLabel lblNewLabel_21 = new JLabel("                                                 ");
		panel_3.add(lblNewLabel_21, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_22 = new JLabel("        ");
		panel_3.add(lblNewLabel_22, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 255, 255));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(128, 255, 255));
		panel_4.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(0, 1, 0, 8));
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		panel_10.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFocusable(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		panel_10.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		panel_10.add(btnNewButton_2);
		
		JLabel lblNewLabel_23 = new JLabel("                     ");
		panel_4.add(lblNewLabel_23, BorderLayout.NORTH);
		
		JLabel lblNewLabel_24 = new JLabel("                     ");
		panel_4.add(lblNewLabel_24, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_25 = new JLabel("                     ");
		panel_4.add(lblNewLabel_25, BorderLayout.WEST);
		
		JLabel lblNewLabel_26 = new JLabel("                     ");
		panel_4.add(lblNewLabel_26, BorderLayout.EAST);
	}

}
