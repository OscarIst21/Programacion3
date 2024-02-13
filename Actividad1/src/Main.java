import javax.swing.JFrame;
public class Main extends JFrame{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello word!");
		Main ventana=new Main();
		ventana.setVisible(true);
		ventana.setSize(300, 300);
		ventana.setLocation(120, 120);
		
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
