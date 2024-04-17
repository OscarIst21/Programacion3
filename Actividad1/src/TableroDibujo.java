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
    int x=260;
    int y=310;
    public TableroDibujo() {
        setTitle("Tablero de Dibujo");
        setSize(560, 720);
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
                g.setColor(new Color(28, 184, 28));
                g.fillRect(x, y, 40, 40);
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
				 x=260;
			     y=310;
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
        System.out.println("Tecla Presionada: " + e.getKeyCode());
        switch(e.getKeyCode()) {
        case 37:
        	x-=10;
        	break;
        case 38:
        	y-=10;
            break;
        case 39:
        	x+=10;
            break;
        case 40:
        	y+=10;
            break;
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
