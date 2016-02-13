
public class Carta {
	private String nombre;
	private String coste;
	//private Image imagen;
	private String imagen;
	//private List<Habilidad> listaHabilidades;
	private String descripcion;
	private int ataque;
	private int defensa;

	public Carta(String nombre, String coste, String imagen, String descripcion, int ataque, int defensa) {
		this.nombre = nombre;
		this.coste = coste;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public String getNombre(){return nombre;}
	public void setNombre(String nuevoNombre){this.nombre = nuevoNombre;}
	
	public String getCoste(){return coste;}
	public void setCoste(String nuevoCoste){this.coste = nuevoCoste;}
	
	public String getImagen(){return imagen;}
	public void setImagen(String nuevoImagen){this.imagen = nuevoImagen;}
	
	public String getDescripcion(){return descripcion;}
	public void setDescripcion(String nuevoDescripcion){this.descripcion = nuevoDescripcion;}
	
	public int getAtaque(){return ataque;}
	public void setAtaque(int nuevoAtaque){this.ataque = nuevoAtaque;}
	
	public int getDefensa(){return defensa;}	
	public void setDefensa(int nuevoDefensa){this.defensa = nuevoDefensa;}
	
	public String toString(){ 
		return "Nombre: " + nombre + ", Coste: " + coste + ", Imagen: " + imagen + ", Descripcion: " + descripcion + ", Ataque: " + ataque + ", Defensa: " + defensa;
	}
	
	
	
}




