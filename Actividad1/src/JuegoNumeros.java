import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class JuegoNumeros extends JFrame {
    boolean turno = false;
    private int count = 0;
    JButton[] botones = new JButton[16];
    JLabel reloj = new JLabel();
    Timer temporizador;
    int minutos=00;
    int segundosTranscurridos;
    JButton reiniciar=new JButton("Reiniciar");
    JButton reiniciarTablero=new JButton("Nuevo Juego");
    
    public JuegoNumeros() {
        this.setTitle("Puzzle Numeros");
        this.setSize(660, 690);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setMinimumSize(new java.awt.Dimension(250, 250));
        this.setMaximumSize(new java.awt.Dimension(600, 600));

        reloj.setText("                         Tiempo:0" + minutos + ":" + (segundosTranscurridos < 10 ? "0" + segundosTranscurridos : segundosTranscurridos));
        reloj.setFont(new Font("Arial", Font.BOLD, 32));
        this.iniciarComponentes();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
    	segundosTranscurridos = 0;
        temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosTranscurridos++;
                
                if(segundosTranscurridos>=60) {
                	minutos++;
                	segundosTranscurridos=0;
                }
                reloj.setText("                         Tiempo:0" + minutos + ":" + (segundosTranscurridos < 10 ? "0" + segundosTranscurridos : segundosTranscurridos));
                reloj.setFont(new Font("Arial", Font.BOLD, 32));
              }
        });
        temporizador.start();
        
        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(Color.black,4));
        panel1.setBackground(new Color(0, 102, 173));
        panel1.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel1.add(panel, BorderLayout.CENTER);
        
        JPanel marcoN=new JPanel();
        marcoN.setBackground(new Color(0, 102, 173));
        marcoN.setLayout(new BorderLayout());
        
        JLabel contador = new JLabel();
        contador.setText("    Movimientos: " + count);
        contador.setFont(new Font("Arial", Font.BOLD, 24));
        marcoN.add(reloj,BorderLayout.NORTH);
        marcoN.add(contador,BorderLayout.CENTER);
        
        JLabel fondo3=new JLabel("                                                                ");
        marcoN.add(fondo3,BorderLayout.EAST);
        JLabel fondo4=new JLabel("                                                                      ");
        marcoN.add(fondo4,BorderLayout.WEST);
        JPanel marcoNB=new JPanel();
        marcoNB.setBackground(new Color(0, 102, 173));
        marcoNB.setLayout(new GridLayout(1,3));
        
       
        JPanel sur=new JPanel();
        sur.setBackground(new Color(0, 102, 173));
        panel1.add(sur,BorderLayout.SOUTH);
        sur.setLayout(new GridLayout(1,5));
        
        JLabel fondo=new JLabel("");
        sur.add(fondo);
       
        List<String> numeros = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            numeros.add(String.valueOf(i));
        }
        numeros.add(""); 
        Collections.shuffle(numeros);
        
        
        
        reiniciarTablero.setFocusable(false);
        reiniciarTablero.setBorder(new LineBorder(new Color(0, 102, 173),2));
        reiniciarTablero.setFont(new Font("Arial", Font.BOLD, 12));
        sur.add(reiniciarTablero);
        reiniciarTablero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				segundosTranscurridos=-1;
				count=0;
		        contador.setText("    Movimientos: " + count);
		        Collections.shuffle(numeros);
		        for (int i=0;i<botones.length;i++) {
                    botones[i].setText(numeros.get(i).toString());
                }
		        minutos=0;
		        
			}});
        
        JButton pausa=new JButton("Pausa");
        pausa.setFocusable(false);
        pausa.setBorder(new LineBorder(new Color(0, 102, 173),2));
        pausa.setFont(new Font("Arial", Font.BOLD, 12));
        pausa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(temporizador.isRunning()) {
					 temporizador.stop();
				        pausa.setText("Reanudar");
				        desactivarBotones();
					
				}else {
					temporizador.start();
					pausa.setText("Pausa");
					activarBotones();
				}
			}
        	
        });
        sur.add(pausa);
        
        panel1.add(marcoN, BorderLayout.NORTH);

        JLabel marcoE=new JLabel("          ");
        panel1.add(marcoE, BorderLayout.EAST);

        JLabel marcoW=new JLabel("          ");
        panel1.add(marcoW, BorderLayout.WEST);
        
        
        
       
        
        
        panel.setLayout(new GridLayout(4, 4));
        panel.setSize(660, 660);
        panel.setBorder(new LineBorder(Color.black,4));
        panel.setBackground(new Color(192, 255, 248));
       
        
        reiniciar.setFocusable(false);
        reiniciar.setBorder(new LineBorder(new Color(0, 102, 173),3));
        sur.add(reiniciar);
        reiniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	Collections.shuffle(numeros);
            	for (int i=0;i<botones.length;i++) {
                    botones[i].setText(numeros.get(i).toString());
                }

            }

        });
        
        JLabel marcoSW=new JLabel("                        ");
        sur.add(marcoNB);
        
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
                    	if (indice % 4 != 0 && botones[indice - 1].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice - 1].setText(textoActual);
                        count++;
                    }else if (indice < 15 && botones[indice + 1].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice + 1].setText(textoActual);
                        count++;
                    }else if (indice >=4 && botones[indice - 4].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice - 4].setText(textoActual);
                        count++;
                    }else if (indice <=11 && botones[indice + 4].getText().isEmpty()) {
                        String textoActual = botonPresionado.getText();
                        botonPresionado.setText("");
                        botones[indice + 4].setText(textoActual);
                        count++;
                    }
                    	verificarGanador();
                        contador.setText("    Movimientos: " + count);
                    if(!verificarGanador()) {
                    	JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado", "Puzzle Resuelto", JOptionPane.INFORMATION_MESSAGE);
                    	temporizador.stop();
                    }
                }
            });
            panel.add(botones[i]);
        }
        this.add(panel1);
    }
    public void desactivarBotones() {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
            reiniciar.setEnabled(false);
            reiniciarTablero.setEnabled(false);
        }
        getContentPane().repaint();
        getContentPane().revalidate();
    }

    public void activarBotones() {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
            
        }
        reiniciar.setEnabled(true);
        reiniciarTablero.setEnabled(true);
        getContentPane().repaint();
        getContentPane().revalidate();
    }
    public boolean verificarGanador() {
    	for (int i = 0; i < 15; i++) {
    	    if (!botones[i].getText().equals(String.valueOf(i + 1))) {
    	        return true;
    	    }
    	}
    	
        return false;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 JuegoNumeros puzzle=new JuegoNumeros();
	}
}