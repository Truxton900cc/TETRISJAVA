import java.awt.Color;

import javax.swing.BorderFactory;

public class GameOver extends Thread {

	public void run() {
		
		try {
			
			Thread.sleep(900);
			
		}catch(InterruptedException e) {
			
		}
		
		while(gameOver) {
			
			for(int i=9;i>=0;i--) {
				
				int contador = 0;
				
				for(int j=9;j>=0;j--) {
					
					
					LaminaMatrix.matrix[j][i].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
					
					try {
						
						Thread.sleep(10);
						
					}catch(InterruptedException e) {
						
					}
					
					LaminaMatrix.matrix[j][i].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
					
					int azul = LaminaMatrix.matrix[j][i].getBackground().getBlue();
					
					if(azul == 255) {
						
						contador++;
						
						if(contador == 10) {
							System.out.println("GAME OVER");

							RelojDecente.estado = false;
							gameOver = false;
							LaminaMatrix.QuitarControl();
							
						}
					}
					else {
						
						break;
						
					}
					
				}
			}
		}
		
		
		
		
	}
	
	public static void setGameOver(boolean a) {
		
		gameOver = a;
		
	}
	
	static boolean gameOver = true;
	
}
