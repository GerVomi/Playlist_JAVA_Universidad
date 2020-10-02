package paquetemus;

import java.io.IOException;
import java.util.LinkedList;

public class TestMusica {
	
	public static void main (String [] args) throws CancionNoEncontradaException, IOException  {
	
	Cancion track01 = new Cancion ("La noche","Luna","Ab",520);
	Cancion track02 = new Cancion ("xEl dia","Sol","Cueno",180);
	Cancion track03 = new Cancion ("zThe trooper","Diece of mind","Bed",320);
	Cancion track04 = new Cancion ("Juntos a la par","Blues","Dappo", 280);
	
	Playlist miPlay = new Playlist();
	miPlay.agregarCancion(track01);
	miPlay.agregarCancion(track02);
	miPlay.agregarCancion(track03);
	miPlay.agregarCancion(track04);
	
	
	
	miPlay.mostrarPlay();
	miPlay.cantCanciones();
	System.out.println("-------------------------------");
	miPlay.archivo();
	miPlay.removerCancion("La noche");
	miPlay.mostrarPlay();
	miPlay.cantCanciones();

	}
}
