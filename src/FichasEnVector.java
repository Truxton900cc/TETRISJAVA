
public interface FichasEnVector {
	
	final int[][] CajaDeFichas = 
			
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
	
	
	int[][] EspacioFicha2 = 
			
		{
			{1,1,1,1,3,2,1,0},  //  Checkear Abajo
			{0,1,-1,-1},		//  Checkear Izquierda
			{0,1,3,1}			//  Checkear Derecha
			
		};
	
	
	int[][] EspacioFicha3 =
			
		{
			{2,3,2,1},  	//  Checkear Abajo
			{0,1,2,1,0,0},	//  Checkear Izquierda	
			{0,1,2,3,3,2}	//  Checkear Derecha
		};
	
	
	final int[/*Ficha*/][/*Espacio*/][/*Valor De Espacio*/] CajaDeEspacios =
		{
			{	//Ficha 1
				{2,2,2,2,1,0}, //Checkear Abajo
				{0,1,-1,-1},   //Checkear Izquierda
				{0,1,3,1}	   //Checkear Derecha
			},
			{	//Ficha 2
				{1,1,1,1,3,2,1,0}, //Checkear Abajo
				{0,1,-1,-1},	   //Checkear Izquierda
				{0,1,3,1}		   //Checkear Derecha
			},
			{	//Ficha 3
				{2,3,2,1},		   //Checkear Abajo
				{0,1,2,1,0,0},	   //Checkear Izquierda
				{0,1,2,3,3,2}	   //Checkear Derecha
			},
			{
				{},
				{},
				{}
			},
			{
				{},
				{},
				{}
			}
		};
}
