
public interface FichasEnVector {
	
	final int[][] CajaDeFichas = 
			
		{	{0,1,1,1,2,1,0,0},
			{0,0,0,0,3,2,1,0},
			{0,1,1,2,1,1,0,0},
			{0,0,1,1,1,0,1,0},
			{0,0,0,1,1,2,1,0} 	};
	
	final int[/*Ficha*/][/*Espacio*/][/*Valor De Espacio*/] CajaDeEspacios =
		{
			{	//Ficha 0
				{2,2,2,2,1,0}, //Checkear Abajo		[]
				{0,1,-1,-1},   //Checkear Izquierda	[][][]
				{0,1,3,1}	   //Checkear Derecha
			},
			{	//Ficha 1
				{1,1,1,1,3,2,1,0}, //Checkear Abajo [][][][]
				{0,-1},	   //Checkear Izquierda
				{0,4}		   //Checkear Derecha
			},
			{	//Ficha 2
				{2,3,1,0},		   //Checkear Abajo 	[]
				{0,1,2,0,-1,-1},   //Checkear Izquierda	[][]
				{0,1,2,2,2,1}	   //Checkear Derecha	  []
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
