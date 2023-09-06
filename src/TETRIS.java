
public class TETRIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			reloj.start();
			gameOver.start();
			
		
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				MarcoPrincipal.CreateAndShowGUI();
				
			}
			
		});
		
	}
	
	public static void StopThreads() {
		try {
			reloj.wait();
			gameOver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void StartThreads() {
		
	
			System.out.println(reloj.getState());
			//gameOver.start();
		
		
	}
	
	static RelojDecente reloj = new RelojDecente();
	static GameOver gameOver = new GameOver();

}
