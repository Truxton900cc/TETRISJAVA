
public class TETRIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				MarcoPrincipal.CreateAndShowGUI();
				
			}
			
			});
			
			//reloj.start();
			//gameOver.start();
		
	}
	
	
	static RelojDecente reloj = new RelojDecente();
	static GameOver gameOver = new GameOver();

}
