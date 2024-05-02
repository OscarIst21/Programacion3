import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Sonido {
	private static ImageIcon sonidoOriginal;
	private static ImageIcon sonidoOriginal2;
	private static JCheckBox botonSonido;
    private static Clip audioClip;
    private static AudioInputStream audioStream;
    private static boolean pausado = false;
    private static long posicionActual = 0; // Posición en milisegundos
    //clip method
    public Sonido(String ruta) {
    	// Crear un AudioInputStream desde un archivo de sonido dado
        File audio = new File(ruta);
        try {
            audioStream = AudioSystem.getAudioInputStream(audio);
        }
        catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }

        // Obtener el formato de audio y crear un objeto DataLine.Info
        AudioFormat format = audioStream.getFormat();
        var info = new DataLine.Info(Clip.class, format);

        //Obtener the Clip
        try {
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        }
        catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
        
        sonidoOriginal = new ImageIcon("sonido.png");
        Image sonidoImage = sonidoOriginal.getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH);
        sonidoOriginal = new ImageIcon(sonidoImage);

        sonidoOriginal2 = new ImageIcon("sinSonido.png");
        Image sinSonido = sonidoOriginal2.getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH);
        sonidoOriginal2 = new ImageIcon(sinSonido);
    }

    public static void reproducir() {
        new Thread( () -> {
        	// Configurar el volumen (0.0f - 1.0f)
            FloatControl gainControl = (FloatControl) audioClip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(1.0f);
            audioClip.setFramePosition(0);
            audioClip.start();
            pausado=false;
        }){}.start();
    }

    public static void pause()
    {
    	if(audioClip.isRunning()) {
    		posicionActual=audioClip.getMicrosecondPosition();
    		audioClip.stop();
    		pausado=true;
    		
        }
    	
    }
    
    public static void reanudar()
    {
    	if(pausado) {
    		audioClip.setMicrosecondPosition(posicionActual);
    		audioClip.start();
    		pausado=false;
    	}	
    }
    
    public static void reanudarBucle()
    {
    	if(pausado) {
    		audioClip.setMicrosecondPosition(posicionActual);
    		audioClip.loop(Clip.LOOP_CONTINUOUSLY);
    		pausado=false;
    	}	
    }
    
    public static void bucle() { //Repetir el audio 
        new Thread( () -> {
            audioClip.setFramePosition(0);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);
        }){}.start();
    }

    public static void stop() {
        audioClip.stop();
    }
    
    public static void cambiarPista(String nuevaRuta) {
        pause();

        try {
            audioStream = AudioSystem.getAudioInputStream(new File(nuevaRuta));
            audioClip.close(); 
            audioClip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
        bucle();
    }
    
    public static JCheckBox crearBotonSonido() 
	{
		botonSonido = new JCheckBox ();
        botonSonido.setSelected (true);
        botonSonido.setIcon(sonidoOriginal);
        botonSonido.setOpaque(false);
        
        botonSonido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonSonido.isSelected()) {
                	reanudarBucle();
                	botonSonido.setIcon(sonidoOriginal);

                } else {
                	pause();
                    botonSonido.setIcon(sonidoOriginal2);
                } 
                botonSonido.getParent().revalidate();
                botonSonido.getParent().repaint();
            }
        });

        return botonSonido;
	}
    
    public static JCheckBox actualizarBoton()
    {
    	if (pausado==true) {
            botonSonido.setIcon(sonidoOriginal2);
    	} else if (pausado==false) {

            botonSonido.setIcon(sonidoOriginal);
    	}
    		
    	return botonSonido;
    }
}