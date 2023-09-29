import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;

public class Mecanismo implements FichasEnVector{

	public static void getMecanismo(int code) {
		
			
		switch(code) {
		
			case KeyEvent.VK_DOWN:
				
				System.out.println("ABAJO");
				
				boolean EspaciAbajo = false;
				
				
				
				EspaciAbajo = VerificarEspacio(fila, columna, verificar, ficha, indice, limiteInf);
				
				if(EspaciAbajo == true) {
					
					Borrar(fila,columna,ficha);
					
					fila++;
					
					Dibujar(fila,columna,ficha);
					
				}
				else {
					
					Fijar(fila,columna,ficha);
					CambiarFicha();
						
				}
				
				break;
				
			case KeyEvent.VK_LEFT:
				
				System.out.println("IZQUIERDA");
	
				boolean EspacioIzquierda = false;
				
				EspacioIzquierda = VerificarIzquierda(fila, columna, verificarIzq, ficha, indiceIzq, limiteIzq);
				
				if(columna>limiteIzq && EspacioIzquierda) {
					
					Borrar(fila,columna,ficha);
					
					columna--;
					
					Dibujar(fila,columna,ficha);
					
					System.out.println(columna);
					
				}
				
				break;
				
			case KeyEvent.VK_RIGHT:
				
				System.out.println("DERECHA");
				
				
				boolean EspacioDerecha = false;
				
				EspacioDerecha = VerificarDerecha(fila, columna, verificarDer, ficha, indiceDer, limiteDer);
				
				if(limiteDer>columna && EspacioDerecha == true) {
					
					Borrar(fila,columna,ficha);
					
					columna++;
					
					Dibujar(fila,columna,ficha);
					
					System.out.println(columna);
				}
				
				break;		
		}
	
	}
	
	public static void Borrar(int Fila, int Columna, int ficha) {
		
		for(int i = 0; i<=3 ; i++ ) {
			
			LaminaMatrix.DesDibujar( Fila + CajaDeFichas[ficha][i] , Columna + CajaDeFichas[ficha][7-i]);
			
		}
		
	}
	
	public static boolean VerificarEspacio(int Fila, int Columna, int Verificaciones , int Ficha, int posiciones, int limite) {
		
		boolean espacio = false ;
		
		int color = 0;
		
		if(Fila != limite ) {
			
			for(int i = 0; i <= Verificaciones; i++) {
				
				color += LaminaMatrix.matrix[ Fila + CajaDeEspacios[Ficha] [0] [i]  ][ Columna + CajaDeEspacios[Ficha] [0] [posiciones-i] ].getBackground().getBlue();
				System.out.println(color);
			}
			
		}
		
		if(Fila != limite && color == 0)
		{
			espacio = true;
		}
		else {
			
			espacio = false;
			
		
		}
		
		return espacio;
	}
	
	public static boolean VerificarIzquierda(int Fila, int Columna, int Verificaciones , int Ficha, int posiciones, int limite) {
		
		boolean espacio = false;
		
		int color = 0;
		
		if(Columna != limite ) {
			
			for(int i = 0; i <= Verificaciones; i++) {
				
				color += LaminaMatrix.matrix[ Fila + CajaDeEspacios[Ficha] [1] [i]  ][ Columna + CajaDeEspacios[Ficha] [1] [posiciones-i] ].getBackground().getBlue();
				System.out.println(color);
			}
			
			if(color == 0)
			{
				espacio = true;
			}
			else {
				
				espacio = false;
			
			}
		}
		
		return  espacio;
		
	}
	
