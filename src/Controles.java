import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controles {

	public static KeyAdapter getControl() {
		
		KeyAdapter myKeyAdapter = new KeyAdapter() {
		
			public void keyPressed(KeyEvent e) {
				
				Mecanismo.getMecanismo(e.getExtendedKeyCode());
				
			}
			
		};
			
		
		return myKeyAdapter;
	}
	
	public static KeyAdapter getResetControl() {
		
		KeyAdapter myKeyAdapter = new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				
				if(e.getExtendedKeyCode() == KeyEvent.VK_P) {
					
					LaminaMatrix.Reiniciar();
				}
				
			}
			
		};
			
		
		return myKeyAdapter;
		
	}
	
}
