package inheritance;

public class Driver {

	public static void main(String[] args) {
		Flyable fly1 = new Bat();
		fly1.fly();
		
		Flyable fly2 = new Champi();
		fly2.fly();
		
		Swimable[] bottles = new Swimable[2];
		bottles[0] = new Whale();
		bottles[1] = new Penguine();
		
		for(Swimable bottle : bottles) {
			bottle.swim();
		}
	}

}
