package polymorphism1;

public class Driver {

	public static void main(String[] args) {
		Penguine pororo = new Penguine();
		
		pororo.name = "Pororo";
		pororo.habitat = "북 방 대 초 원";
		
		pororo.showName();
		pororo.showName("대 황 뽀 로 로");
		pororo.showHabitat();
		
		Animal pingu = new Penguine();
		
		pingu.name = "Pingu";
		pingu.showName();
	}

}
