
public interface FichasEnVector {
	
	int[][] CajaDeFichas = 
			
		{	{0,1,1,1,2,1,0,0},
			{0,0,0,0,3,2,1,0},
			{0,1,1,2,1,1,0,0},
			{0,0,1,1,1,0,1,0},
			{0,0,0,1,1,2,1,0} 	};
	
	int[][] EspacioFicha1 = 
		
		{
			{2,2,2,2,1,0},  //  Checkear Abajo
			{0,1,-1,-1},	//  Checkear Izquierda
			{0,1,3,1}		//  Checkear Derecha
			
		};
}
