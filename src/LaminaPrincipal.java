import java.awt.BorderLayout;

import javax.swing.JPanel;

public class LaminaPrincipal extends JPanel{

	public LaminaPrincipal() {
		
		setLayout(new BorderLayout());
		
		add(new LaminaMatrix(),BorderLayout.CENTER);
		
	}
	
}
