import java.awt.event.KeyEvent;

public class Mecanismo implements FichasEnVector{

	public static void getMecanismo(int code) {
		
		switch(code) {
		
			case KeyEvent.VK_DOWN:
				
				System.out.println("ABAJO");
				
				int a=4;//numeroDeFicha
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.DesDibujar(fila+CajaDeFichas[a][i], columna+CajaDeFichas[a][7-i]);
				}
				
				int azulAbajo = 0;
				
				if(fila==8) {
					azulAbajo = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
				}
				else{
					azulAbajo = LaminaMatrix.matrix[fila+2][columna].getBackground().getBlue();
				}
				
				
				
				if(fila<8 && azulAbajo!=255) {
					
					fila++;
				}
				else {
					
					
					for(int i=0;i<=3;i++) {
						LaminaMatrix.Fijar(fila+CajaDeFichas[a][i], columna+CajaDeFichas[a][7-i]);
					}
					
					fila = 0;
					
				}
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.Dibujar(fila+CajaDeFichas[a][i], columna+CajaDeFichas[a][7-i]);
				}
				
				
				
				break;
				
			case KeyEvent.VK_LEFT:
				
				System.out.println("IZQUIERDA");
				
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
				
				System.out.println("DERECHA");
				
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
				
		}
		
	}
	
	static int fila    = 0;
	static int columna = 0;
	static int limite = 9;
}
