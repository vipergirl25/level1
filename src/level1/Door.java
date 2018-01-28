package level1;

public class Door {
	public static void main(String[] args) {
		Door door = new Door();
		Key key = new Key("dungeon");
		door.openDungeon(key);
		new Door().openDungeon(new Key("dungeon"));
	}
	Door(){

	}
	boolean openDungeon(Key key) {
		if(key.roomname.equals("dungeon")) {
			return true;
		}
		else {
			return false;
		}
	}

}
class Key {
	String roomname;
	Key(String roomname){
		this.roomname = roomname;
	}
}