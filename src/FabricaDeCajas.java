import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class FabricaDeCajas {

	public static JPanel FabricarCajas() {
		
		JPanel CajaCompleta = new JPanel();
		
		CajaCompleta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		
		CajaCompleta.setBackground(Color.WHITE);
		
		return CajaCompleta;
		
		
	}
	
}
