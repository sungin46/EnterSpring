package inheritance2;

public class Penguine extends Animal{
	public String habitat;
	
	public void showHabitat() {
		System.out.printf("%s는 %s에 살아.", name, habitat);
	}
}
