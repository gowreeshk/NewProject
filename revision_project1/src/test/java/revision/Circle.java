package revision;

public class Circle {

	private double radius;
	private String color;
	
	public Circle(double radius1,String color1) {
		radius=radius1;
		color=color1;
	}
	public Circle () {
		
	}
	public String getColor() {
		
		return color;
		}
	public double getRadius() {
		return radius;
		}
	public void setColor(String newColor) {
		this.color=newColor;
		
	}
	public void setRadious(double newRadius) {
		this.radius=newRadius;
	}
	public double calculateTheArea(double radius) {
		double area=radius*radius*Math.PI;
		return area;
	}
	public static int addition(int a, int b) {
		a=a+b;
		return a;
	}
}
