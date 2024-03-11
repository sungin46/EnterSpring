package inheritance03;

public class Driver {
	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.name = "뽀로로";
		pororo.habitat = "북방대초원";
		
		pororo.showName();
		pororo.showHabitat();
		
		Animal pingu = new Penguin();
		
		pingu.name = "핑구";
		
		pingu.showName();
	}
}
