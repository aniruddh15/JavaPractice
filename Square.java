

public class Square implements Colorable{
	
	int side;
	
	public Square() {
		side = 1;
	}
	
	public Square(int side) {
		this.side = side;
	}
	
	public String howToColor() {
		return "Color all four sides";
	}
}
