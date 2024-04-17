import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TableroDibujo extends JFrame implements KeyListener {

    private JPanel panel;

    public TableroDibujo() {
        setTitle("Tablero de Dibujo");
        setSize(560, 720);
        setLocationRelativeTo(null);
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
                g.setColor(Color.RED);
                g.fillRect(0, 0, 560, 660);
            }
        };
        panel.add(tablero, BorderLayout.CENTER);

        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.setFocusable(false);
        JPanel botonesPanel = new JPanel();
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
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        TableroDibujo tablero=new TableroDibujo();
    }
}
