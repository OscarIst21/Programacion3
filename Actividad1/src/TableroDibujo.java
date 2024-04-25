import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

public class TableroDibujo extends JFrame implements KeyListener {

    private JPanel panel;
    private Color colorJugador = new Color(62, 182, 199);
    private Jugador jugador = new Jugador(45,40, 20, 20, colorJugador);
    private Jugador meta=new Jugador(315,315,20,20,Color.white);
    private Color colorObstaculo = new Color(104, 5, 2);
    private Jugador[] obstaculos;
    JLabel reloj = new JLabel();
    Timer temporizador,movimientoTimer;
    int minutos=00;
    int segundosTranscurridos;
    Sonido musicaFondo = new Sonido("src/musicaFondo.wav");
    int direccionActual=0;
    int choques=0;
    int sustos=0; 
    private boolean sonidoEncendido = true; 
    JPanel tablero;
	JLabel susto=new JLabel();
    public TableroDibujo() {
        setTitle("Laberinto loKo6666ñññ");
        setSize(665, 710);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(250, 250));
        setMaximumSize(new Dimension(600, 600));
        iniciarComponentes();
        setVisible(true);
        addKeyListener(this);
        reloj.setText("        Tiempo:0" + minutos + ":" + (segundosTranscurridos < 10 ? "0" + segundosTranscurridos : segundosTranscurridos));
        reloj.setFont(new Font("Arial", Font.BOLD, 18));
        reloj.setForeground(Color.white);
        if(sonidoEncendido==true) {
        	musicaFondo.bucle();
        	}
        else {
        	musicaFondo.stop();
        }
    }
    public void tiempo() {
    	segundosTranscurridos = 0;
        temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosTranscurridos++;
                if(segundosTranscurridos>=60) {
                	minutos++;
                	segundosTranscurridos=0;
                }
                reloj.setText("        Tiempo:0" + minutos + ":" + (segundosTranscurridos < 10 ? "0" + segundosTranscurridos : segundosTranscurridos));
                
            }
        });
        temporizador.start();
        movimientoTimer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverJugador();
            }
        });
        movimientoTimer.start();
    }
    public void iniciarComponentes() {
        generarObstaculos();
        panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(134, 153, 255));
        
        tiempo();
        tablero = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(colorObstaculo);
                for (Jugador obstaculo : obstaculos) {
                    g.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getW(), obstaculo.getH());
                }
                g.setColor(Color.black);
                for (int fila = -50; fila * 15 <= 700; fila++) {
                    for (int col = -50; col * 40 <= 700; col++) {
                        int x = col * 40;
                        int y = fila * 15;
                        if (fila % 2 == 1) {
                            x += 40 / 2;
                        }
                        if (col < 700 / 40) {
                            g.drawLine(x, y, x + 40, y);
                        }
                        if (fila < 700 / 15) {
                            g.drawLine(x, y, x, y + 15);
                        }
                    }
                }
                g.setColor(colorJugador);
                g.fillRect(jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH());

                g.setColor(new Color(208, 236, 0));
                g.fillRect(meta.getX()-5, meta.getY()-5, meta.getW()+10, meta.getH()+10);
                g.setColor(Color.white);
                g.fillRect(meta.getX(), meta.getY(), meta.getW(), meta.getH());
                	
                
            }
        };
        tablero.setBorder(new LineBorder(new Color(73, 73, 73), 10));
        tablero.setBackground(new Color(0, 0, 0));
        panel.add(tablero, BorderLayout.CENTER);
        JLabel espacio=new JLabel("           ");
        JPanel panelSonido=new JPanel();
        panelSonido.setLayout(new GridLayout(1, 3));
        panelSonido.add(espacio);
        ImageIcon iconoSonidoON = new ImageIcon(getClass().getResource("sonidoON.png"));
        JButton btnSonido = new JButton("");
        btnSonido.setIcon(iconoSonidoON);
        btnSonido.setFocusable(false);
        btnSonido.setBackground(new Color(73, 73, 73));
        btnSonido.setBorder(new LineBorder(new Color(73, 73, 73), 6));
        ImageIcon iconoSonidoOFF = new ImageIcon(getClass().getResource("sonidoOFF.png"));
        btnSonido.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
             if (sonidoEncendido==true) {
            	 musicaFondo.pause();
                 btnSonido.setIcon(iconoSonidoOFF);
             } else {
            	 musicaFondo.bucle();
                 btnSonido.setIcon(iconoSonidoON);
             }
             sonidoEncendido = !sonidoEncendido;
         }
     });
        panelSonido.add(btnSonido);
        JLabel espacio1=new JLabel("           ");
        panelSonido.add(espacio1);
        panelSonido.setBackground(new Color(73, 73, 73));
        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.setFocusable(false);
        reiniciar.setBackground(Color.red);
        reiniciar.setBorder(new LineBorder(new Color(73, 73, 73), 6));
        reiniciar.setForeground(Color.white);
        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugador.setX(45);
                jugador.setY(40);
                minutos=0;
                segundosTranscurridos=-1;
                repaint();
            }
        });
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new GridLayout(1, 3));
        botonesPanel.setBackground(new Color(73, 73, 73));
        botonesPanel.add(panelSonido);
        botonesPanel.add(reiniciar);
        botonesPanel.add(reloj);
        panel.add(botonesPanel, BorderLayout.SOUTH);

        this.repaint();
        this.add(panel);
    }

    private void generarObstaculos() {
    	obstaculos = new Jugador[]{
         new Jugador(70, 10, 705, 30, colorObstaculo), 
         new Jugador(610, 20, 30, 645, colorObstaculo), 
         new Jugador(0, 610, 705, 30, colorObstaculo),
         new Jugador(10, 10, 30, 645, colorObstaculo),
         new Jugador(70, 10, 30, 150, colorObstaculo),
         new Jugador(130, 10, 30, 85, colorObstaculo),
         new Jugador(130,  70, 60, 30, colorObstaculo),
         new Jugador(130, 135, 30, 55, colorObstaculo),
         new Jugador(190, 70, 30, 90, colorObstaculo),
         new Jugador(10, 190, 390, 30, colorObstaculo),//largo horizontal 
         new Jugador(250, 70, 30, 150, colorObstaculo),
         new Jugador(280, 70, 60, 30, colorObstaculo),
         new Jugador(310, 70, 30, 90, colorObstaculo),
         new Jugador(370, 70, 30, 90, colorObstaculo),
         new Jugador(370, 190, 30, 90, colorObstaculo),
         new Jugador(370, 280, 90, 30, colorObstaculo),
         new Jugador(430, 130, 30, 160, colorObstaculo),
         new Jugador(370, 70, 130, 30, colorObstaculo),
         new Jugador(550, 10, 30, 90, colorObstaculo),
         new Jugador(550, 130, 30, 130, colorObstaculo),
         new Jugador(0, 10, 130, 10, colorObstaculo),
         new Jugador(490, 250, 90, 30, colorObstaculo),
         new Jugador(460, 280, 60, 30, colorObstaculo),
         new Jugador(490, 280, 30, 90, colorObstaculo),
         new Jugador(550, 310, 30, 120, colorObstaculo),
         new Jugador(550, 340, 60, 30, colorObstaculo),
         new Jugador(70, 250, 90, 30, colorObstaculo),//Segundo horizontal
         new Jugador(190, 220, 30, 60, colorObstaculo),
         new Jugador(250, 250, 90, 30, colorObstaculo),
         new Jugador(10, 310, 90, 30, colorObstaculo),
         new Jugador(130, 310, 150, 30, colorObstaculo),
         new Jugador(130, 280, 30, 30, colorObstaculo),
         new Jugador(250, 280, 30, 30, colorObstaculo),
         new Jugador(190, 340, 30, 30, colorObstaculo),
         new Jugador(70, 370, 270, 30, colorObstaculo),
         new Jugador(70, 370, 30, 150, colorObstaculo),
         new Jugador(70, 550, 30, 60, colorObstaculo),
         new Jugador(70, 550, 90, 30, colorObstaculo),
         new Jugador(130, 430, 30, 120, colorObstaculo),
         new Jugador(130, 430, 150, 30, colorObstaculo),
         new Jugador(310, 370, 30, 210, colorObstaculo),
         new Jugador(370, 310, 30, 270, colorObstaculo),
         new Jugador(430, 340, 30, 90, colorObstaculo),
         new Jugador(340, 430, 30, 30, colorObstaculo),
         new Jugador(430, 400, 130, 30, colorObstaculo),
         new Jugador(400, 460, 180, 30, colorObstaculo),
         new Jugador(490, 520, 90, 30, colorObstaculo),
         new Jugador(490, 490, 30, 30, colorObstaculo),
         new Jugador(430, 520, 30, 90, colorObstaculo),
         new Jugador(490, 550, 30, 30, colorObstaculo),
         new Jugador(550, 580, 30, 30, colorObstaculo),
         new Jugador(250, 550, 30, 60, colorObstaculo),
         new Jugador(190, 490, 30, 90, colorObstaculo),
         new Jugador(190, 490, 130, 30, colorObstaculo),
         new Jugador(490, 10, 30, 210, colorObstaculo)
    	};
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }
    public void moverJugador() {
        int xA = jugador.getX();
        int yA = jugador.getY();

        switch (direccionActual) {
            case 1:
                jugador.setX(jugador.getX() - 10);
                break;
            case 2:
                jugador.setY(jugador.getY() - 10);
                break;
            case 3:
                jugador.setX(jugador.getX() + 10);
                break;
            case 4:
                jugador.setY(jugador.getY() + 10);
                break;
        }

        for (Jugador obstaculo : obstaculos) {
            if (jugador.getX() < obstaculo.getX() + obstaculo.getW() &&
                    jugador.getX() + jugador.getW() > obstaculo.getX() &&
                    jugador.getY() < obstaculo.getY() + obstaculo.getH() &&
                    jugador.getY() + jugador.getH() > obstaculo.getY()) {
            	
                jugador.setX(xA);
                jugador.setY(yA);
                choques++;
                //System.out.println(choques);
                int yactual=jugador.getY();
                if(choques>=20  &&sustos<2 && sonidoEncendido==true) {
                sustos++;
                susto.setBounds(0, 0, 700, 700);
                susto.setIcon(new ImageIcon(getClass().getResource("emojiMalo.jpg")));
                this.add(susto);
                getContentPane().repaint();
                panel.setVisible(false);
                susto.setVisible(true);
            	getContentPane().repaint();
                getContentPane().revalidate();
                direccionActual=0;
                musicaFondo.stop();
                musicaFondo.cambiarPista("src/grito.wav");
                musicaFondo.reproducir();
                Timer sonidoTimer = new Timer(2200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        direccionActual=0;
                        musicaFondo.cambiarPista("src/musicaFondo.wav");
                        System.out.println("El temporizador de sonido se activó"); 
                        ((Timer) e.getSource()).stop();
                    	susto.setVisible(false);
                        panel.setVisible(true);
                    	getContentPane().repaint();
                        getContentPane().revalidate();
                    }
                });

                direccionActual=0;
                sonidoTimer.start();
                choques = -10;
            }
                break;
            }
        }
        if (jugador.getX() < meta.getX() + meta.getW() &&
                jugador.getX() + jugador.getW() > meta.getX() &&
                jugador.getY() < meta.getY() + meta.getH() &&
                jugador.getY() + jugador.getH() > meta.getY()) {
        	ImageIcon iconoVictoria = new ImageIcon(getClass().getResource("personaje.jpg"));
        	musicaFondo.stop();
    	    temporizador.stop();
    	    sonidoEncendido =false;
    	    String tiempo= minutos + ":" + (segundosTranscurridos < 10 ? "0" + segundosTranscurridos : segundosTranscurridos)+" ";
    	    JOptionPane.showMessageDialog(this,"¡Ganaste!\n¡Felicidades por completar el laberinto!\nTardaste  "+tiempo+" en completarlo!", "Victoria",JOptionPane.INFORMATION_MESSAGE,iconoVictoria);
    	    if(sonidoEncendido==true) {
    	    		musicaFondo.bucle();
    	    }
    	    jugador.setX(45);
            jugador.setY(40);
            minutos=0;
            direccionActual=0;
            segundosTranscurridos=-1;
            musicaFondo.cambiarPista("src/musicaFondo.wav");
            musicaFondo.bucle();
    	    temporizador.start();
            repaint();
        }

        this.repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
            	direccionActual=1;
                break;
            case 38:
                direccionActual=2;
                break;
            case 39:
            	direccionActual=3;
                break;
            case 40:
            	direccionActual=4;
                break;
        }
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        TableroDibujo tablero = new TableroDibujo();
    }
}