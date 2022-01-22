package ns222tv_assign1;

public class Circle extends Shape {
	private int radius;
	
	public Circle(String name ,int radius) {
		super(name);
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
		
	}
	public double getPerimeter() {
		return 2 *(Math.PI * radius);
		
	}
}
