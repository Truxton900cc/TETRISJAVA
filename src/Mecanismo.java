import java.awt.event.KeyEvent;

public class Mecanismo implements FichasEnVector{

	public static void getMecanismo(int code) {
		
			
		switch(code) {
		
			case KeyEvent.VK_DOWN:
				
				System.out.println("ABAJO");
				
				//int a=0;//numeroDeFicha
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.DesDibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
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
						LaminaMatrix.Fijar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
					}
					
					fila = 0;
					numeroFicha = (int) (Math.random()*4);	
					
				}
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.Dibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
				}
				
				
				
				break;
				
			case KeyEvent.VK_LEFT:
				
				System.out.println("IZQUIERDA");
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.DesDibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
				}
				
				int azulLeft = 0;
				
				if(columna==0) {
					azulLeft = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
				}
				else{
					azulLeft = LaminaMatrix.matrix[fila][columna-1].getBackground().getBlue();
				}
				
				if(columna>0 && azulLeft != 255) {
					
					columna--;
				}
				
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.Dibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
				}
				
				break;
				
			case KeyEvent.VK_RIGHT:
				
				System.out.println("DERECHA");
				
				//int c=0;//numeroDeFicha
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.DesDibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
				}
				
				int azulRight = 0;
				
				if(columna==8) {
					azulRight = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
				}
				else{
					azulRight = LaminaMatrix.matrix[fila][columna+1].getBackground().getBlue();
				}
				
				if(columna<7 && azulRight != 255) {
					
					columna++;
				}
				
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.Dibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
				}
				
				break;
				
		}
		
	}
	
	static int fila    = 0;
	static int columna = 0;
	static int limite = 9;
	static int numeroFicha =0;
}
