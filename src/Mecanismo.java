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
	
	
	
	static int fila    		= 0;
	static int columna 		= 0;
	static int ficha   		= 2;
	static int verificar    = 1;
	static int indice		= 3;
	static int limiteInf    = 7;
	
	//Verificar Izquierda
	static int verificarIzq = 2;
	static int indiceIzq    = 5;
	static int limiteIzq    = 0;
	
	//Verifica Derecha
	static int verificarDer = 2;
	static int indiceDer    = 5;
	static int limiteDer    = 8;
	
	//Hasta aqui funciona me falta un pasito mas 
}
