package entities;

public class Rectangle implements Shape {

	private double Width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		Width = width;
		this.height = height;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
	  return Width * height;
	
	///// esse método é o que retorna a altura vezes a largura do retangulo///
	
	
	}
	

	
	
}
