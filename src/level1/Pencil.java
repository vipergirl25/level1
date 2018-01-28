package level1;

public class Pencil {
	boolean isSharpened;
	Pencil(boolean isSharpened){
		this.isSharpened=false;
	}
	void sharpen() {
		isSharpened=true;
	}
	public static void main(String[] args) {
		new Pencil(false).sharpen();
	}
}
