package ns222tv_assign1;

public class Square extends Rectangle {
	private int zel;

	
	public Square(String name , int zel) {
		super(name);
		this.zel = zel;
	}
		
	public int getZel() {
		return zel;
	}
	public void setZel(int zel) {
		this.zel = zel;
	}
	public double getArea() {
		return Math.pow(zel, 2);
		
	
		
		
	}
	@Override
	public double getPerimeter() {
				return 4*(zel);
	}
}
