import java.util.Stack;

public class Mazo {
	private Stack<Carta> mazo;
	
	public Mazo() {
		mazo = new Stack<Carta>();
	}
	
	public boolean valido(){
		if(mazo.size()>=60)return true;
		return false;
	}
	
	public void anyadirCarta(Carta c){
		mazo.push(c);
	}
	public Carta robarCarta(){
		return mazo.pop();
	}
	public void barajar(){
		Stack<Carta> res = new Stack<Carta>();
		int x;
		while ( !mazo.isEmpty() ){
			x = (int)Math.random() * mazo.size();
			res.push(mazo.get(x));
			mazo.remove(x);
		}
		mazo = res;
	}
}
