package logica;

public class Carta {
	int ataque;//ataque de la carta
	int defensa;//defensa de la carta
	//habilidades especiales de la carta (prisa..)
	//List <Habilidades> listaHabilidades;

	public Carta(int ataque, int defensa){
		this.ataque = ataque;
		this.defensa = defensa;
	}
	public int getAtaque(){return ataque;}
	public void setAtaque(int nuevoAtaque){ataque=nuevoAtaque;}
	
}
