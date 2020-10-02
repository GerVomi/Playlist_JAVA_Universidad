package paquetemus;

public class Cancion implements Comparable <Cancion> {
	
	


	private String titulo;
	private String album;
	private String interprete;
	private int duracion;
	
	public Cancion(String titulo, String album, String interprete, int duracion) {
		super();
		this.titulo = titulo;
		this.album = album;
		this.interprete = interprete;
		this.duracion = duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAlbum() {
		return album;
	}

	public String getInterprete() {
		return interprete;
		
	}

	public int getDuracion() {
		return duracion;
	}


	@Override
	public int compareTo(Cancion arg) {
		return this.interprete.compareTo(arg.getInterprete());
}
	
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", album=" + album + ", interprete=" + interprete + ", duracion="
				+ duracion + "]";
	}
	
}
