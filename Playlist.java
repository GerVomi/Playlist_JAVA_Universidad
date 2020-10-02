package paquetemus;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Playlist {
	
	private LinkedList <Cancion> play;

	public Playlist() {
		this.play=new LinkedList<Cancion>();
	}
	
		
	public void agregarCancion(Cancion p) {
		play.add(p);
	}
	
	public  void cantCanciones() {
		System.out.println("La cantidad de canciones es de "+play.size());
	}
	
	public void segundosTotales () {
	int sum = 0;	
	
Iterator <Cancion> it = play.iterator();
		
		while (it.hasNext()){
			
		sum += it.next().getDuracion();
		
		
		}
		System.out.println("Los segundos totales son "+sum);
	}
	
	public void archivo() throws IOException {
		LinkedList <Cancion> interpretesOrdenados = new LinkedList<Cancion>();
		for (Cancion p : this.play) {
			interpretesOrdenados.add(p);
		}
		Collections.sort(interpretesOrdenados);
		
		
		
		
		PrintWriter salida=new PrintWriter(new FileWriter("InterpretesOrdenados.txt"));
		Iterator<Cancion> it = interpretesOrdenados.iterator();
		
		while (it.hasNext()) {
			Cancion temp = it.next();
			salida.println(temp);
		}
		
		salida.close();
	}
	
	
	
	
	public void removerCancion(String titulo) throws CancionNoEncontradaException  {
		Iterator <Cancion> it = play.iterator();
		boolean noEncontrado = false;
		int temp = play.size();
		
		
		
		while (it.hasNext()){
			
			if(it.next().getTitulo()==titulo) {
			
			     
				it.remove();
				noEncontrado=true;
		
				
			}
			if(noEncontrado==false) {
				throw new CancionNoEncontradaException("Cancion no encontrada");
			}
		
		}
	
		
	}
	
	public void mostrarPlay() {
		for (Cancion cancion : play) {
			System.out.println(cancion);
		}
	
	}
	

}
