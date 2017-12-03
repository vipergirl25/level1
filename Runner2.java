package level1;

public class Runner2 {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy", "Blue", "Boy");
		handy.eat();
		System.out.println(handy.getName());
		Smurf papa = new Smurf("Papa", "Blue", "Boy");
		papa.getHatColor();
		papa.isGirlOrBoy();
		Smurf smurfette = new Smurf("Katy", "Rainbow", "Girl");
		smurfette.getHatColor();
		smurfette.isGirlOrBoy();
	}
}
