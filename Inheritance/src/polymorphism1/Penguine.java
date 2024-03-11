package polymorphism1;

public class Penguine extends Animal {
	public String habitat;
	
	public void showHabitat() {
		System.out.printf("%s는 %s에 산다.", name, habitat);
	}
	
	public void showName() {
		System.out.println("내 이름은 알려주지 못한다.");
	}
	
	public void showName(String yourName) {
		System.out.printf("ㅎㅇ %s, myName is %s.\n", yourName, name);
	}
}
