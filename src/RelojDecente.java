import java.awt.event.KeyEvent;

public class RelojDecente extends Thread{
	
	public void run() {
		
		while(estado) {
			
			try {
				
				Thread.sleep(1000);
				
				Mecanismo.getMecanismo(KeyEvent.VK_DOWN);
				
			}catch(InterruptedException e) {
				
			}
			
		}
		
	}
	
	public boolean OnOff(boolean e) {
		
		estado = e;
		
		return estado;
	}

	static int segundos 	= 0;
	static int minutos 		= 0;
	static int horas 		= 0;
	static boolean estado = true;
}
