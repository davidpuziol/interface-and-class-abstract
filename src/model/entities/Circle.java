package model.entities;

import model.enums.Color;
/*
 * Essa Classe herda de AbstractShape nesse caso a cor, mas e obrigado a reescrever o metodo area() 
 * Pois a classe AbstractShape tem a obrigacao de implementar o metodo area() da interface Shape
*/

public class Circle extends AbstractShape {

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
