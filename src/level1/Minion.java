package level1;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
    private String master;
    Minion (String name, int eyes, String color, String master){
    	this.name = name;
    	this.eyes = eyes;
    	this.color = color;
    	this.master= master;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public void setEyes(int eyes) {
    	this.eyes = eyes;
    }
    public void setMaster(String master) {
    	this.master = master;
    }
    public String getName() {
    	return this.name;
    }
    public String getColor() {
    	return this.color;
    }
    public int getEyes() {
    	return this.eyes;
    }
    public String getMaster() {
    	return this.master;
    }
}
