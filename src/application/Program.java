package application;


import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		/////vamos fazer um método para retornar a soma das areas de uma lista 
		//de figuras.
		
		
		List<Shape> myShapes = new ArrayList<>();	
		myShapes.add(new Rectangle (3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		////List<Shape>esta chamando a lista da classe Shape

		
		List<Circle> myCircles = new ArrayList<>();
		
		
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		///List<Circle> esta chamando a lista da  classe Circle 
		
		////A interface criada na classe shape extends a classe circle e rectangle a figura Shape
		
		System.out.println("Total area : " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
	
		////para o compilador aceitar criar os supertipos de lista é preciso delimitar os curingas
		//// criando List<? extends Shape> list esse método pode ser de Shape ou de qualquer tipo
		/// de subtipo de Shape
		
	double sum = 0.0;
	for(Shape s : list) {
		sum += s.area();
		
	}
    return sum;
}
}