package level1;

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human dallas = new Human("Dallas");

		//2. create a new Robot army of good and evil robots.
		Robot tricia = new Robot("Tricia", true);
		Robot galen = new Robot("Galen", false);
		Robot anders = new Robot("Sam", false);
		Robot cavil = new Robot("Cavil", true);

		
		//3. command your robot army to destroy a human
		tricia.destroy(dallas);
		galen.destroy(dallas);
		anders.destroy(dallas);
		cavil.destroy(dallas);
	
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}
