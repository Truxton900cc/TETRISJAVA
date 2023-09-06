import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class LaminaMatrix extends JPanel {

	public LaminaMatrix() {
		
		setLayout( new GridLayout(10,10));
		setPreferredSize(new Dimension(400,400));
		
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				
				matrix[i][j] = FabricaDeCajas.FabricarCajas();
				
				matrix[i][j].setBackground(Color.black);
				matrix[i][j].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
				
				add(matrix[i][j]);
			}
			
		}
		
		miKeyAdapter = Controles.getControl();
		
		addKeyListener(miKeyAdapter);
		
		addKeyListener(Controles.getResetControl());
		
		setFocusable(true);
		requestFocus();
		
		nose = this;
		
	}
	
	public static void Dibujar(int fila, int columna) {
		
		matrix[fila][columna].setBackground(Color.blue);
		

	}
	public static void DesDibujar(int fila, int columna) {
		
		matrix[fila][columna].setBackground(Color.black);
		
	}
	
	public static void Fijar(int fila, int columna) {
		
		matrix[fila][columna].setBackground(Color.blue);

	}
	
	public static void Reiniciar() {
		
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				
				matrix[i][j].setBackground(Color.black);
				matrix[i][j].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
				}
		}
		
		
	}
	
	public static void QuitarControl() {
		
		nose.removeKeyListener(miKeyAdapter);
		
	}
	
	
	public static void DarControl() {
		
		nose.addKeyListener(miKeyAdapter);
		
	}
	
	static JPanel matrix[][] = new JPanel[10][10];
	
	static JPanel nose = new JPanel();
	
	static KeyAdapter miKeyAdapter;
	
}
