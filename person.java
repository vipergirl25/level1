package level1;

public class person {
	String hairColor;
	String eyeColor;
	String skinColor;
	String name;
	int weight;
	int height;
	person(String hairColor, String eyeColor, String skinColor, String name, int weight, int height){
		this.hairColor = hairColor;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public void walk(int distance) {
		System.out.println(this.name + " walks " + distance + " miles.");
	}
	public void eat(String meal) {
		System.out.println(this.name + " eats " + meal + ".");
	}
	public void makeFriend(String friendName) {
		System.out.println(this.name + " makes friends with " + friendName);
	}
	public static void main(String[] args) {
		person ice = new person("Gold", "Amber", "purple", "ice", 118, 63);
		ice.eat("Pizza");
	}


}
