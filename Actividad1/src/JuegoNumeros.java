import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JuegoNumeros extends JFrame {
    boolean turno = false;
    JButton[] botones = new JButton[16];
    JLabel logo = new JLabel();

    public JuegoNumeros() {
        this.setTitle("Puzzle Numeros");
        this.setSize(660, 690);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setMinimumSize(new java.awt.Dimension(250, 250));
        this.setMaximumSize(new java.awt.Dimension(600, 600));

        this.iniciarComponentes();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(Color.black,4));
        panel1.setBackground(new Color(0, 102, 173));
        panel1.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel1.add(panel, BorderLayout.CENTER);
        
        JLabel marcoN=new JLabel("          ");
        marcoN.setBackground(new Color(0, 102, 173));
        
        panel1.add(marcoN, BorderLayout.NORTH);

        JLabel marcoE=new JLabel("          ");
        panel1.add(marcoE, BorderLayout.EAST);

        JLabel marcoW=new JLabel("          ");
        panel1.add(marcoW, BorderLayout.WEST);
        
        JPanel sur=new JPanel();
        sur.setBackground(new Color(0, 102, 173));
        panel1.add(sur,BorderLayout.SOUTH);
        sur.setLayout(new GridLayout(1,3));
        JLabel marcoSE=new JLabel("                        ");
        sur.add(marcoSE);
        
       
        
        
        panel.setLayout(new GridLayout(4, 4));
        panel.setSize(660, 660);
        panel.setBorder(new LineBorder(Color.black,4));
        panel.setBackground(new Color(192, 255, 248));
       
        List<String> numeros = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            numeros.add(String.valueOf(i));
        }
        numeros.add(""); 
        Collections.shuffle(numeros);
        
        JButton reiniciar=new JButton("Reiniciar");
        reiniciar.setFocusable(false);
        reiniciar.setBorder(new LineBorder(new Color(0, 102, 173),3));
        sur.add(reiniciar);
        
        JLabel marcoSW=new JLabel("                        ");
        sur.add(marcoSW);
        
        for (int i = 0; i < 16; i++) {
            botones[i] = new JButton(numeros.get(i));
            botones[i].setBorder(new LineBorder(new Color(0, 102, 173), 3));
            botones[i].setFocusable(false);
            botones[i].setFont(new Font("Arial", Font.BOLD, 32));
            botones[i].setBackground(new Color(79, 183, 255));
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton botonPresionado = (JButton) e.getSource();
                    botonPresionado.setFont(new Font("Arial", Font.BOLD, 32));
                    int indice =0;
                    for (int j = 0; j < 16; j++) {
                        if (botones[j] == botonPresionado) {
                            indice = j;
                            break;
                        }
                    }
                    	if (indice > 0 && botones[indice - 1].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice - 1].setText(textoActual);
                    }else if (indice < 15 && botones[indice + 1].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice + 1].setText(textoActual);
                    }else if (indice >=4 && botones[indice - 4].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice - 4].setText(textoActual);
                    }else if (indice <=11 && botones[indice + 4].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice + 4].setText(textoActual);
                    }
                }
            });
            panel.add(botones[i]);
        }
        this.add(panel1);
    }
    
    public boolean verificarGanador() {


        return false;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 JuegoNumeros puzzle=new JuegoNumeros();
	}
}
