package fiuba.algo3.algoFormers.vista.botones.direcciones;

import fiuba.algo3.algoFormers.modelo.juego.Juego;
import fiuba.algo3.algoFormers.vista.contenedores.ContenedorTablero;
import fiuba.algo3.algoFormers.modelo.direcciones.DirArribaDer;

public class BotonDireccionArribaDerecha extends BotonDireccion {
	
	private final static String imagen = "file:src/fiuba/algo3/algoFormers/vista/imagenes/ArribaDerecha.png";
	
	public BotonDireccionArribaDerecha(Juego juego, ContenedorTablero tablero){
		super(juego, new DirArribaDer(), imagen, tablero);
	}
	
}
