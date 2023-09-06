import javax.swing.JFrame;

public class MarcoPrincipal {

	public MarcoPrincipal() {
		
	}
	
	public static void CreateAndShowGUI() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("TETRIS");
		
		frame.add(new LaminaPrincipal());
		
		frame.pack();
		
		frame.setVisible(true);
	}
	
	public static void RefreshGUI() {
		
		frame.pack();
		
	}
	
	static JFrame frame = new JFrame();
	
}
