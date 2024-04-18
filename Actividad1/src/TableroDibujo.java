import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TableroDibujo extends JFrame implements KeyListener {

    private JPanel panel;
    Color colorJugador=new Color(28, 184, 28);
    Jugador jugador=new Jugador(260,310,40,40,colorJugador);
    Color colorObstaculo=new Color(207, 37, 37);

    Jugador obstaculo=new Jugador(150,120,80,50,colorJugador);
    public TableroDibujo() {
        setTitle("Tablero de Dibujo");
        setSize(560, 720);
		this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(250, 250));
        setMaximumSize(new Dimension(600, 600));
        iniciarComponentes();
        setVisible(true);
        addKeyListener(this);
    }

    public void iniciarComponentes() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(134, 153, 255));

        JPanel tablero = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
           
                g.setColor(colorJugador);
                g.fillRect(jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH());
                
                g.setColor(colorObstaculo);
                g.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getW(), obstaculo.getH());
            
            }
        };
        tablero.setBorder(new LineBorder(new Color(23, 36, 108),10));
        tablero.setBackground(new Color(0, 0, 0));
        panel.add(tablero, BorderLayout.CENTER);

        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.setFocusable(false);
        reiniciar.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    obstaculo.setX((int)Math.floor(Math.random()*500+1));
			    obstaculo.setY((int)Math.floor(Math.random()*600+1));
			    obstaculo.setW((int)Math.floor(Math.random()*50+30));
			    obstaculo.setH((int)Math.floor(Math.random()*40+20));
			    repaint();
			}
        	
		});
        JPanel botonesPanel = new JPanel();
        botonesPanel.setBackground(new Color(23, 36, 108));
        botonesPanel.add(reiniciar);
        
        panel.add(botonesPanel, BorderLayout.SOUTH);

        this.add(panel);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("Tecla Presionada: " + e.getKeyCode());
    	
    	switch(e.getKeyCode()) {
        case 37:
        	jugador.setX(jugador.getX()-10);
        	break;
        case 38:
        	jugador.setY(jugador.getY()-10);
            break;
        case 39:
        	jugador.setX(jugador.getX()+10);
            break;
        case 40:
        	jugador.setY(jugador.getY()+10);
            break;
        }
        if (jugador.getX() < obstaculo.getX() + obstaculo.getW() &&
                jugador.getX() + jugador.getW() > obstaculo.getX() &&
                jugador.getY() < obstaculo.getY() + obstaculo.getH() &&
                jugador.getY() + jugador.getH() > obstaculo.getY()) {
        		System.out.println("colision");
            	
        }	
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        TableroDibujo tablero=new TableroDibujo();
    }
}
