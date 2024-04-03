import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoGato extends JFrame {
    boolean turno = false;
    JButton[] botones = new JButton[9];
    static int x = 0;
    static int o = 0;
    String ganador = "hola";
    JLabel text;
    JLabel logo = new JLabel();

    public JuegoGato() {
        this.setTitle("Juego del gato");
        this.setSize(560, 590);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setMinimumSize(new java.awt.Dimension(250, 250));
        this.setMaximumSize(new java.awt.Dimension(600, 600));

        this.iniciarComponentes();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        text = new JLabel("X: " + x + "            O: " + o, 0);
        text.setFont(new Font("Arial", Font.BOLD, 28));
        panel1.add(text, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel1.add(panel, BorderLayout.CENTER);

        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.setFocusable(false);
        reiniciar.setSize(50, 40);
        panel1.add(reiniciar, BorderLayout.SOUTH);
        reiniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton boton : botones) {
                    boton.setIcon(null);
                    boton.setText("");
                }
                turno = false;
                ganador = "";
                actualizarContador();
                panel.repaint();
                panel.revalidate();

            }

        });
        panel.setLayout(new GridLayout(3, 3));
        panel.setSize(560, 560);
        panel.setLocation(0, 0);
        panel.setBackground(new Color(192, 255, 248));

        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("");
            botones[i].setFocusable(false);
            botones[i].setBackground(new Color(79, 183, 255));
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton botonPresionado = (JButton) e.getSource();
                    botonPresionado.setFont(new Font("Arial", Font.BOLD, 32));
                    if (botonPresionado.getText().equals("")) {
                        if (turno) {
                            //botonPresionado.setIcon(new ImageIcon(getClass().getResource("o.jpg")));
                            botonPresionado.setForeground(Color.black);
                            botonPresionado.setText("O");
                            botonPresionado.setFont(new Font("Arial", Font.BOLD, 28));
                            ganador = "O";
                          
                            actualizarContador();
                            panel1.repaint();
                            panel1.revalidate();
                        } else {
                            //botonPresionado.setIcon(new ImageIcon(getClass().getResource("x.jpg")));
                            botonPresionado.setForeground(Color.RED);
                            botonPresionado.setText("X");
                            ganador = "X";
                        
                            actualizarContador();
                            panel1.repaint();
                            panel1.revalidate();
                        }
                        turno = !turno;
                        if (verificarGanador() != false) {
                            JOptionPane.showMessageDialog(null, "El ganador es " + ganador, "Ganador ",
                            JOptionPane.WARNING_MESSAGE);
                           if(turno==false) {
                        	   o++;
                           }else 
                           {
                        	   x++;
                           }
                            for (JButton boton : botones) {
                                boton.setText("");
                                boton.setIcon(null);
                            }
                            turno = false;
                            ganador = "";
                            actualizarContador();
                            panel.repaint();
                            panel.revalidate();

                        }
                        boolean reiniciar = true;
                        for (JButton boton : botones) {
                            if (boton.getText().isEmpty()) {
                                reiniciar = false;
                            }

                        }

                        if (reiniciar) {
                            for (JButton boton : botones) {
                                boton.setIcon(null);
                                boton.setText("");
                            }
                            turno = false;
                            ganador = "";
                            panel.repaint();
                            panel.revalidate();
                        }
                    }
                }
            });
            panel.add(botones[i]);
        }
        this.add(panel1);
    }

    public void actualizarContador() {
        text.setText("X: " + x + "            O: " + o);
    }

    public boolean verificarGanador() {

        for (int i = 0; i < 3; i++) {
            if (!botones[i * 3].getText().isEmpty() && botones[i * 3].getText().equals(botones[i * 3 + 1].getText())
                    && botones[i * 3].getText().equals(botones[i * 3 + 2].getText())) {
            	
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!botones[i].getText().isEmpty() && botones[i].getText().equals(botones[i + 3].getText())
                    && botones[i].getText().equals(botones[i + 6].getText())) {
            	
            	return true;
                
            }
        }
        if (!botones[0].getText().isEmpty() && botones[0].getText().equals(botones[4].getText())
                && botones[0].getText().equals(botones[8].getText())) {
        	
            return true;
        }
        if (!botones[2].getText().isEmpty() && botones[2].getText().equals(botones[4].getText())
                && botones[2].getText().equals(botones[6].getText())) {
        	
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 //JuegoGato JuegoGato=new JuegoGato();
	}
}
