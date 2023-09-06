import java.awt.event.KeyEvent;

public class RelojDecente extends Thread{
	
	public void run() {
		
		System.out.println("Reloj");
		
		while(true){
			
			if(estado == true){
				
				try {
					
					Thread.sleep(1000);
					
					Mecanismo.getMecanismo(KeyEvent.VK_DOWN);
					
				}catch(InterruptedException e) {
					
				}
				
			}
			else {
				
				try {
					
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					
				}
				
				System.out.println("Reinicielo Socio");
			}
			
		}
		
	}
	
	public static boolean setEstado(boolean OnOff) {
		
		estado = OnOff;
		
		return estado;
		
	}
	

	static int segundos 	= 0;
	static int minutos 		= 0;
	static int horas 		= 0;
	static boolean estado = true;
	static Thread miThread;
}
