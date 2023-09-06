import java.awt.event.KeyEvent;

public class Mecanismo {

	public static void getMecanismo(int code) {
		
		switch(code) {
		
			case KeyEvent.VK_DOWN:
				
				System.out.println("Abajo");
				
				LaminaMatrix.DesDibujar(fila,columna);
				
				int azulAbajo = 0;
				
				if(fila==9) {
					azulAbajo = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
				}
				else{
					azulAbajo = LaminaMatrix.matrix[fila+1][columna].getBackground().getBlue();
				}
				
				
				
				if(fila<9 && azulAbajo!=255) {
					
					fila++;
				}
				else {
					LaminaMatrix.Fijar(fila,columna);
					
					fila = 0;
					
				}
				
				LaminaMatrix.Dibujar(fila, columna);
				
				break;
				
			case KeyEvent.VK_LEFT:
				
				System.out.println("Izquierda");
				
				int azulIzquierda=0;
				
				if(columna == 0) {
					
					azulIzquierda = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
				}
				else {
					
					azulIzquierda = LaminaMatrix.matrix[fila][columna-1].getBackground().getBlue();
				}
				
				
				if(columna>0 && azulIzquierda!=255) {
					
					LaminaMatrix.DesDibujar(fila,columna);
					
					columna--;
					
					LaminaMatrix.Dibujar(fila, columna);
					
				}
				
				
				break;
				
			case KeyEvent.VK_RIGHT:
				
				System.out.println("Derecha");
				
				int azulDerecha=0;
				
				if(columna == 9) {
					azulDerecha = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
				}
				else {
					azulDerecha = LaminaMatrix.matrix[fila][columna+1].getBackground().getBlue();
				}
				
				if(columna<9 && azulDerecha != 255) {
					
					LaminaMatrix.DesDibujar(fila,columna);
					
					columna++;
					
					LaminaMatrix.Dibujar(fila, columna);
					
				}
				
				break;
				
			case KeyEvent.VK_P:
				
				LaminaMatrix.Reiniciar();
				
				break;
		
		}
		
	}
	
	static int fila    = 0;
	static int columna = 0;
	static int limite = 9;
}
