
public class Main {

	public static void main(String args []){
		
		Carta c1 = new Carta("Kozilek","13Incoloros","/image1","Hermano pequeño Emrakull",13,13);
		Carta c2 = new Carta("Emrakull","15incoloros","/image","Peta ortos",15,15);
		
		Carta c3 = new Carta("Kozilek","13Incoloros","/image1","Hermano pequeño Emrakull",13,13);
		Carta c4 = new Carta("Kozilek","13Incoloros","/image1","Hermano pequeño Emrakull",13,13);
		
		atacar(c1,c2);
		
		atacar(c3,c4);
		
	}
	
	public static void atacar(Carta c1, Carta c2 ){
		System.out.println(c1.getNombre() + " ataca a " + c2.getNombre());
		c2.setDefensa(c2.getDefensa()-c1.getAtaque());
		c1.setDefensa(c1.getDefensa()-c2.getAtaque());
		
		System.out.println(c1.getNombre() + ": " + c1.getAtaque() + "/" + c1.getDefensa());
		System.out.println(c2.getNombre() + ": " + c2.getAtaque() + "/" + c2.getDefensa());
		
		if (c1.getDefensa()<=0){
			System.out.println(c1.getNombre()+ " ha muerto");
		}
		if (c2.getDefensa()<=0){
			System.out.println(c2.getNombre()+ " ha muerto");
		}
		
	}
	
	
	
}
