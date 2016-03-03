import java.util.Stack;

public class Mazo {
	private Stack<Carta> mazo;
	private int numCartas;
	
	public Mazo() {
		mazo = new Stack<Carta>();
		numCartas = 0;
	}
	
	public boolean valido(){
		if (numCartas < 60) return false;
		return true;
	}
	
	public void anyadirCarta(Carta c){
		mazo.push(c);
		numCartas++;
	}
	public Carta robarCarta(){
		numCartas--;
		return mazo.pop();
	}
	public void barajar(){
		Carta mazoArray[] = (Carta [])mazo.toArray();
		Stack<Carta> res = new Stack<Carta>();
		int x;
		while ( mazoArray.length > 0 ){
			x = (int)Math.random()*mazoArray.length; 		 // Cogemos una carta aleatoria del mazo original y la ponemos en res (30-31);
			res.push(mazoArray[x]);					 // los dos bucles for vuelven a juntar el mazo original.
			Carta aux[] = new Carta [mazoArray.length-1];
			for ( int i = 0; i < x ; i++ ){
				aux[i] = mazoArray[i];
			}
			for ( int i = x+1 ; i < mazoArray.length ; i++){
				aux[i-1] = mazoArray[i];
			}
			mazoArray = aux;
		}
		mazo = res;
	}
}