	public static boolean VerificarDerecha(int Fila, int Columna, int Verificaciones , int Ficha, int posiciones, int limite) {
		
		boolean espacio = false;
		
		int color = 0;
		
		if(Columna != limite ) {
			
			for(int i = 0; i <= Verificaciones; i++) {
				
				color += LaminaMatrix.matrix[ Fila + CajaDeEspacios[Ficha] [2] [i]  ][ Columna + CajaDeEspacios[Ficha] [2] [posiciones-i] ].getBackground().getBlue();
				System.out.println(color);
			}
			
			if(color == 0)
			{
				espacio = true;
			}
			else {
				
				espacio = false;
			
			}
		}
		
		return  espacio;
		
	}

	
	public static void Dibujar(int Fila, int Columna, int ficha) {
		
		for(int i = 0; i<=3 ; i++ ) {
			
			LaminaMatrix.Dibujar( Fila + CajaDeFichas[ficha][i] , Columna + CajaDeFichas[ficha][7-i]);
			
		}
		
	}
	
	public static void Fijar(int Fila, int Columna, int ficha) {
		
		for(int i = 0; i<=3 ; i++ ) {
			
			LaminaMatrix.Dibujar( Fila + CajaDeFichas[ficha][i] , Columna + CajaDeFichas[ficha][7-i]);
			
		}
	
		fila = 0;
		columna = 0;
	}
	
	public static void CambiarFicha() {
		
		ficha = (int) (Math.random()*4 + 0);
		
		LaminaMatrix.setColor(ficha);
		
		
		switch(ficha) {
		
			case 0:
				
				fila    		= 0;
				columna 		= 0;
				ficha   		= 0;
				verificar    	= 2;
				indice			= 5;
				limiteInf   	= 8;
				
				//Verificar Izquierda
				verificarIzq 	= 1;
				indiceIzq    	= 3;
				limiteIzq    	= 0;
				
				//Verifica Derecha
				verificarDer 	= 1;
				indiceDer    	= 3;
				limiteDer    	= 7;
				
				break;
		
			case 1:
				
				fila    		= 0;
				columna 		= 0;
				ficha   		= 1;
				verificar    	= 3;
				indice			= 7;
				limiteInf   	= 9;
				
				//Verificar Izquierda
				verificarIzq 	= 0;
				indiceIzq    	= 1;
				limiteIzq    	= 0;
				
				//Verifica Derecha
				verificarDer 	= 0;
				indiceDer    	= 1;
				limiteDer    	= 6;
				
				break;
				
			case 2:
				
				fila    		= 0;
				columna 		= 0;
				ficha   		= 2;
				verificar    	= 1;
				indice			= 3;
				limiteInf   	= 7;
				
				//Verificar Izquierda
				verificarIzq 	= 2;
				indiceIzq    	= 5;
				limiteIzq    	= 0;
				
				//Verifica Derecha
				verificarDer 	= 2;
				indiceDer    	= 5;
				limiteDer    	= 8;
				
				break;
				
			case 3:
				
				fila    		= 0;
				columna 		= 0;
				ficha   		= 3;
				verificar    	= 1;
				indice			= 3;
				limiteInf   	= 8;
				
				//Verificar Izquierda
				verificarIzq 	= 1;
				indiceIzq    	= 3;
				limiteIzq    	= 0;
				
				//Verifica Derecha
				verificarDer 	= 1;
				indiceDer    	= 3;
				limiteDer    	= 8;
				
				break;
				
			case 4:
				
				fila    		= 0;
				columna 		= 0;
				ficha   		= 4;
				verificar    	= 2;
				indice			= 5;
				limiteInf   	= 8;
				
				//Verificar Izquierda
				verificarIzq 	= 1;
				indiceIzq    	= 3;
				limiteIzq    	= 0;
				
				//Verifica Derecha
				verificarDer 	= 1;
				indiceDer    	= 3;
				limiteDer    	= 7;
				
				break;
			
			default:
				break;
		}
		
	}
	
	static int fila    		= 0;
	static int columna 		= 0;
	static int ficha   		= 4;
	static int verificar    = 2;
	static int indice		= 5;
	static int limiteInf    = 8;
	
	//Verificar Izquierda
	static int verificarIzq = 1;
	static int indiceIzq    = 3;
	static int limiteIzq    = 0;
	
	//Verifica Derecha
	static int verificarDer = 1;
	static int indiceDer    = 3;
	static int limiteDer    = 7;
	
	//Hasta aqui funciona me falta un pasito mas 
	//Master Alterno
	
	
	
}
