import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;

public class Mecanismo implements FichasEnVector{

	public static void getMecanismo(int code) {
		
			
		switch(code) {
		
			case KeyEvent.VK_DOWN:
				
				System.out.println("ABAJO");
				
				for(int i=0;i<=3;i++) {
					LaminaMatrix.DesDibujar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
				}
				
				int azulAbajo = 0;
				
				int F = 0;
				
				if(fila==8 ) {
					
					azulAbajo = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
					azulAbajo += LaminaMatrix.matrix[fila][columna].getBackground().getGreen();
					azulAbajo += LaminaMatrix.matrix[fila][columna].getBackground().getRed();
				}
				else{
					
					for(int i =0;i<=3;i++) {
						
						F+=LaminaMatrix.matrix[fila+CajaDeEspacios[numeroFicha][0][i]][columna+CajaDeEspacios[numeroFicha][0][checkearAbajo-i]].getBackground().getBlue();
						
					}
				}
				
				System.out.println(azulAbajo);
				
				if(fila<=limiteInferior && azulAbajo==0 && F == 0) {
					
					System.out.println("fila antes de sumar: "+fila);
					fila++;
					System.out.println("fila despues de sumar: "+fila);
				}
				else {
					
					
					for(int i=0;i<=3;i++) {
						LaminaMatrix.Fijar(fila+CajaDeFichas[numeroFicha][i], columna+CajaDeFichas[numeroFicha][7-i]);
					}
					
					fila = 0;
					//numeroFicha = (int) (Math.random()*4);	
					//LaminaMatrix.setColor(numeroFicha);
					
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
				
				int J = 0;
				
				if(columna == 0) {
					
					azulLeft = LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
					azulLeft += LaminaMatrix.matrix[fila][columna].getBackground().getGreen();
					azulLeft += LaminaMatrix.matrix[fila][columna].getBackground().getRed();
					
				}else {
					
					for(int i = 0;i<=1;i++) {
						
						J+=LaminaMatrix.matrix[fila+EspacioFicha1[1][i]][columna+EspacioFicha1[1][3-i]].getBackground().getBlue();
	
						System.out.println(columna);
					}
					
				}
				
				if(columna>0 && azulLeft != 255 && J==0) {
					
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
				int E = 0;
				
				if(columna==8) {
					azulRight =  LaminaMatrix.matrix[fila][columna].getBackground().getBlue();
					azulRight += LaminaMatrix.matrix[fila][columna].getBackground().getGreen();
					azulRight += LaminaMatrix.matrix[fila][columna].getBackground().getRed();
				}
				else{
					azulRight = LaminaMatrix.matrix[fila][columna+1].getBackground().getBlue();
					
						for(int i = 0;i<=1;i++) {
						
							try {
								E+=LaminaMatrix.matrix[fila+EspacioFicha1[2][i]][columna+EspacioFicha1[2][3-i]].getBackground().getBlue();
								LaminaMatrix.matrix[fila+EspacioFicha1[2][i]][columna+EspacioFicha1[2][3-i]].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
							}catch(ArrayIndexOutOfBoundsException e) {
								
							}
							
							
		
							System.out.println(columna);
					}
				}
				
				if(columna<7 && azulRight != 255 && E==0) {
					
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
	static int numeroFicha    = 1;
	static int checkearAbajo  = 7;
	static int limiteInferior = 9;
}
