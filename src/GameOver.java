import java.awt.Color;

import javax.swing.BorderFactory;

public class GameOver extends Thread {

	public void run() {
		
		try {
			
			Thread.sleep(900);
			
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("Checkear Casillas");
		
		while(true) {
			
			if(!gameOver){
				
				for(int i=9;i>=0;i--) {
					
					int contador = 0;
					
					for(int j=9;j>=0;j--) {
						
						
						//LaminaMatrix.matrix[j][i].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
						
						try {
							
							Thread.sleep(10);
							
						}catch(InterruptedException e) {
							
						}
						
						//LaminaMatrix.matrix[j][i].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
						
						int azul = LaminaMatrix.matrix[j][i].getBackground().getBlue();
						
						if(azul == 255) {
							
							contador++;
							
							if(contador == 10) {
								System.out.println("GAME OVER");
	
								RelojDecente.setEstado(false);
								LaminaMatrix.QuitarControl();
								
								gameOver = true;
								
							}
						}
						else {
							
							break;
							
						}
						
					}
				}
				
			}else {
				
				try {
					
					Thread.sleep(2000);
					
				}catch(InterruptedException e) {
					
				}
				
				System.out.println("Perdio Lok .l.");
			}
			
				
		}
		
		
		
		
	}
	
	
	public static boolean setGameOver(boolean stado) {
		
		gameOver = stado;
		
		return gameOver;
		
	}
	
	static boolean gameOver = false;
	
	
}
