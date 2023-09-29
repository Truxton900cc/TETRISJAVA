import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class LaminaMatrix extends JPanel {

	public LaminaMatrix() {
		
		setLayout( new GridLayout(11,10));
		setPreferredSize(new Dimension(400,400));
		
		for(int i=0;i<11;i++) {
			
			for(int j=0;j<10;j++) {
				
				matrix[i][j] = FabricaDeCajas.FabricarCajas();
				
				matrix[i][j].setBackground(Color.black);
				matrix[i][j].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
				
				add(matrix[i][j]);
			}
			
		}
		
		for(int i = 0; i<10 ; i++) {
			
			matrix[10][i].setBackground(Color.blue);
			
		}
		
		
		miKeyAdapter = Controles.getControl();
		
		addKeyListener(miKeyAdapter);
		
		addKeyListener(Controles.getResetControl());
		
		setFocusable(true);
		requestFocus();
		
		nose = this;
		
	}
	
	public static void Dibujar(int fila, int columna) {
		
		matrix[fila][columna].setBackground(colorFicha);
		
	}
	public static void DesDibujar(int fila, int columna) {
		
		matrix[fila][columna].setBackground(Color.black);
		
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
	
	public static void setColor(int color) {
		
		colorFicha =  colores[color];
		
	}
	
	static JPanel matrix[][] = new JPanel[11][10];
	
	static JPanel nose = new JPanel();
	
	static KeyAdapter miKeyAdapter;
	 
	static Color colorFicha = Color.blue;
	
	static Color[] colores = {
			new Color(15,10,180), 
			new Color(150,10,1),
			new Color(15,180,1),
			new Color(200,100,1),
			new Color(210,200,1)
			} ;
	 
	
}
