package ns222tv_assign1;

public class Rectangle extends Shape {
private int lenght;
private int width;

	public Rectangle(String name) {
		super(name);
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public Rectangle (String name , int lenght , int width) {
		super (name );
		this.lenght= lenght;
		this.width=width;
	
	}
	public int getLenght() {
		return lenght;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	public double getArea() {
		return lenght * getWidth();
		
	}
	public double getPerimeter() {
		return 2 *(lenght+ getWidth());
		
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	}
	
	