package inheritance2;

public class Driver {

	public static void main(String[] args) {
		Penguine pororo = new Penguine();
		
		pororo.name = "뽀로로";
		pororo.habitat = "남극";
		
		pororo.showName();
		pororo.showHabitat();
		
		Animal pingu = new Penguine();
		
		pingu.name = "핑구";
//		pingu.habitat = "EBS";
		
		pingu.showName();
		
		
	}

}
